package org.demo;

public class Main {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "a"+"b"+"c";//常量优化机制 编译前就会自动拼接成abc
        System.out.println(s1==s2);


        System.out.println(s1.compareTo(s2));
    }
}
