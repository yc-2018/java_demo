//仰晨study 创建时间2023/2/7 16:37 星期二
package org.demo进阶.多线程;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class K_Lock锁 {/*
虽然我们可以理解同步代码块和同步方法的锁对象问题
但是我们并没有直接看到在哪里加上了锁，在哪里释放了锁
为了更清晰地表达如何加锁和释放锁，JDK5以后提供了一个新的 锁对象Lock

Lock实现提供比使用synchronized方法和语句可以获得更广泛的锁定操作
Lock中提供了获得锁和释放锁的方法
    void lock():获得锁
    void unlock(): 释放锁
    ———————————————————手动上锁、手动释放锁————————————————


Lock是接口不能直接实例化这里采用它的实现染ReentrantLock来实例化
ReentrantLock的构造方法
ReentrantLock():创建一个ReentrantLock的实例
*/

    public static void main(String[] args) {
        MyThread_ t1 = new MyThread_();
        MyThread_ t2 = new MyThread_();
        MyThread_ t3 = new MyThread_();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread_ extends Thread{
    static int ticket = 0;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();//上锁————————————————————————
            try {
                if (ticket == 100) {
                    break;
                } else {
                    Thread.sleep(10);
                    System.out.println(getName() + "在卖第" + (++ticket) + "张票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();//开锁——————————————————————这样子的好处  就算break了 都会执行开锁

                Thread.yield();//礼让一下更均匀
            }
        }
    }
}