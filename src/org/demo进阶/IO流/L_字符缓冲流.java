package org.demo进阶.IO流;

import java.io.*;

public abstract class L_字符缓冲流 {
    //BufferedReader字符缓冲输入流
    //BufferedWriter字符缓冲输出流


    /*字符缓冲流的构造方法
            方法名称                             说明
public BufferedReader(Reader r)          把基本流变成高级流
public BufferedWriter(writer r)          把基本流变成高级流

原理:底层自带了长度为8192的缓冲区提高性能  提高的并不明显  因为字符流本身就带有有8192的数组  但是这个可以指数组的大小,写第二个参数 写大点也可以提高效率吧


字符缓冲流特有方法
字符缓冲输人流特有方法
public String readLine()        //读取一行数据，如果没有数据可读了，会返回null
                                //细节:
                                //readLine方法在读取的时候，一次读一整行，遇到回车换行结束
                                //但是他不会把回车换行读到内存当中

字符缓冲输出流特有方法
public void newLine()           //跨平台的换行   Mac:\r  Linux:\n   Windows:\r\n
*/
    public static void main(String[] args) throws IOException {
        //————————————————————输入流————————————————————————————————————————
        BufferedReader br = new BufferedReader(new FileReader("aaa\\E.txt"));
        //System.out.println(br.readLine());  //Hello World

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        br.close();

//————————————————————————————————————————————输出流——————————————————————————————-
        BufferedWriter bf = new BufferedWriter(new FileWriter("aaa\\g.txt"));
        bf.write("你嘴角上扬的样子，百度搜索不到");
        bf.newLine();
        bf.write("以后如果我结婚了，你一定要来哦，没有新娘我会很尴尬");
        bf.newLine();
        bf.close();
    }
}
