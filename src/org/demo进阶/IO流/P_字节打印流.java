package org.demo进阶.IO流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public abstract class  P_字节打印流 {
    /*构造方法                                                                  说明
public PrintStream(OutputStream/File/String)                             关联字节输出流/文件/文件路径
public PrintStream(String fileName, Charset charset)                     指定字符编码
public PrintStream(OutputStream out,boolean autoFlush)                   自动刷新
public PrintStream(OutputStream out,boolean autoFlush,String encoding)   指定字符编码且自动刷新

                字节流底层没有缓冲区，开不开自动刷新都一样

         成员方法                                                说明
public void write(int b)                                     常规方法:规则跟之前一样，将指定的字节写出
public void println(Xxx xx)                                  特有方法:打印任意数据，自动刷新，自动换行
public void print(Xxx xx)                                    特有方法:打印任意数据，不换行
public void printf(String format,Object... args)             特有方法:带有占位符的打印语句，不换行
*/
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("aaa\\print.txt");
        ps.write(97);
        ps.println(97);
        ps.print('A');
        ps.printf("小%s子", "太阳黑");

        ps.close();

        //——————————————————扩展——————————————————————-
        // 获取打印流的对象，此打印流在虚拟机启动的时候，由虚拟机创建，默认指向控制台
        // 特殊的打印流，系统中的标准输出流,是不能关闭，在系统中是唯一的。
        PrintStream out = System.out;
        out.println("ctrl");
        System.out.println("小黑子 说不出话了吧");

        System.out.close();

        System.out.println("树枝666");
        out.println("你干嘛 哎呦~");
    }
}
