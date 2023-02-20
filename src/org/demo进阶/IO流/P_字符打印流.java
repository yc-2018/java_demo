//仰晨study 创建时间2023/2/4
package org.demo进阶.IO流;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class P_字符打印流 {
    /*          构造方法                                                             说明
public PrintWriter(write/File/String)                                            关联字节输出流/文件/文件路径
public PrintWriter(String fileName,Charset charset)                              指定字符编码
public PrintWriter(write w,boolean autoFlush)                                    自动刷新
public PrintWriter(OutputStream out,boolean autoFlush,Charset charset)           指定字符编码且自动刷新
    *
    *字符流底层有缓冲区，想要自动刷新需要开启
    *
    成员方法                                                   说明
public void write(...)                               常规方法:规则跟之前一样，写出字节或者字符串
public void println(Xxx xx)                          特有方法: 打印任意类型的数据并且换行
public void print(Xxx xx)                            特有方法:打印任意类型的数据，不换行
public void printf(String format,Object... args)     特有方法:带有占位符的打印语句，不换行
    * */
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("aaa\\printWriter.txt"));

        pw.write("今天你终于叫我名字了，虽然叫错了，但是没关系，我马上改");
        pw.println(true);
        pw.print("你好你好");
        pw.printf("%n%s爱上了%s", "ikun", "小黑子").printf("就%s还是元来的类型 可以%s","printf","链式");

        pw.close();
    }
}
