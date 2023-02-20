//仰晨study 创建时间2023/2/6 2:33 星期一
package org.demo进阶.多线程;/*
多线程的第一种启动方式:
                    1.自己定义一个类继承Thread
                    2.重写run方法
                    3.创建子类的对象，并启动线程
*/

public class A_继承Thread {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        MyThread t4 = new MyThread("ikun218号");     //要写构造


        t1.setName("ikun一号");
        t2.setName("ikun二号");

        t1.start();
        t2.start();
        t3.start(); //没设置名字也会有默认名字Thread-x  x从0开始
        t4.start();
    }
}


class MyThread extends Thread{
    public MyThread() {}

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        //书写线程要执行代码
        for (int i = 0; i < 20; i++) {
            System.out.println(getName() + "helloWorld"+getId());
        }
    }
}