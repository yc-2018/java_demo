package org.demo进阶.file类;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;

public class E_File类的获取并遍历_了解 {
    /*方法名称                                              说明
public static File[] listRoots()                       列出可用的文件系统根
public String[] list()                                 获取当前该路径下所有内容
public String[] list(FilenameFilter filter)            利用文件名过滤器获取当前该路径下所有内容
public File[] listFiles()                              获取当前该路径下所有内容（*****就这个要求掌握*****）
public File[] listFiles(FileFilter filter)             利用文件名过滤器获取当前该路径下所有内容
public File[] listFiles(FilenameFilter filter)         利用文件名过滤器获取当前该路径下所有内容     和第三个一样 返回值不一样
*/
    public static void main(String[] args) {
        System.out.println("——————listRoots 获取系统中所有的盘符——————");
        File[] arr = File.listRoots();
        System.out.println(Arrays.toString(arr));   //[C:\, D:\, E:\, F:\]


        System.out.println("\n——————————获取当前该路径下所有内容——————————");
        File f1 = new File("src\\org\\demo进阶\\文件");
        String[] list = f1.list();
        System.out.println(Arrays.toString(list));


        System.out.println("\n—————利用文件名过滤器获取当前该路径下所有内容———————");
        //需求:我现在要获取文件夹里面所有的java文件
        File f2 = new File("src\\org\\demo进阶\\文件");
        //accept方法的形参，依次表示文件夹里面每一个文件或者文件夹的路径
        //参数一: 父级路径
        //参数二: 子级路径
        //返回值:如果返回值为true，就表示当前路径保留
        //如果返回值为false，就表示当前路径舍弃不要
        String[] arr1 = f2.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && src.getName().endsWith(".java");
            }
        });
        System.out.println(Arrays.toString(arr1));


        System.out.println("\n———————文件名过滤器获取当前该路径下所有内容111—————————");
        //需求:我现在要获取文件夹里面所有的java文件
        File f3 = new File("src\\org\\demo进阶\\文件");
        File[] arr2 = f3.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile() && pathname.getName().endsWith(".java");
            }
        });
        for (File f : arr2)
            System.out.println(f);


        System.out.println("\n———————文件名过滤器获取当前该路径下所有内容222—————————");
        //需求:我现在要获取文件夹里面所有的java文件
        File f4 = new File("src\\org\\demo进阶\\文件");
        File[] arr3 = f4.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File src = new File(dir, name);
                return src.isFile() && src.getName().endsWith(".java");
            }
        });
        for (File f : arr3)
            System.out.println(f);
    }
}
