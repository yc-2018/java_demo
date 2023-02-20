package org.demo;

//选中然后//ctrl + alt + M 自动抽取方法/////////////////////////////
//选中然后//shift+F6重构名字/////////////////////////////

public class 方法 {
    public static void main(String[] args) {
//        java不用申明   直接调用
        求和(10, 34);
        求和(13, 84);
        打游戏();

        int[] i = {45, 78, 32, 12, 52};
        System.out.println(最大值(i));


    }

    //  定义无参方法1
    public static void 打游戏() {
        System.out.println("开始");
        System.out.println("选英雄");
        System.out.println("对线");
        System.out.println("被抓");
        System.out.println("骂队友");
        System.out.println("defeat");
    }

    //  定义无参方法2
    public static void 求和(int a, int b) {
        System.out.println(a + b);
    }

    //  定义有参方法
    public static int 最大值(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
        }

        return max;
    }


}

