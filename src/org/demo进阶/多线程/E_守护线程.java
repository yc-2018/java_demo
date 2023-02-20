//仰晨study 创建时间2023/2/6 18:40 星期一
package org.demo进阶.多线程;

public class E_守护线程 {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.setName("女神");
        t2.setName("备胎");

        t2.setDaemon(true);     //把第二个线程设置为守护线程(备胎线程)

        t1.start();
        t2.start();
    }
}


class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=10;i++) {
            System.out.println(getName()+"——"+i);
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 1;i<=100;i++) {
            System.out.println(getName()+"——"+i);
        }
    }
}