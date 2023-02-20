package org.demo进阶.IO流;

import java.io.*;

public class M_练习1_拷贝文件 {
    /*
    四种方式拷贝文件，并统计各自用时

    字节流的基本流:一次读写一个字节
    字节流的基本流:一次读写一个字节数组
    字节缓冲流:一次读写一个字节
    字节缓冲流:一次读写一个字节数组
    */

    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        //字节流的基本流_一();    //912.885秒
        //字节流的基本流_多();    //2.237秒    1.087秒     1.743秒
        //字节缓冲流_一();        //9.495秒    9.428秒    9.444秒
        //字节缓冲流_多();        //1.439秒    1.424秒    1.459秒
        long end = System.currentTimeMillis();
        System.out.println((end-start)/1000.0+"秒");
        // E:\Users\Dell\Desktop\　　　　　　\朱哥讲解sevlet配置2022-10-23 21-11-24.mp4    268 MB (281,870,975 字节)
    }

    private static void 字节缓冲流_多() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\Users\\Dell\\Desktop\\　　　　　　\\朱哥讲解sevlet配置2022-10-23 21-11-24.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\Users\\Dell\\Desktop\\copy.MP4"));
        int len;
        byte[] arr = new byte[8192];
        while ((len = bis.read(arr)) != -1) {
            bos.write(arr,0,len);
        }
        bos.close();
        bis.close();
    }

    private static void 字节缓冲流_一() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\Users\\Dell\\Desktop\\　　　　　　\\朱哥讲解sevlet配置2022-10-23 21-11-24.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\Users\\Dell\\Desktop\\copy.mp4"));
        int ch;
        while ((ch = bis.read()) != -1) {
            bos.write(ch);
        }
        bos.close();
        bis.close();

    }

    private static void 字节流的基本流_多() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Users\\Dell\\Desktop\\　　　　　　\\朱哥讲解sevlet配置2022-10-23 21-11-24.mp4");
        FileOutputStream fos = new FileOutputStream("E:\\Users\\Dell\\Desktop\\copy.mp4");
        int len;
        byte[] arr = new byte[8192];
        while ((len = fis.read(arr)) != -1) {
            fos.write(arr,0,len);
        }
        fos.close();
        fis.close();
    }

    private static void 字节流的基本流_一() throws IOException {
        FileInputStream fis = new FileInputStream("E:\\Users\\Dell\\Desktop\\　　　　　　\\朱哥讲解sevlet配置2022-10-23 21-11-24.mp4");
        FileOutputStream fos = new FileOutputStream("E:\\Users\\Dell\\Desktop\\copy.mp4");
        int ch;
        while ((ch = fis.read()) != -1) {
            fos.write(ch);
        }
        fos.close();
        fis.close();
    }
}
