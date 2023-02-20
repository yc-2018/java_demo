//仰晨study 创建时间2023/2/8 17:37 星期三
package org.demo进阶.多线程;

public class P_练习1_卖票 {//自行完成
    /*(学生自己练习)
    一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒
    要求:请用多线程模拟卖票过程并打印剩余电影票的数量
    */
    public static void main(String[] args) {
        Window t1 = new Window("窗口1");
        Window t2 = new Window("窗口2");

        t1.start();
        t2.start();

    }
}

class Window extends Thread {
    private static  Integer count = 1000;

    public Window(String name){
        super(name);

    }

    @Override
    public void run() {
        while (true) {
            synchronized (Window.class) {
                if (count == 0) {
                    break;
                }else {
                    System.out.println(getName()+" 卖了1张票 余票还剩："+(--count));
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }
}