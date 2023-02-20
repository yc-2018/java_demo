package org.demo.常用API;

public class MathDemo {
    public static void main(String[] args) {
        /*
        *public static int      abs(int a)              获取参数绝对值
        *public static double   ceil(double a)          向上取整
        *public static double   floor(double a)         向下取整
        *public static int      round(float a)          四舍五入
        *public static int      max(int a,int b)        获取两个int值中的较大值
        *public static double   pow(double a,double b)  返回a的b次幂的值
        *public static double   random()                返回值为double的随机值，范围[0.0,1.0)
        * */


        //绝对值
        System.out.println("Math.abs(66) = " + Math.abs(66));       //66
        System.out.println("Math.abs(-66) = " + Math.abs(-66));     //66
        //-2147483648 没有正数与之对应，所以abs结果产生bug  正数最大2147483647
        System.out.println("Math.abs(-2147483648) = " + Math.abs(-2147483648));

        System.out.println("--------------------------------------------");

        //向上取整（进一法）  (负数 向正无穷方向取整
        System.out.println("Math.ceil(5.2) = " + Math.ceil(5.2));       //6.0
        System.out.println("Math.ceil(5.1) = " + Math.ceil(5.1));       //6.0
        System.out.println("Math.ceil(5.0) = " + Math.ceil(5.0));       //5.0
        System.out.println("Math.ceil(-5.1) = " + Math.ceil(-5.1));     //-5.0

        System.out.println("--------------------------------------------");

        //向下取整（去尾法）  (负数 向负无穷方向取整
        System.out.println("Math.floor(9.99) = " + Math.floor(9.99));       //9.0
        System.out.println("Math.floor(-9.01) = " + Math.floor(-9.01));     //-10.0

        System.out.println("--------------------------------------------");

        //四舍五入
        System.out.println("Math.round(9.99) = " + Math.round(9.99));       //10
        System.out.println("Math.round(9.50) = " + Math.round(9.50));       //10
        System.out.println("Math.round(9.49) = " + Math.round(9.49));       //9

        System.out.println("--------------------------------------------");

        //俩数的最大值
        System.out.println("Math.max(52,1314) = " + Math.max(52, 1314));            //1314
        System.out.println("Math.max(13.14,52.0) = " + Math.max(13.14, 52.0));      //52.0
        //俩数较小值
        System.out.println("Math.min(5,2) = " + Math.min(5, 2));                    //2

        System.out.println("--------------------------------------------");

        //a的b次方
        System.out.println("Math.pow(2,10) = " + Math.pow(2, 10));          //2的10次方  1024.0
        System.out.println("Math.pow(2,-1) = " + Math.pow(2, -1));          //0.5
        System.out.println("Math.pow(2,0.5) = " + Math.pow(2, 0.5));        //1.4142135623730951
        System.out.println("Math.pow(2,0.33) = " + Math.pow(2, 0.33333));   //1.2599181388624912

        System.out.println("--------------------------------------------");

        //开2次方根
        System.out.println("Math.sqrt(2) = " + Math.sqrt(2));               //1.4142135623730951(和2的0.5次方一样
        System.out.println("Math.sqrt(4) = " + Math.sqrt(4));               //2.0

        //开3次方根
        System.out.println("Math.cbrt(27) = " + Math.cbrt(27));             //3.0
        System.out.println("Math.cbrt(8) = " + Math.cbrt(8));               //2.0
        System.out.println("Math.cbrt(2) = " + Math.cbrt(2));               //1.2599210498948732(和2的0.33333次方差不多

        System.out.println("--------------------------------------------");
        System.out.println("Math.random() = " + Math.random());


    }
}
