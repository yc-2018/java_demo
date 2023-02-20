package org.douDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;


public class PokerGame {
    static private final ArrayList<Double> list=new ArrayList<>();
    static private final HashMap<Double, String> hm = new HashMap<>();
    //准备牌
        // 静态代码块
        // 特点: 随着类的加载而在加载的，而且只执行一次。
    static {
        String[] color = {"♦", "♣", "♥", "♠"};
        String[] number = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        double num=2.4;
        for (String n : number) {
            num=num+0.6;
            for (String c : color) {
                num+=0.1;
                list.add(num);
                hm.put(num,c + n);
            }
        }
        list.add(100.1);
        hm.put(100.1,"小王");
        list.add(100.2);
        hm.put(100.2,"大王");
        System.out.println(list);
    }



    public PokerGame(){

        //洗牌
        Collections.shuffle(list);
        //System.out.println(list);

        //发牌
        TreeSet<Double> player1 = new TreeSet<>();
        TreeSet<Double> player2 = new TreeSet<>();
        TreeSet<Double> player3 = new TreeSet<>();
        TreeSet<Double> lord = new TreeSet<>();     //翻译：主    地主才有底牌

        for (int i = 0; i < list.size(); i++) {
            double poker = list.get(i);
            //要地主的留出三张
            if (i < 3)
                lord.add(poker);

            //给三个玩家轮流发牌         //其实轮流发和堆堆发一样的zhe
            else if (i%3==0)
                player1.add(poker);

            else if (i % 3 == 1)
                player2.add(poker);

            else
                player3.add(poker);
        }

        //看牌


        lookPoker("ikun", player1);
        lookPoker("仰晨", player2);
        lookPoker("小黑子", player3);
        lookPoker("底牌",lord);
    }

    /*
    * 参数一: 玩家的名字
    * 参数二:每位玩家的牌
    * */
    private void lookPoker(String name, TreeSet<Double> list) {
        System.out.print(name+":");
        list.forEach(s -> System.out.print(hm.get(s)+"  "));
        System.out.println();
    }


}
