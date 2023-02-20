package org.demo.常用API;
/*
*1.BigDecimal的作用是什么?
表示较大的小数和解决小数运算精度失真问题
*
* 2.BigDecimal的对象如何获取?
* BigDecimal bd1 = new BigDecimal("较大的小数");
* BigDecimal bd2 = BigDecimal.valueOf(0.1);
*
*3.常见操作
*加:add
*减: subtract
*乘:multiply
*除: divide(四舍五入: RoundingMode.HALF_UP)
*
* */

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
        //1.通过传递double类型的小数来创建对象
        // 细节:
        // 这种方式有可能是不精确的，所以不建议使用
        BigDecimal bd1 = new BigDecimal(0.09);
        System.out.println("bd1 = " + bd1);

        //2.通过传递字符串表示的小数来创建对象
        BigDecimal bd2 = new BigDecimal("0.09");
        BigDecimal bd3 = new BigDecimal("0.01");
        System.out.println("bd2.add(bd3) = " + bd2.add(bd3));//0.10   尾数完美控制

        //细节:
        // 1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        // 2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        // 3.如果我们传递的是0~10之间的整数，包含0，包含10，那么方法会返回已经创建好的对象，不会重新new
        BigDecimal bd4 = BigDecimal.valueOf(10);
        BigDecimal bd5 = BigDecimal.valueOf(10);
        System.out.println(bd4==bd5);                   //true
        BigDecimal bd6 = BigDecimal.valueOf(10.0);
        BigDecimal bd7 = BigDecimal.valueOf(10.0);
        System.out.println(bd6==bd7);                   //false
        BigDecimal bd8 = BigDecimal.valueOf(11.11);
        System.out.println(bd4+"尾数都看不见");
        System.out.println(bd8);


        /*                  方法名                                                 说明
        * public static BigDecimal valueOf(double val)                            获取对象
        * public BigDecimal add(BigDecimal val)                                   加法
    * public BigDecimal subtract(BigDecimal val)                                  减法
    * public BigDecimal multiply(BigDecimal val)                                  乘法
        * public BigDecimal divide(BigDecimal val)                                除法--除不尽会报错  比如10/3
        * public BigDecimal divide(BigDecimal val，精确几位，舍入模式)                除法
        * */
        BigDecimal bd9 = BigDecimal.valueOf(10);
        BigDecimal bd10 = BigDecimal.valueOf(3);
        //System.out.println(bd9.divide(bd10));//报错
        System.out.println(bd9.divide(bd10,3, RoundingMode.HALF_UP));//保留3位，四舍五入模式
    }
}
