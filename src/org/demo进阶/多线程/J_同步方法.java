//仰晨study 创建时间2023/2/7 14:38 星期二
package org.demo进阶.多线程;

public class J_同步方法 {//线程安全

    /*
    同步方法
    就是把synchronized关键字加到方法上

    格式:
        修饰符 synchronized 返回值类型 方法名(方法参数) {...}

        特点1: 同步方法是锁住方法里面所有的代码
                            /——-非静态:this
        特点2:锁对象不能自己指定
                            \___静态:当前类的字节码文件对象

     */
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr, "窗口1");
        Thread t2 = new Thread(mr, "窗口2");
        Thread t3 = new Thread(mr, "窗口3");

        t1.start();
        t2.start();
        t3.start();

    }


    static class MyRunnable implements Runnable {
        int ticket = 0;   //不用静态是因为这种方法 只有一个MyRunnable对象

        @Override
        public void run() {
            //1.循环
            //2.同步代码块(同步方法)
            //3.判断共享数据是否到了末尾，如果到了末尾
            //4.判断共享数据是否到了末尾，如果没有到末尾

            while (true) {
                if (method()) break;
                //Thread.yield();   //礼让一下很均匀
            }


        }

        private synchronized boolean method() {

            if (ticket == 100)
                return true;
            else
                try {
                    Thread.sleep(10);   //这个方法是带锁的  睡觉别人也进不来
                    System.out.println(Thread.currentThread().getName() + "在卖第" + (++ticket) + "张票");
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }

            return false;
        }
    }
}
interface  StringBuilder和StringBuffer的区别 {
        //将 StringBuilder 的实例用于多个线程是不安全的。如果需要这样的同步，则建议使用 StringBuffer。
        //StringBuffer和StringBuilder方法都是一样的但是StringBuilder的方法都带有synchronized关键字（同步方法）

    }
