package org.demo进阶.stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class 练习1过滤数 {
    /*定义一个集合，并添加一些整数1, 2,3,4,5,6,7, 8,9,10
    过滤奇数，只留下偶数
    并将结果保存起来*/
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> newList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
