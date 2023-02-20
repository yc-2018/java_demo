package org.demo进阶.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 练习3不重复点名器 {
    public static void main(String[] args) {
        /*班级里有N个学生
            要求:
            被点到的学生 不会再被点到。
            但是如果班级中所有的学生都点完了
            需要重新开启第二轮点名*/

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "范闲", "范建", "范统", "杜子腾", "宋合泛", "侯笼藤", "朱益群", "朱穆朗玛峰", "杜琦燕", "袁明媛", "李猜", "田蜜蜜");

        //自己的想法
        for (int i = 1; i <= 2; i++) {  //需要重新开启第二轮点名
            System.out.println("----------第" + i + "轮-------------");
            Collections.shuffle(list);  //每一轮先洗牌
            int count = 1;
            for (String s : list) {     //按打乱的顺序点名
                System.out.println("第" + count + "次点到的是：" + s);
                count++;
            }
        }

        System.out.println("///////////////////老师方法--------------------------///////////");
        //创建一个临时的集合，用来存已经被点到学生的名字
        ArrayList<String> list1 = new ArrayList<>();
        //外循环:表示轮数
        for (int i = 1; i < 3; i++) {
            System.out.println("=========第"+ i +"轮点始了======================");
            //3.获取集合的长度
            int count = list.size();
            //4.随机点名
            Random r = new Random();
            //内循环: 每一轮中随机循环抽取的过程
            for (int j = 0; j < count; j++) {               //这里感觉用while(list.size()>0)好一点  根本就没有用到j
                int index = r.nextInt(list.size());
                String name = list.remove(index);
                list1.add(name);
                System.out.println(name);
            }
            //此时表示一轮点名结束
            //list 空了 list1 12个学生的名宁
            list.addAll(list1);
            list1.clear();

        }
    }
}
