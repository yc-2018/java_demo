//仰晨study 创建时间2023/2/8 22:33 星期三
package org.demo进阶.test;

import java.util.Random;

public class 随机浮点数 {

    public static void main(String[] args) {
    Random r = new Random();
    double v = r.nextDouble();
        System.out.println(r.nextInt(1));
        System.out.println(v);


        double a = 100.46164;
        System.out.println((int)a);
        System.out.println(0.01*100);
    }
}
