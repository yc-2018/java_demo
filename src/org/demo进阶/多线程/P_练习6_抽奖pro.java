//仰晨study 创建时间2023/2/9 0:56 星期四
package org.demo进阶.多线程;

import java.util.ArrayList;
import java.util.Collections;

public class P_练习6_抽奖pro {
    /*
            有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
            创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
            随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
            每次抽的过程中，不打印，抽完时一次性打印(随机)    在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
                分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
            在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
                分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元
        */
    public static void main(String[] args) {
        //创建奖池
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,10,5,20,50,100,200,500,800,2,80,300,700);

        //创建线程
        _MyThread t1 = new _MyThread(list);
        _MyThread t2 = new _MyThread(list);

        //设置名字
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");

        //启动线程
        t1.start();
        t2.start();
    }
}

class _MyThread extends Thread{

    ArrayList<Integer> list;

    public _MyThread(ArrayList<Integer> list) {
        this.list = list;
    }

    //线程一
    static ArrayList<Integer> list1 = new ArrayList<>();
    //线程二
    static ArrayList<Integer> list2 = new ArrayList<>();
    //上面这样有多少线程就要创建多少个list很不好
    //还有一个更简单的方法能应付更多的线程   就是把list写在run方法里面 循环外面 每启动一条线程就会自动new一个list
    //                                 还不用判断是"抽奖箱1"还是"抽奖箱2"因为都在自己线程里面的，就很nice 这就不写了 在下一个练习这样子写


    @Override
    public void run() {
        while (true) {
            synchronized (MyThread.class) {
                if (list.size() == 0) {
                    if("抽奖箱1".equals(getName())){

                        System.out.println("抽奖箱1 总共产生了"+list1.size()+"个奖项" + list1+
                                "最高奖项为"+Collections.max(list1)+"元，总计额为"+getSum(list1)+"元");
                    }else {
                        System.out.println("抽奖箱2 总共产生了"+list2.size()+"个奖项" + list2+
                                "最高奖项为"+Collections.max(list2)+"元，总计额为"+getSum(list2)+"元");
                    }
                    break;
                } else {
                    //继续抽奖
                    Collections.shuffle(list);
                    int prize = list.remove(0);
                    if("抽奖箱1".equals(getName())){
                        list1.add(prize);
                    }else {
                        list2.add(prize);
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    private Integer getSum(ArrayList<Integer> list) {
        //不想清空本来的集合
        ArrayList<Integer> listSun = new ArrayList<>(list);
        return sum(listSun);
    }
    private Integer sum(ArrayList<Integer> list) {
        if(list.size() == 0) return 0;
        return list.remove(0)+sum(list);
    }
}
