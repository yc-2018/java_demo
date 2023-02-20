package org.demo进阶.练习;

import java.util.Objects;

public class 试试equals {
    public static void main(String[] args) {
        String s =null;

        System.out.println(Objects.equals(null,null));  //true

        System.out.println("Ikun".equals(s));                //false
        System.out.println(s.equals("Ikun"));   //为null调用equals会抛出异常，难怪未知变量放后面      NullPointerException
    }
}
