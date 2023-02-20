package org.demo进阶.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 练习2概率点名器 {
    public static void main(String[] args) {
        /*班级里有N个学生
        *要求:
        *   70%的概率随机到男生
        *   30%的概率随机到女生
        *
        * "范闲","范建”,"范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰"
        * "杜琦燕","袁明媛","李猜","田蜜蜜"，
        * */
        //自己想法   创建数组【10】  随机 0-6为男 7-9为女

        //老师代码--：

        //定义数组
        ArrayList<Integer> list = new ArrayList<>();

        //添加数据
        Collections.addAll(list,1,1,1,1,1,1,1); //男
        Collections.addAll(list,0,0,0);

        //打乱集合中的数据
        Collections.shuffle(list);

        //从list集合中随机抽取0或者1.........(都打乱了  直接那0索引不一样吗...
        Random random = new Random();
        int i = random.nextInt(list.size());
        Integer number = list.get(i);
        System.out.println(number);

        //创建两个集合分别存储男生和女生的名宁
        ArrayList<String> boyList = new ArrayList<>();
        ArrayList<String> girlList = new ArrayList<>();

        Collections.addAll(boyList,"范闲","范建","范统","杜子腾","宋合泛","侯笼藤","朱益群","朱穆朗玛峰");
        Collections.addAll(girlList, "杜琦燕", "袁明媛", "李猜", "田蜜蜜");

        //判断此时是从boyList里面抽取还是从girlList里面抽取
        if (number == 1) {
            int boyIndex = random.nextInt(boyList.size());
            String name = boyList.get(boyIndex);
            System.out.println(name);
        }else {
            int girlIndex = random.nextInt(girlList.size());
            String name = girlList.get(girlIndex);
            System.out.println(name);
        }
    }
}
