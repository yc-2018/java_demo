package org.demo;

import java.util.Random;
import java.util.Scanner;

public class 随机数 {
    public static void main(String[] args) {
        Random r = new Random();//创建随机数对象
        int number = r.nextInt(100);//生成随机数  范围在0到99之间
        System.out.println(number);
        System.out.println("-----------------------");

        //如果想生成2到18的随机数怎么写？
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(17) + 2;  //19是不包含19的
            System.out.println(num);
        }
        //--------猜数字-------------
        Scanner sc = new Scanner(System.in);
        int n = r.nextInt(100) + 1;
        while (true) {
            System.out.println("-猜数字1-100 请输入：");
            int s = sc.nextInt();
            if (s > n) System.out.println("猜大了");
            else if (s < n) System.out.println("猜小了");
            else {
                System.out.println("猜对了");
                break;
            }
        }


    }
}
