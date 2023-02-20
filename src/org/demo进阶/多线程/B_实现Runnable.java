//仰晨study 创建时间2023/2/6 2:44 星期一
package org.demo进阶.多线程;/*
多线程的第二种启动方式:
                    1.自己定义一个类实现Runnable接口
                    2.重写里面的run方法
                    3.创建自己的类的对象
                    4.创建一个Thread类的对象，并开启线程
*/

public class B_实现Runnable {
    public static void main(String[] args) {
        MyRun mr = new MyRun();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(() -> System.out.println(Thread.currentThread().getName() +" 小黑子出现  直接匿名内部类——>Lambda"));
        Thread t4 = new Thread(mr,"Ikun218号");

        t1.setName("ikun一号");
        t2.setName("ikun二号");
        t3.setName("ikun三号");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }

}

class MyRun implements Runnable {
    @Override
    public void run() {
        //书写线程要执行代码

        //获取到当前线程的对象(因为没有继承 所以没有.getName() 所以要先拿到Thread对象再调用
        //Thread t = Thread.currentThread();
        for (int i = 0; i < 20; i++)
            System.out.println(Thread.currentThread().getName() +" hello world");
    }
}
