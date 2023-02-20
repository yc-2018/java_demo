package org.demo进阶.方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 引用静态方法 {
    public static void main(String[] args) {
        /*练习:
            集合中有以下数字，要求把他们都变成int类型“1”“2”“3”“4”“5"*/
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"1", "2", "3", "4", "5");


        // 1.方法需要已经存在
        // 2.方法的形参和返回值需要跟抽象方法的形参和返回值保持一致
        // 3.方法的功能需要把形参的字符串转换成整数
        list.stream()
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
