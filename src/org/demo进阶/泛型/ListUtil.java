package org.demo进阶.泛型;

import java.util.ArrayList;

abstract public class ListUtil {
    //定义一个工具类: ListUtil
    //类中定义一个静态方法addAlL，用来添加多个集合的元素

    public static <E> void addAll(ArrayList<E> list, E...e) {      // E...e  集合形式传值
        for (E element : e) {
            list.add(element);
        }
    }
}
