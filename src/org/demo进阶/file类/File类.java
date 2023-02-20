package org.demo进阶.file类;

import java.io.File;//File类只能对文件本身进行操作不能读写文件里面存储的数据

public interface File类 {
    // File对象就表示一个路径，可以是文件的路径、也可以是文件夹的路径
    // 这个路径可以是存在的，也允许是不存在的

    /*       构造方法名称                                              说明
    * public File(String pathname)                          根据文件路径创建文件对象
    * public File(String parent,String child)               根据父路径名字符串和子路径名字符串创建文件对象
    * public File(File parent，String child)                 根据父路径对应文件对象和子路径名字符串创建文件对象
    * */

    //我的桌面 E:\Users\Dell\Desktop

    static void main(String[] args) {
        //1.根据字符串表示的路径，变成File对象
        File f1 = new File("E:\\Users\\Dell\\Desktop\\a.txt");
        System.out.println(f1);

        //2.父级路径: E:\Users\Dell\Desktop
        //子级路径: a.txt
        String parent = "E:\\Users\\Dell\\Desktop";
        String child = "a.txt";
        File f2 = new File(parent, child);
        System.out.println(f2);

        //可以自己拼接吗   可以  但是 操作系统不同转义字符是不同的  win拼接之间是\  Linux是/   所以还是用构造方法最好  他会先判断是什么系统 再进行拼接

        //3.把一个File表示的路径和String表示路径进行拼接
        File parent2 = new File("E:\\Users\\Dell\\Desktop");
        String child2 = "a.txt";
        File f3 = new File(parent2, child2);
        System.out.println(f3);

    }
    /*总结
    *   1. File表示什么?
    *       File对象表示路径，可以是文件、也可以是文件夹
    *       这个路径可以是存在的，也可以是不存在的
    *
    *   2.绝对路径和相对路径是什么意思?
    *       绝对路径是带盘符的
    *       相对路径是不带盘符的，默认到当前项目下去找
    *
    * */
}
