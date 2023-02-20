//仰晨study 创建时间2023/2/7 4:01 星期二
package org.demo进阶.多线程;

public class I_同步代码块 {//线程安全
    /*练习————线程安全的问题
            需求:
                某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票

              同步代码块
                把操作共享数据的代码锁起来
                        特点1: 锁默认打开，有一个线程进去了，锁自动关闭
                        特点2: 里面的代码全部执行完毕，线程出来，锁自动打开
      格式:
            synchronized (锁){                   //锁可以是很随意的东西  但是如果每个线程都是不同的锁 那么锁就没有意义
                                                //所以可以随便写一个静态的object放进去就好
                                               //但是一般直接用 类名.class 放进去 因为类也是唯一的
                        操作共享数据的代码
            }
     */
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        MyThread5 t2 = new MyThread5();
        MyThread5 t3 = new MyThread5();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread5 extends Thread {
    private static int ticket = 0;  //0~99  //表示这个类所有的对象，都共享ticket数据
    //锁对象，一定要是唯一的
    private static final Object obj = new Object();

    @Override
    public void run() {

        while (true) {
            //同步代码块————一定要在循环的里面  在外面的话 第一个抢到的线程就全部执行完了
            //synchronized (MyThread5.class) {
            synchronized (obj) {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);       //----------在锁里面睡觉 别人抢到CPU也进不来   因为锁还没开
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //ticket++;
                    System.out.println(getName() + "正在卖第" + (++ticket) + "张票！！！");
                } else break;
            }
        }
    }
}