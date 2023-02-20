package org.demo进阶.file类;

import java.io.File;
import java.io.IOException;

public abstract class 练习1 {
    //需求:
    //在当前模块下的aaa文件夹中创建一个a.txt文件
    public static void main(String[] args) throws IOException {
        //1.创建a.txt的父级路径
        File file = new File("aaa\\");
//        System.out.println(file.getAbsolutePath());
        //2.创建父级路径
        //如果aaa是存在的，那么此时创建失败的。
        //如果aaa是不存在的，那么此时创建成功的。
        System.out.println("创建aaa文件夹"+file.mkdirs());

        //3.拼接父级路径和子级路径
        File file1 = new File(file, "a.txt");
        if (file1.createNewFile()) {
            System.out.println("创建成功a.txt");
        } else {
            System.out.println("创建失败a.txt");
        }
    }
}
