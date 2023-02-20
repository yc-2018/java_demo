package org.demo进阶.file类;

import java.io.File;

public abstract class 练习5 {
    public static void main(String[] args) {
        //需求:
        //统计一个文件夹的总大小

        File src = new File("src\\org\\");

        long len = getLen(src);
        System.out.println(len);
    }


    //作用:
        //统计一个文件夹的总大小
    //参数:
        //表示要统计的那个文件夹
    //返回值:
        //统计之后的结果
    //文件来的总大小:
        //说白了，文件夹里面所有文件的大小
    private static long getLen(File src) {
        File[] files = src.listFiles();
        long len = 0;
        for (File f : files) {
            if (f.isFile())
                len += f.length();      //我们就把当前文件的大小累加到len当中
            else
                len += getLen(f);       //这个是我没想到的  很妙   接收返回值
        }
        return len;
    }
}
