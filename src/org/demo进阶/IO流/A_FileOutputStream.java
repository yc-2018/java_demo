package org.demo进阶.IO流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public abstract class A_FileOutputStream {//操作本地文件的字节输出流，可以把程序中的数据写到本地文件中。是字节流的基本流
    /*书写步骤:
        1、创建字节输出流对象
        2、写数据
        3、资源

        FileOutputStream写数据的3种方式
        方法名称                               说明
void write(int b)                         次写一个字节数据
void write(byte[] b)                      一次写一个字节数组数据
void write(byte[] b,int off，int len)     一次写一个字节数组的部分数据
     */
    public static void main(String[] args) throws IOException {
        //实现需求:写出一段文字到本地文件中。 (暂时不写中文)  ——————呃 我就用了 还挺好用 说麻烦呢 都是骗不去试试的人的
        //实现步骤:
        //      创建对象
                    //细节1:参数是字符串表示的路径或者File对象都是可以的
                    //细节2:如果文件不存在会创建一个新的文件，但是要保证父级路径是存在的(不存在就报错FileNotFoundException
                    //细节3:如果文件已经存在，则会清空文件
        //      写出数据
                    //细节: write方法的参数是整数，但是实际上写到本地文件中的是整数在ASCII上对应的字符——写出整数、写出字节数组、换行写
        //      释放资源
                    //细节:每次使用完流之后都要释放资源——关闭通道
        /*换行写::::::::::::::::::::::::::::::::::::::::::::::::::::::::
            再次写出一个换行符就可以了
            windows:\r\n
            Linux:\n
            Mac:\r
         细节:
            在windows操作系统当中，java对回车换行进行了优化。
            虽然完整的是\r\n，但是我们写其中一个\r或者\n，
            java也可以实现换行，因为java在底层会补全。
        建议:
            不要省略，还是写全了。
        ****************************************************************/

        //创建对象——————————————————————————————————————————————————————————————
        FileOutputStream fos = new FileOutputStream("aaa\\b.txt");

        //写入数据
        fos.write(65);      //写入的是A
        fos.write(79);      //       O

        //释放资源
        fos.close();

        //——————————————————————————————————————————————————————————————————————
        FileOutputStream fos1 = new FileOutputStream("aaa\\c.txt");
        byte[] arr = {65, 66, 67, 68};
        fos1.write(arr);                //ABCD
        fos1.close();

        FileOutputStream fos2 = new FileOutputStream("aaa\\d.txt");
        //参数一:数组
        //参数二:开始索引
        //参数三:个数
        fos2.write(arr,1,2);    //BC
        fos2.close();

        //——————————————————————————————————————————————————————————————————————
        //要记ASCII码？不可能
        String str = "Hello World 超标 \r\n 666";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));
        FileOutputStream fos3 = new FileOutputStream("aaa\\E.txt");
        fos3.write(bytes);
        fos3.write("\r\n".getBytes());
        fos3.write("调用close之前 还是可以继续追加的。很神奇这样输出的居然是中文本身".getBytes());
        byte[] arr1 = {97,97,97,97,97,-24, -74, -123, -26, -96, -121};  //这个数组输出的居然是：aaaaa超标
        fos3.write(arr1);
        fos3.close();

        //追加不覆盖——————————————————————————————————————————————————————————————————————文件不存也会创建
        FileOutputStream fos4 = new FileOutputStream("aaa\\E.txt",true);
        fos4.write("\r\n如果想要续写，打开续写开关即可\n开关位置:创建对象的第二个参数".getBytes());  //记事本打开提示换行符不一致...
        fos4.write("\r\n默认false: 表示关闭续写，此时创建对象会清空文件\n手动传递true:表示打开续写，此时创建对象不会清空文件".getBytes());
        fos4.close();
    }
}
