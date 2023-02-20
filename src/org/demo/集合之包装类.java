package org.demo;

import java.util.ArrayList;

public class 集合之包装类 {
    public static void main(String[] args) {
        /*
        *   基本数据类型对应的包装类
            byte            Byte
            short           Short
            char            Character
            int             Integer
            long            Long
            float           Float
            double          Double
            boolean         Boolean
        * *///创建集合，泛型为Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        // 添加元素
        // JDK5后int 好人Integer 可以相互转化
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        //遍历集合
        System.out.print("《");
        for (int i = 0; i < list.size(); i++) {
            if (i!=list.size()-1){
                System.out.print(list.get(i)+"，");
            }else {
                System.out.print(list.get(i));
            }
        }
        System.out.println("》");
        //运行结果《1，2，3，4，5》

        // 逝世字符的
        ArrayList<Character> list1 = new ArrayList<>();
        list1.add('A');
        list1.add('B');
        list1.add('C');
        list1.add('D');
        list1.add('E');
        System.out.print("<<<");
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(i == list1.size() - 1 ? list1.get(i) : list1.get(i)+",");
        }
        System.out.println(">>>");
        // 运行结果 <<<A,B,C,D,E>>>
    }
}
