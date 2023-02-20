package org.demo;

import java.util.Scanner;

public class 键盘录入 {
    public static void main(String[] args) {
        //键盘录入:----------------------------------------------------------------
        //第一套体系:
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格，制表符，回车就停止接受。这些符号后面的数据就不会接受了
        //第二套体系:-----------------------------------------------------------------
        //nextLine();接收字符串
        //可以接收空格，制表符，遇到回车才停止接受数据
        //--------------------------------------------------------
        //键盘录入的两套体系不能混用的
        // 弊端: 先用nextInt，再用nextLine会导致下面的nextLine接受不到数据
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个整数");
        int sc1 = sc.nextInt();
        System.out.println(sc1);
        System.out.println("请输入字符串");
        String sc2 = sc.next();
        System.out.println(sc2);



    }
}
