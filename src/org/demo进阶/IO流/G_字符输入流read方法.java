package org.demo进阶.IO流;

import java.io.FileReader;
import java.io.IOException;

public abstract  class G_字符输入流read方法 {
    //字符流
    //字符流的底层其实就是字节流
    //字符流=字节流+字符集

// 特点
// 输入流:一次读一个字节，遇到中文时，一次读多个字节
// 输出流:底层会把数据按照指定的编码方式进行编码，变成字节再写到文件中

    //使用场景
    //对于纯文本文件进行读写操作
    public static void main(String[] args) throws IOException {
        /*
1、创建字符输入流对象
            构造方法                              说明
public FileReader(File file)            创建字符输入流关联本地文件
public FileReader(String pathname)      创建字符输入流关联本地文件
细节1:如果文件不存在，就直接报错

2、读取数据
        成员方法                             说明
public int read()                   读取数据，读到末尾返回-1
public read(char[] buffer)          读取多个数据，读到末尾返回-1
细节1:按字节进行读取，遇到中文，一次读多个字节，读取后解码并转成十进制，最终把这个十进制作为返回值
     这个十进制的数据也表示在字符集上的数字
     英文: 文件里面二进制数据 0110 0001
        read方法进行读取，解码并转成十进制97
     中文: 文件里面的二进制数据 11100110 10110001 10001001
         read方法进行读取，解码并转成十进制27721
     想看到中文汉字，就是把这些十进制数据，再进行强转就可以了
细节2:读到文件末尾了，read方法返回-1。


3、释放资源
    成员方法                成员方法
public int close()      释放资源/关流
*/
//无参————————————————————————————————————————————————————————————————
        //1.创建对象并关联本地文件
        FileReader fr = new FileReader("aaa\\E.txt");

        //字符流的底层也是字节流，默认也是一个字节一个字节的读取的。
        //如果遇到中文就会一次读取多个，GBK一次读两个字节，UTF-8一次读三人字节

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);            //换行符 \r\n 会被认为2个字符
        }
        fr.close();


//有参————————————————————————————————————————————————————————————————
        System.out.println("\n\n——————————————————————————————————————————");
        FileReader fr1 = new FileReader("aaa\\E.txt");
        char[] chars = new char[2];
        int len;
        //read(chars): 读取数据，解码，强转三步合并了，把强转之后的字符放到数组当中
        //空参的read + 强转类型转换
        while ((len = fr1.read(chars)) != -1) {
            //把数组中的数据变成字符串再进行打印
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
