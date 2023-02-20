package org.demo进阶.file类;

import java.io.File;

public abstract class A_File类的判断 {
    public static void main(String[] args) {
      /*      方法名称                                说明
        public boolean isDirectory()       判断此路径名表示的File是否为文件夹
        public boolean isFile()            判断此路径名表示的File是否为文件
        public boolean exists()            判断此路径名表示的File是否存在
      */

        //1.对一个文件的路径进行判断
        File f1 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件\\A文件的判断.java");
        System.out.println(f1.isDirectory());   //false
        System.out.println(f1.isFile());        //true
        System.out.println(f1.exists());        //true
        System.out.println(f1.isAbsolute());    //true    测试此抽象路径名是否为绝对路径名。
        System.out.println("\n————————————————————————————————————————————————————————————");


        //2.对一个文件夹的路径进行判断
        File f2 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件");
        System.out.println(f2.isDirectory());   //true
        System.out.println(f2.isFile());        //false
        System.out.println(f2.exists());        //true
        System.out.println(f2.isAbsolute());    //true    测试此抽象路径名是否为绝对路径名。

        System.out.println("\n————————————————————————————————————————————————————————————");

        //3.对一个不存在的路径进行判断
        File f3 = new File("E:\\idea\\ikun.txt");
        System.out.println(f3.isDirectory());   //false
        System.out.println(f3.isFile());        //false
        System.out.println(f3.exists());        //false
        System.out.println(f3.isAbsolute());    //true    测试此抽象路径名是否为绝对路径名。
    }
}
