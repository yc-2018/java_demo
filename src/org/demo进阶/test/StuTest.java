package org.demo进阶.test;

import java.util.Collections;
import java.util.HashSet;

public class StuTest {
    public static void main(String[] args) {
//        var stu = new Stu("ikun",23);
//
//        int len = stu.nameLen();
//        System.out.println(len);
//
//
//
//        HashSet<String> set = new HashSet<>();
//        Collections.addAll(set, "stu", "ikun", "苏珊");
//        for (var s : set) {
//            System.out.println(s.getClass());
//        }


        ListNode listNode = new ListNode(8);
        ListNode next = listNode.next;
        System.out.println(next);
    }
}
 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}