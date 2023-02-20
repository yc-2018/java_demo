//仰晨study 创建时间2023/2/6 19:33 星期一
package org.demo进阶.多线程;

public class F_礼让线程 {//出让线程/礼让线程-----目的是想让线程更加均匀自行

    public static void main(String[] args) {
        MyThread3 t1 = new MyThread3();
        MyThread3 t2 = new MyThread3();

        t1.setName("//////kk1号");
        t2.setName("#####Ikun2号");      //如果同名也没影响

        t1.start();
        t2.start();
    }
}


class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"@"+i);
            Thread.yield();
        }

    }
}