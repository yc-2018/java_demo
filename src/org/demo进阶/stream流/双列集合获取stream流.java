package org.demo进阶.stream流;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class 双列集合获取stream流 {
    //无法直接使用stream流
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("两年半", 25);
        hm.put("你干嘛", 11);
        hm.put("树枝", 666);
        hm.put("苏珊", 167);

        //第一种获取stream流
        hm.keySet().stream().forEach(s -> System.out.println(s + "——>" + hm.get(s)));

        //第二种获取stream流
        hm.entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+"==>"+entry.getValue()));



    }
}
