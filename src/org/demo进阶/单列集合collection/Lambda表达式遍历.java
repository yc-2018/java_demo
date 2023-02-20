package org.demo进阶.单列集合collection;/*
得益于JDK 8开始的新技术Lambda表达式，提供了一种更简单、更直接的遍历集合的方式。   //数组是不可以的
default void forEach(Consumer<? super T> action):   结合lambda遍历集合
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

public abstract class Lambda表达式遍历 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("ikun");
        coll.add("苏珊");
        coll.add("荔枝");

        //2.利用匿名内部类的形式
            //底层原理:
            // 其实也会自己遍历集合，依次得到每一个元素
            // 把得到的每一个元素，传递给下面的accept方法
            // s依次表示集合中的每一个数据
        coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                //s依次表示集合中的每一个数据
                System.out.println(s+" 油饼？");
            }
        });

        //lambda表达式
        coll.forEach(s -> System.out.println(s+" 香精煎鱼？"));

    }
}
