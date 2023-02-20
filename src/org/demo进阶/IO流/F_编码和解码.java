package org.demo进阶.IO流;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract  class F_编码和解码 {/*
Java中编码的方法
            string类中的方法                             说明
public byte[] getBytes()                        使用默认方式进行编码
public byte[] getBytes(string charsetName)      使用指定方式进行编码

Java中解码的方法
        string类中的构造方法                           说明
String(byte[] bytes)                            使用默认方式进行解码
string(byte[] bytes,String charsetName)         使用指定方式进行解码
*/

    public static void main(String[] args) throws UnsupportedEncodingException {
        //1、编码
        String str = "Ikun小黑子";

        byte[] bytes1 = str.getBytes();     //eclipse 默认gbk   idea默认utf-8
        System.out.println("utf-8编码\t"+Arrays.toString(bytes1));    //默认utf-8

        byte[] bytes2 = str.getBytes("GBK");
        System.out.println("GBK编码\t\t"+Arrays.toString(bytes2));

        //2、解码
        System.out.println("utf-8编码 utf-8解码  "+new String(bytes1));                    //Ikun小黑子
        System.out.println("utf-8编码 gbk解码    "+new String(bytes1,"GBK"));   //Ikun灏忛粦瀛�

        System.out.println(new String(new byte[]{-65,57,-14,65},"GBK"));//单纯验证一下第二位是正数 可
    }
}
