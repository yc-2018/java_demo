package org.demo进阶.stream流;

import java.util.ArrayList;
import java.util.Collections;

public class 单列集合获取stream流 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "荔枝", "虾头", "苏珊", "树枝", "Ikun", "真正的man");
        list.stream().forEach(str -> System.out.println(str));//s:依次表示流水线上的每一个数据
    }
}
