//仰晨study 创建时间2023/2/6 21:21 星期一
package org.demo进阶.多线程;

public class G_插入线程 {//public final void join() 插入线程/插队线程

    public static void main(String[] args) throws InterruptedException {
        MyThread4 t = new MyThread4("坤头");
        MyThread4 t1 = new MyThread4("坤尾");
        t.start();
        t.join();       //顺序不能乱  要在start后面写


        //当前线程: main线程
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程"+i);
        }

        //表示把t这个线程，插入到当前线程之前。


        t1.start();




    }
}

class MyThread4 extends Thread {

    public MyThread4(String name) {
        super(name);}


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName()+"@"+i);
        }
    }
}