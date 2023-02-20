package org.demo.字符串;

public class 字符串的拼接 {
    public static void main(String[] args) {
/*
截取String substring(int beginlndex, int endIndex)
注意点: 包头不包尾，包左不包右
只有返回值才是截取的小串
String substring(int beginIndex)截取到末尾*/
        String phoneNumber = "12345678910";
        phoneNumber=phoneNumber.substring(0,3)+"****"+phoneNumber.substring(7);
        System.out.println(phoneNumber);

        System.out.println(Integer.parseInt("110"));
    }
}
