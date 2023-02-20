package org.demo.静态变量;

import java.util.StringJoiner;
/*
 * 静态方法只能访问静态变量和静态方法         # 因为最早存在，别的都还没存在？
 *非静态方法可以访问静态变量或者静态方法，也可以访问非静态的成员变量和非静态的成员方法
 *静态方法中是没有this关键字
 *
 * 特点:
 *多用在测试类和工具类中
 * Javabean类中很少会用
 *
 *调用方式:
 * 类名调用(推荐)
 * 对象名调用
 * */
public class 静态方法和工具类 {
    //私有化构造方法
    private 静态方法和工具类(){}        // 外界就不能new来创建他的对象了   # 静态方法不用new就可以直接点


    // 要定义为静态的，不然就外界就用不来了
    public static String printArr(int[] a){
        StringJoiner pA = new StringJoiner(",", "[", "]");
        for (int j : a) {
            pA.add("" + j);
        }
        return pA.toString();
    }

    public static double getAve(double[] d) {
        double sum = 0;
        for (double i : d) sum += i;
        return sum / d.length;
    }

}
