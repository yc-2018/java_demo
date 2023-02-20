//仰晨study 创建时间2023/2/8 17:58 星期三
package org.demo进阶.多线程;

public class P_练习2_送礼 {
    /*(学生自己练习 )
    有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出。
    利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来*/
    public static void main(String[] args) {
        gift run = new gift();
        Thread t1 = new Thread(run, "ikun");
        Thread t2 = new Thread(run, "苏珊");

        t1.start();
        t2.start();
    }
}

class gift implements Runnable {
    private int giftCount=100;
    @Override
    public void run() {
        while (true) {
            synchronized (gift.class) {
                if (giftCount < 10) {
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName()+"送出一份礼物 还剩"+(--giftCount)+"份");
                }
            }Thread.yield();
        }
    }
}
