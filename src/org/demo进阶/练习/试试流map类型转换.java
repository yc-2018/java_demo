package org.demo进阶.练习;

import java.util.ArrayList;
import java.util.Collections;

public class 试试流map类型转换 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1", "2", "3", "4", "5");

        list.stream().map(s -> s+1).forEach(System.out::println);       //stream().map 真的可以改变值
    }
}
