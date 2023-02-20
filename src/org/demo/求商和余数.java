package org.demo;

import java.util.Scanner;
/*  需求:给定两个整数，被除数和除数 (都是正数，且不超过int的范围)
    将两数相除，要求不使用乘法、除法和 % 运算符
    得到商和余数。*/

public class 求商和余数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int bec = sc.nextInt();
        int becs = bec;                     //被除数运行要变，所以新建一个变量存初始值
        System.out.println("请输入除数");
        int c = sc.nextInt();
        int conut = 0;

        while (bec>=c){                     //除法的本质是减法     比如22➗7=3  余 1   就是22减3次7 还剩下1不够减
            conut++;
            bec -= c;
        }
        System.out.printf("%d➗%d=%d...%d",becs,c,conut,bec);






    }





}
