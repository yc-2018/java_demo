package org.demo进阶.IO流;

import java.io.FileWriter;
import java.io.IOException;

public abstract  class H_字符输出流FileWriter {
    /*FileWriter成员方法
    成员方法                                    说明
void write(int c)                           写出一个字符
void write(String str)                      写出一个字符串
void write(String str,int off,int len)      写出一个字符串的一部分
void write(char[] cbuf)                     写出一个字符数组
void write(char[] cbuf,int off,int len)     写出字符数组的一部分

书写细节
1.创建字符输出流对象
    细节1:参数是字符串表示的路径或者File对象都是可以的
    细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的
    细节3:如果文件已经存在，则会清空文件，如果不想清空可以打开续写开关
2.写数据
    细节: 如果write方法的参数是整数，但是实际上写到本地文件中的是整数在字符集上对应的字符
3.释放资源
    细节:每次使用完流之后都要释放资源
*/
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("aaa\\f.txt");
        String str = "ikun小黑子";
        char[] c = {'树', '枝', '6', '6', '6'};
        //写出一个字符
        fw.write(66);
        fw.write(32);
        fw.write(32);
        fw.write(25105);//我

        //写出一个字符串
        fw.write(str);

        //写出一个字符串的一部分
        fw.write(str,0,4);

        //写出一个字符数组
        fw.write(c);

        //写出一个字符数组的一部分
        fw.write(c,2,3);

        fw.close();
    }
}
