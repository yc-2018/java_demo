package org.demo.字符串;

import java.util.Scanner;

public class 字符串的遍历 {
    public static void main(String[] args) {
        //获取字符串的索引.length()   获取字符串索引对应的字符.charAt(0)
        Scanner sc = new  Scanner(System.in);
        System.out.println("请输入一串字符");
        String str = sc.next();

        //快捷生成for循环 str.length().fori
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.print("-"+c);
        }
        System.out.println();

        //倒序遍历
        for (int i = str.length()-1; i >= 0; i--) {
            char c = str.charAt(i);
            System.out.print(c);
        }
    }
}
