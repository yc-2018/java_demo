package org.demo进阶.方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.IntFunction;

public class Other引用数组的构造函数 {
    public static void main(String[] args) {
        /* 格式
         *     数据类型[]::new
         * 目的:
         *     创建一个指定类型的数组
         * 需求:
         *     集合中存储一些整数，收集到数组当中
         *
         * 细节：
         *     数组的类型，需要跟流中数据的类型保持一致
         */

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6);

        //————————————————收集到数组————————————————
        /*Object[] objects = list.stream().toArray();
        System.out.println(Arrays.toString(objects));*/

        //——————先看看本来的面目——————
        /*Integer[] array = list.stream().toArray(new IntFunction<Integer[]>() {
            @Override
            public Integer[] apply(int value) {
                return new Integer[value];
            }
        });
        System.out.println(Arrays.toString(array));*/


        //——————再看看变身后的样子——————
        Integer[] array = list.stream().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));

    }
}
