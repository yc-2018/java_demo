package org.demo.常用API;
//包装类:用一个对象，把基本数据类型给包起来     基本数据类型 10  包装类 @x0011
/*各个基本数据类型对应的包装类包装类（基本都是变首字母大写）
byte     .   Byte
short    .   Short
char     .   Character  ---
int      .   Integer    ---
long     .   Long
float    .   Float
double   .   Double
boolean  .   Boolean
* *//*古老的获取Integer对象的方式（了解即可）---------------------------------------------
public Integer(int value)                               根据传递的整数创建一个Integer对象
public Integer(String s)                                根据传递的字符串创建一个Integer对象
public static Integer valueOf(int i)                    根据传递的整数创建一个Integer对象
public static Integer valueOf(String s)                 根据传递的字符串创建一个Integer对象
public static Integer valueOf(String s,int radix)       根据传递的字符串和进制创建一个Integer对象

*//*
Integer成员方法
public static String toBinaryString(int i)      得到二进制
public static String toOctalString(int i)       得到八进制
public static String toHexString(int i)         得到十六进制
public static int parseInt(String s)            将字符串类型的整数转成int类型的整数
*/

public class 包装类Demo {
    public static void main(String[] args) {
        System.out.println("了解古老的获取Integer对象的方式");
        OldGetInteger();

        System.out.println("了解古老的包装类如何进行计算");
        OldCompute();

        //--------------------------------------
        //在JDK5的时候提出了一个机制:自动装箱和自动拆箱
        //自动装箱:把基本数据类型 自动 变成其对应的包装类
        //自动拆箱:把包装类自动 变成其对象的基本数据类型

        // 在底层，此时还会去自动调用静态方法valueOf得到一个Integer对象，只不过这个动作不需要我们自己去操作了

        // 自动装箱的动作
        Integer i1=10;

        Integer i2 = new Integer(3);
        //自动拆箱的动作
        Integer i =i2;
        System.out.println(i+i1+i2);//16

        //在JDK5以后，int和Integer可以看做是同一个东西，因为在内部可以自动转化。

        System.out.println("------Integer成员方法----------------");
        Integer成员方法();
    }

    private static void Integer成员方法() {
        // 1.把整数转成二进制(返回字符串
        String str1 = Integer.toBinaryString(100);
        System.out.println(str1);
        // 2.把整数转成八进制
        String str2 = Integer.toOctalString(100);
        System.out.println(str2);
        // 3.把整数转成十六进制
        String str3 = Integer.toHexString(100);
        System.out.println(str3);
        // 4.将字符串类型的整数转成int类型的整数
        // 类型语言:每种数据在java中都有各自的数据类型
        // 在计算的时候，如果不是同一种数据类型，是无法直接计算的。
        int i = Integer.parseInt("123");
        System.out.println(i);
        System.out.println(i+1);
        //细节1:
        //在类型转换的时候，括号中的参数只能是数字不能是其他，否则代码会报错
        // 细节2:
        //8种包装类当中，除了character都有对应的parseXxx的方法，进行类型转换
        String str = "true";
        boolean b = Boolean.parseBoolean(str);
        System.out.println(b);
    }

    //了解古老的包装类如何进行计算----------------------------
    private static void OldCompute() {
        //在以前包装类如何进行计算
        Integer i1 = new Integer(1);
        Integer i2 = new Integer(2);
        //需求:要把两个数据进行相加得到结果3
        // 对象之间是不能直接进行计算的。
        // 步骤:
        //1.把对象进行拆箱，变成基本数据类型
        //2.相加
        //3.把得到的结果再次进行装箱(再变回包装类)
        int result = i1.intValue() + i2.intValue();
        Integer i3 = new Integer(result);
        System.out.println(i3);
    }

    //了解古老的获取Integer对象的方式------------------------
    private static void OldGetInteger() {
        //1.利用构造方法获取Integer的对象 (JDK5以前的方式)
        Integer i1 = new Integer(1);
        Integer i2 = new Integer("1");
        System.out.println(i1);
        System.out.println(i2);

        //2.利用静态方法获取Integer的对象 (JDK5以前的方式)
        Integer i3 = Integer.valueOf(167);
        Integer i4 = Integer.valueOf("167");
        Integer i5 = Integer.valueOf("167",8);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);     //119

        //3.这两种方式获取对象的区别(掌握)
        // 底层原理:
        // 因为在实际开发中，-128~127之间的数据，用的比较多。
        // 如果每次使用都是new对象，那么太浪费内存了
        // 所以，提前把这个范围之内的每一个数据都创建好对象
        // 如果要用到了不会创建新的，而是返回已经创建好的对象。
        Integer i6 = Integer.valueOf("127");
        Integer i7 = Integer.valueOf("127");
        System.out.println(i6 == i7);           //true

        Integer i8 = Integer.valueOf("128");
        Integer i9 = Integer.valueOf("128");
        System.out.println(i8 == i9);           //false

        // new关键字，在Java中，每一次new都是创建了一个新的对象
        // 所以下面的两个对象都是new出来，地址值不一样。
        Integer i10 = new Integer(127);
        Integer i11 = new Integer(127);
        System.out.println(i10 == i11);        //false
    }
}
/*
1.什么是包装类?
    基本数据类型对应的对象
2.JDK5以后对包装类新增了什么特性?
    自动装箱、自动拆箱
3，我们以后如何获取包装类对象?
    不需要new，不需要调用方法，直接赋值即可
*/