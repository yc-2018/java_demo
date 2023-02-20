package org.demo进阶.IO流;

import java.io.*;

public abstract class K_字节缓冲流 {
    //字节缓冲输入流BufferedInputStream
    //字节缓冲输出流BufferedOutputStream


/*          方法名称                                        说明
*public BufferedInputStream(InputStream is)         把基本流包装成高级流，提高读取数据的性能把基本流包装成高级流，提高写出数据的性能
*public BufferedOutputStream(OutputStream os)       把基本流包装成高级流，提高读取数据的性能把基本流包装成高级流，提高写出数据的性能
*
*原理:底层自带了长度为8192的缓冲区提高性能
* */

    //练习：利用字节缓冲流拷贝文件
    public static void main(String[] args) throws IOException {
        一次拷贝一个字节();

        一次拷贝多个字节();
    }

    private static void 一次拷贝一个字节() throws IOException {
        //1.创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aaa\\f.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aaa\\copy_f.txt"));

        //2.循环读取并写到目的地
        int ch;
        while ((ch = bis.read()) != -1) {
            bos.write(ch);
        }
        //3.释放资源
        bos.close();
        bis.close();
    }

    private static void 一次拷贝多个字节() throws IOException {
        //1.创建缓冲流的对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aaa\\f.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aaa\\f_copy.txt"));

        //2.循环读取并写到目的地
        byte[] arr = new byte[6];
        int len;
        while ((len = bis.read(arr)) != -1) {
            bos.write(arr,0,len);
        }
        //3.释放资源
        bos.close();
        bis.close();
    }
}
