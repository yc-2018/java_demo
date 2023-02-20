package org.demo.常用API;

import java.util.Scanner;

public class 改写键盘代码练习 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一坨字符串✖");

        /*String next = sc.next();
        System.out.println(next);*/
        // 弊端:
        // 当我们在使用next，nextInt，nextDouble在接收数据的时候，遇到空格，回车，制表符的时候就停止了
        // 键盘录入的是123 123 那么此时只能接收到空格前面的数据
        // 我想要的是接收一整行数据
        //约定:
        //以后我们如果想要键盘录入，不管什么类型，统一使用nextLine
        // 特点遇到回车才停止
        System.out.println("请输入一个浮点数✔");
        String s = sc.nextLine();
        double v = Double.parseDouble(s);
        System.out.println(v+1);
    }
}

// 键盘录入的两套体系不能混用的
// 弊端: 先用nextInt，再用nextLine会导致下面的nextLine接受不到数据
// 所以全用nextLine