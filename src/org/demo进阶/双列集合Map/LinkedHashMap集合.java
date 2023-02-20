package org.demo进阶.双列集合Map;

import java.util.LinkedHashMap;

public class LinkedHashMap集合 {
    public static void main(String[] args) {

        /*
        * 由键决定:<有序>、不重复、无索引
        * 这里的有序指的是保证存储和取出的元素顺序一致
        * 原理:底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序，
        * */
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("aaa", 111);
        lhm.put("aaa", 666);
        lhm.put("bbb", 222);
        lhm.put("ccc", 333);

        System.out.println(lhm);    //{aaa=666, bbb=222, ccc=333}   # 有序
    }
}
