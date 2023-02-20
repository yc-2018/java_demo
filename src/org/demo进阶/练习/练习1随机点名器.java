package org.demo进阶.练习;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class 练习1随机点名器 {
    public static void main(String[] args) {
        /*
        *班级里有N个学生
        *               实现随机点名器。
        * */
        //定义数组
        ArrayList<String> list = new ArrayList<>();

        //添加数据
        Collections.addAll(list,"范闲","范建","范统","杜子腾","杜琦燕","宋合泛","侯笼藤","朱益群","朱穆朗码峰","袁明媛");

        //随机点名111
        Random random = new Random();
        int i = random.nextInt(list.size());
        System.out.println(list.get(i));

        //随机点名222---打乱数组
        Collections.shuffle(list);
        System.out.println(list.get(0));
    }
}
