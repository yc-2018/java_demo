//仰晨study 创建时间2023/2/6 18:08 星期一
package org.demo进阶.多线程;

public class D_线程优先级 {//抢占式调度//随机
    /*方法名称                            说明
setPriority(int newPriority)        设置线程的优先级
final int getPriority()             获取线程的优先级
*/
    public static void main(String[] args) {
        System.out.println("main线程的默认优先级是"+Thread.currentThread().getPriority());

        MyThread_1 t1 = new MyThread_1();
        MyThread_1 t2 = new MyThread_1();

        t1.setName("--树枝");
        t2.setName("荔枝--");

        t1.setPriority(10);     //优先级最高是10   最低是1    默认是5     注意：优先级高也不一定最快完成也是有小概率最后完成的
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}


class MyThread_1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println(Thread.currentThread().getName()+i);

        }
    }
}