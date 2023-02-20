package org.demo进阶.IO流;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public abstract class B_FileInputStream {//操作本地文件的字节输入流，可以把本地文件中的数据读取到程序中来。
    //书写步骤:
    //      1.创建字节输入流对象
    //          细节1:如果文件不存在，就直接报错  读文件夹也报错

    //      2.读数据
    //          细节1:如果文件不存在，就直接报错
    //          细节2: 读到文件末尾了，read方法返回-1。

    //      3.释放资源
    //          细节:每次使用完流之后都要释放资源

    /*方法名称                             说明
public int read()                    次读一个字节数据        # 返回的是字符的ascll码
public int read(byte[] buffer)       次读一个字节数组数据     # 返回的是数组被覆盖的个数————所以看数据是找数组
    注意:一次读一个字节数组的数据，每次读取会尽可能把数组装满
        数组一般设置为1024的整数倍  如1024 * 1024 * 5
*/

    public static void main(String[] args) throws IOException {

        //——————————————————————单个读取———————————————————————————
        //1.创建对象
        FileInputStream fis = new FileInputStream("aaa\\E.txt");

        //2.读取数据
        int read1 = fis.read();     //一次读取一个字符  如果读完还读就返回-1
        int read2 = fis.read();
        System.out.println(read1+" "+read2);

        //3.释放资源
        fis.close();

        //——————————————————————单个循环读取————————————————————————————
        FileInputStream fis1 = new FileInputStream("aaa\\E.txt");
        int i;
        while ((i = fis1.read()) != -1) {
            System.out.print((char)i);      //本来的中文乱码了 呃 正常之前写入的时候推断中文是三个负数 这里每一个就打印出来了
        }                                   // 中文'超标'被分解成了 87  111  114   108 100

        System.out.println();
        fis1.close();

        System.out.println("——————————————————————————————————————————");
        //——————————————————————多个读取————————————————————————————
        byte[] arr = new byte[5];
//        byte[] b = {1, 6, 7};     //效果一样的 都是读到一个就覆盖放到数组中

        FileInputStream fis2 = new FileInputStream("aaa\\E.txt");
        //一次读取多个字节数据，具体读多少，跟数组的长度有关
        //返回值: 本次读取到了多少个字节数据
        int len = fis2.read(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr,0,len));         //后面两个参数的意义:比如数组长度1024 但是我总共就20个数据   那么后面的就没有意义，而且还可能有上次使用没有被覆盖的值在后面
                                                                //中文不会乱码  但是要是没读取完就乱码
        fis2.close();




    }
}
