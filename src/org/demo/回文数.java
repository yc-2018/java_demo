package org.demo;

import java.util.Scanner;

/*
* 需求:给你一个整数X。
* 如果x是一个回文整数，打印 true ，否则，返回 false 。
* 解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数
* 例如，121 是回文，而 123 不是。
* */

public class 回文数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int a = sc.nextInt();                   // 输入整数语句
        int Old = a;                            // 输入的变量保存到这   因为a后面还要变
        int New = 0;                            // 保存结果变量
        while (a!=0){
            int t = a%10;                       // 从右往左获取每一位数字
            a/=10;                              // 修改一下a记录的值
            New = New*10+t;                     // 把当前获取到的数字拼接到最右边
        }
        System.out.println(New==Old);           //比较>输出

    }

}
