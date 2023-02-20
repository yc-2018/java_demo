package org.demo进阶.IO流;

import java.io.*;

public class J_练习1_拷贝 {
    /*需求:
        拷贝一个文件夹，考虑子文件夹      不考虑有权限的文件夹
        */
    public static void main(String[] args) throws IOException {
        File src = new File("aaa\\beCopy");     //1.创建对象表示数据源
        File dest = new File("aaa\\Copy");      //2.创建对象表示目的地

        copydir(src,dest);                               //3.调用方法开始拷贝
    }

    //参数一:数据源
    //参数二:目的地
    private static void copydir(File src, File dest) throws IOException {
        System.out.println(dest.mkdirs());

        File[] arr = src.listFiles();                           //1.进入数据源
        for (File f : arr) {                                    //2.遍历数组
            if (f.isFile()) {                                   //3.判断文件，拷贝
                FileInputStream fis = new FileInputStream(f);
                FileOutputStream fos = new FileOutputStream(new File(dest, f.getName()));

                byte[] b = new byte[1024];
                int len;
                while ((len = fis.read(b)) != -1) {
                    fos.write(b,0,len);
                }
                fos.close();
                fis.close();
            }else {
                copydir(f,new File(dest,f.getName()));          //4.判断文件夹，递归
            }
        }
    }
}
/*总结
*递归
*1.进入数据源
*2.遍历数组
*3.判断文件，拷贝
*4.判断文件夹，递归
* */