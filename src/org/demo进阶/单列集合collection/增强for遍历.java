package org.demo进阶.单列集合collection;/*
增强for的底层就是迭代器，为了简化迭代器的代码书写的。
它是JDK5之后出现的，其内部原理就是一个Iterator迭代器
所有的《单列集合》和《数组》才能用增强for进行遍历。

格式
    for (元素的数据类型 变量名 :数组或者集合){}

    快速生成方式:
        集合的名字 + .for 回车
*/

import java.util.ArrayList;
import java.util.Collection;

public class 增强for遍历 {
    public static void main(String[] args) {
        //1.创建集合并添加元素
        Collection<String> coll = new ArrayList<>();
        coll.add("ikun");
        coll.add("苏珊");
        coll.add("荔枝");

        //2.利用增强for进行遍历
        //注意点:
        //s其实就是一个第三方变量，在循环的过程中依次表示集合中的每一个数据----《《《s改变不会影响到数组里面的元素》》》
        for (String s : coll) {
            System.out.println(s);
            s = "我的改变，其实改变不了任何东西";
        }
        System.out.println(coll);


        //-------数组也试试---------
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i : arr) {
            System.out.print(i);
        }
    }
}
