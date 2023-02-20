//仰晨study 创建时间2023/2/4 22:32 星期六
package org.demo进阶.IO流;

import cn.hutool.core.io.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class S_hutoolTest {//没有close方法
    public static void main(String[] args) {
        /*
        file: 根据参数创建一个file对象
        touch: 根据参数创建文件

        writeLines: 把集合中的数据写出到文件中，覆盖模式。
        appendLines: 把集合中的数据写出到文件中，续写模式。
        readLines; 指定字符编码，把文件中的数据，读到集合中。
        readUtf8Lines: 按照UTF-8的形式，把文件中的数据，读到集合中
        copy: 拷贝文件或者文件夹*/

        File file = FileUtil.file("D:\\", "qqq", "ppp", "666.txt");
        File file1 = FileUtil.file("aaa", "bbb", "666.txt");        //会自动拼接成绝对路径
        System.out.println(file);
        System.out.println(file1);

        File touch = FileUtil.touch(file1);     //文件夹路径存在 就创建文件  不存在 就什么都不发生
        //感觉路径有问题   可能是编译成class文件就在out文件夹里面 就在out里面运行
        System.out.println(touch);// E:\idea\java20220916\out\production\java20220916\aaa\bbb\666.txt


        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("小黑子");


        //writeLines: 把集合中的数据写出到文件中，覆盖模式。
        FileUtil.writeLines(list, file, "UTF-8");   //编码会被最下面的顶掉
        //把集合中的数据写出到文件中，续写模式。
        File file2 = FileUtil.appendLines(list, file, "GBK");     //父级路径不存在也能写
        System.out.println(file2);

        List<String> list1 = FileUtil.readLines("..\\..\\..\\aaa\\E.txt", "UTF-8"); //没有会报错 自动拼接在out文件夹下了
        list1.forEach(System.out::println);

        File copy = FileUtil.copy("D:\\qqq\\ppp\\666.txt", "D:\\zzz.txt", true);//isOverride:存在是否覆盖
        System.out.println(copy);
    }
}
