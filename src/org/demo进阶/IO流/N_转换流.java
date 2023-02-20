package org.demo进阶.IO流;

import java.io.*;
import java.nio.charset.Charset;

public abstract class N_转换流 {//JDK要11的才行不然报错
    /*
    需求1:手动创建一个GBK的文件，把文件中的中文读取到内存中，不能出现乱码
    需求2:把一段中文按照GBK的方式写到本地文件
    需求3:将本地文件中的GBK文件，转成UTF-8
    */


    public static void main(String[] args) throws IOException {

        //————————————读GBK——————————————————————————————————————————————————————————————————————
        /*//利用转换流按照指定字符编码读取(了解)

        //1.创建对象并指定字符编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("aaa\\GBK.txt"), "GBK");
        //2.读取数据
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.print((char)ch);
        }
        isr.close();*/

        FileReader fr = new FileReader("aaa\\GBK.txt", Charset.forName("GBK"));
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();


        //————————————写GBK——————————————————————————————————————————————————————————————————————
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaa\\gbkk.txt"), Charset.forName("GBK"));
        osw.write("有笔食不食");
        osw.close();*/

        FileWriter fw = new FileWriter("aaa\\gbkk.txt", Charset.forName("GBK"));
        fw.write("油饼食不食");
        fw.close();

        //————————————读GBK—写UTF-8—————————————————————————————————————————————————————————————————————
        // JDK11以前的方案
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("aaa\\gbkk.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("aaa\\gbk_utf-8.txt"), "UTF-8");

        int ch1;
        while ((ch1 = isr.read()) != -1) {
            osw.write(ch1);
        }
        osw.close();
        isr.close();*/

        // 替代方案
        FileReader fr1 = new FileReader("aaa\\gbkk.txt", Charset.forName("GBK"));
        FileWriter fw1 = new FileWriter("aaa\\gbk_utf-8.txt", Charset.forName("UTF-8"));

        int ch1;
        while ((ch1 = fr1.read()) != -1) {
            fw1.write(ch1);
        }
        fr1.close();
        fw1.close();

    }
}
class 练习{
    /*步骤
     * 读取文件中的数据
     * 利用字节流读取文件中的数据，每次读一整行，而且不能出现乱码
     * */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("aaa\\E.txt")));
        String line = br.readLine();
        System.out.println(line);
    }
}

/*总结
1转换流的名字是什么?
    字符转换输入流:InputStreamReader
    字符转换输出流:OutputStreamWriter
2.转换流的作用是什么?
    指定字符集读写数据(DK11之后已淘汰
    字节流想要使用字符流中的方法了
    */