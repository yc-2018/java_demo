package org.demo.字符串;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class 字符串的比较 {
    public static void main(String[] args) {
        //String是引用数据类型，引用数据类型比较的都是地址值

        String s1 = "abc";   //串池里面查找，没有就创建，有就复用....键盘录入属于new
        String s2 = "abc";
        String s3 = new String("abc");  //堆里面创建
        String s4 = new String("Abc");
        Scanner sc = new Scanner(System.in);
        System.out.println("输入abc试试");
        String s5= sc.next();


        System.out.println(s1==s2);     //true
        System.out.println(s2==s3);     //false

        //所以==比较的是地址，想要比较对象的内容是否相等就要用到，equals（）
        System.out.println(s2.equals(s3));  //true
        System.out.println(s2.equals(s4));  //false
        //忽略大小写
        System.out.println(s2.equalsIgnoreCase(s4));    //true
        System.out.println("------------------------------一定要加括号，不然+号的优先级大过== 就会先拼接再比较了");
        System.out.println("输入和串池："+(s1==s5));        //false
        System.out.println("输入和new："+(s3==s5));         //false  输入也是new 但是会开辟不同的堆空间，所以指向堆的地址也不同

    }
}
