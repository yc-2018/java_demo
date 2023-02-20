package org.demo进阶.file类;

import java.io.File;

public abstract class 练习3 {
    public static void main(String[] args) {
        //需求:
        //找到电脑中所有以avi结尾的电影。
        //(需要考虑子文件夹)

        //套路:
        // 1，进入文件夹
        // 2，遍历数组
        // 3，判断
        // 4，判断

//        File src = new File("F:\\");
//        findAVI(src);

        findAVI();

    }

    private static void findAVI() {
        //获取本地所有的盘符
        File[] arr = File.listRoots();
        for (File f : arr) {
            findAVI(f);
        }
    }

    private static void findAVI(File src) {
        File[] files = src.listFiles();
        if (files==null)return;             //老师是用！= 来包裹循环

        for (File f : files) {              //遍历数组,依次得到src里面每一个文件或者文件夹
            if (f.isFile()&&f.getName().endsWith(".avi"))
                System.out.println(f);
            else if (f.isDirectory())
                    findAVI(f);             //递归    细节: 再次调用本方法的时候，参数一定要是src的次一级路径
        }
    }
}
