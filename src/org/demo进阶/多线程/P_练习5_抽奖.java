//仰晨study 创建时间2023/2/9 0:43 星期四
package org.demo进阶.多线程;

import java.util.ArrayList;
import java.util.Collections;

public class P_练习5_抽奖 {
    /*
            有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
            创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
            随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
                             每次抽出一个奖项就打印一个(随机)
            	抽奖箱1 又产生了一个 10 元大奖
            	抽奖箱1 又产生了一个 100 元大奖
            	抽奖箱1 又产生了一个 200 元大奖
            	抽奖箱1 又产生了一个 800 元大奖
            	抽奖箱2 又产生了一个 700 元大奖
            	.....
        */
    public static void main(String[] args) {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建线程
        My_Thread_ t1 = new My_Thread_(list);
        My_Thread_ t2 = new My_Thread_(list);

        //设置名字
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        //启动线程
        t1.start();
        t2.start();
    }

}


class My_Thread_ extends Thread {
    private ArrayList<Integer> list;

    public My_Thread_(ArrayList<Integer> list){
        this.list=list;
    }

    @Override
    public void run() {
        //1.循环
        //2.同步代码块
        //3.判断
        //4.判断

        while (true) {
            synchronized (My_Thread_.class) {
                if (list.size() == 0) {
                    break;
                } else {
                    Collections.shuffle(list);
                    Integer prize = list.remove(0);
                    System.out.println(getName()+"又产生了一个" + prize + "元大奖");
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}