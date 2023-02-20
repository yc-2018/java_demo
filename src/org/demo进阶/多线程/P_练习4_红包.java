//仰晨study 创建时间2023/2/8 19:20 星期三
package org.demo进阶.多线程;

import java.util.Random;

public class P_练习4_红包 {
    /*
            微信中的抢红包也用到了多线程。
            假设：100块，分成了3个包，现在有5个人去抢。
            其中，红包是共享数据。
            5个人是5条线程。
            打印结果如下：
            	XXX抢到了XXX元
            	XXX抢到了XXX元
            	XXX抢到了XXX元
            	XXX没抢到
            	XXX没抢到
        */
    public static void main(String[] args) {
        //创建线程的对象
        MyThread__1 t1 = new MyThread__1();
        MyThread__1 t2 = new MyThread__1();
        MyThread__1 t3 = new MyThread__1();
        MyThread__1 t4 = new MyThread__1();
        MyThread__1 t5 = new MyThread__1();

        //给线程设置名字
        t1.setName("ikun");
        t2.setName("苏珊");
        t3.setName("小黑子");
        t4.setName("只因");
        t5.setName("小荔枝");

        //启动线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}

class MyThread__1 extends Thread {//因为红包是带小数点的  不精确要JDK17才有收集浮点数，精确要用BigDecimal 老师就说了这两种方法
    //但是我想到了保留两位小数的话其实可以就用整数*100  输出在/100.0
    private static int money =1*100;
    private static int count = 3;

    private static final int MIN = 1;

    @Override
    public void run() {
        synchronized (MyThread__1.class) {
            if (count == 0) {
                System.out.println(getName()+" 没有抢到红包");
            } else {
                //中奖金额
                int prize=money;   //if（count==1）就是你了
                if ((count--) != 1){
                    Random r = new Random();
                    prize=r.nextInt(money - (MIN * count)); //拿到最大值的话还要留每人一分钱的哇  因为随机数是不包括参数这个值的所以应该还有小小偏差
                    //prize = r.nextDouble()+r.nextInt((int) money-1);     //带参数的随机浮点数JDK17才出来//那就自己想办法
                    prize= Math.max(prize, MIN);                    //如果随机出来的比一分钱还小就变成一分钱
                    money-=prize;               //剩下的钱进行更新
                }
                System.out.println(getName() + "抢到了" + prize/100.0 + "元");
            }
        }
    }
}