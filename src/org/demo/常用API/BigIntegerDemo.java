package org.demo.常用API;
/*
public BigInteger(int num， Random rnd)          获取随机大整数，范围:[ ~ 2的num次方-1]
public BigInteger(string val)                   获取指定的大整数
public BigInteger(string val,int radix)         获取指定进制的大整数
---------------------------------------------------------------------
public static BigInteger valueOf(long val)      静态方法获取BigInteger的对象，内部有优化

                        对象一旦创建，内部记录的值不能发生改变
*/

import java.math.BigInteger;
import java.util.Random;

public class BigIntegerDemo {
    public static void main(String[] args) {
        //获取一个随机大整数
        Random r = new Random();
        BigInteger bi1 = new BigInteger(9, r);
        System.out.println("从0到2的9次方中获取一个随机数----bi1 = " + bi1);

        //2.获取一个指定的大整数
        BigInteger bi2 = new BigInteger("999999999999999999999999");
        System.out.println("细节: 字符串中必须是整数，否则会报错" + bi2);

        //3.获取指定进制的大整数
        //细节:
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写0和1，写其他的就报错。
        BigInteger bi3 = new BigInteger("FFF0012fff2ae86", 16);  //16进制
        System.out.println("会自动变回10进制------bi3 = " + bi3);

        // 4.静态方法获取BigInteger的对象，内部有优化
        // 细节:
        // 1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了.
        // 2.在内部对常用的数字: -16 ~ 16 进行了优化。
        // 提前把-16 ~ 16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
        BigInteger bi4 = BigInteger.valueOf(16);
        BigInteger bi5 = BigInteger.valueOf(16);
        System.out.println(bi4 == bi5);             //true

        BigInteger bi6 = BigInteger.valueOf(17);
        BigInteger bi7 = BigInteger.valueOf(17);
        System.out.println(bi6 == bi7);             //false



        //5.对象一旦创建内部的数据不能发生改变
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger result = bd9 .add(bd10);
        System.out.println(result);//3
        //此时，不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录3
        System.out.println(bd9 == result);//false
        System.out.println(bd10 == result);//false

        /*          BigInteger构造方法小结
        如果BigInteger表示的数字没有超出long的范围，可以用静态方法获取
        如果BigInteger表示的超出long的范围，可以用构造方法获取。
        对象一旦创建，BigInteger内部记录的值不能发生改变
        只要进行计算都会产生一个新的BigInteger对象
        */
//--------------------------------------------------------------------------------------------------------------
        /*            方法名                                                   说明
        *public BigInteger add(BigInteger val)                                加法
        *public BigInteger subtract(BigInteger val)                           减法
        *public BigInteger multiply(BigInteger val)                           乘法
        *public BigInteger divide(BigInteger val)                             除法，获取商
        *public BigInteger[] divideAndRemainder(BigInteger val)               除法，获取商和余数
        *public boolean equals(Object x)                                      比较是否相同
        *public BigInteger pow(int exponent)                                  次幂
        *public BigInteger max/min(BigInteger val)                            返回较大值/较小值
        *public int intValue(BigInteger val)                                  转为int类型整数，超出范围数据有误
        * */
//--------------------------------------------------------------------------------------------------------------
        BigInteger bigInteger1 = BigInteger.valueOf(51);
        BigInteger bigInteger2 = BigInteger.valueOf(1);
        //加法
        System.out.println("bigInteger1.add(bigInteger2) = " + bigInteger1.add(bigInteger2));
        //减法
        System.out.println("bigInteger1.subtract(bigInteger2) = " + bigInteger1.subtract(bigInteger2));
        //乘法
        System.out.println("bigInteger1.multiply(bigInteger2) = " + bigInteger1.multiply(bigInteger2));

        //....懒癌发作  忽略...
    }
}
