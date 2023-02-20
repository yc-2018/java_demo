package org.demo进阶.file类;

import java.io.File;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public abstract class B_File类的获取 {
    public static void main(String[] args) {
        /*      方法名称                                说明
        public long length()                    返回文件的大小(字节数量)
        public String getAbsolutePath()         返回文件的绝对路径
        public String getPath()                 返回定义文件时使用的路径
        public String getName()                 返回文件的名称，带后缀
        public long lastModified()              返回文件的最后修改时间 (时间毫秒值)
      */

        //1.length 返回文件的大小 (字节数量)
        //细节1:这个方法只能获取文件的大小，单位是字节
        //如果单位我们要是M，G，可以不断的除以1024
        //细节2:这个方法无法获取文件来的大小            文件夹会返回4096    不存在的返回0
        //如果我们要获取一个文件夹的大小，需要把这个文件夹里面所有的文件大小都累加在一起。
        System.out.println("————————————————————————————————————————————————————————————length");

        File f1 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件\\B文件的获取.java");
        long len = f1.length();
        System.out.println(len);

        File f2 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件");
        long len1 = f2.length();
        System.out.println(len1);

        System.out.println("\n————————————————————————————————————————————————————————————getAbsolutePath");

        //2.getAbsolutePath 返回文件的绝对路径
        File f3 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件\\B文件的获取.java");
        String path1 = f3.getAbsolutePath();
        System.out.println(path1);

        File f4 = new File("src\\org\\demo进阶\\文件\\B文件的获取.java");
        String path2 = f4.getAbsolutePath();
        System.out.println(path2);

        System.out.println("\n————————————————————————————————————————————————————————————getPath");

        ////3.getPath 返回定义文件时使用的路径
        File f5 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件\\B文件的获取.java");
        String path3 = f5.getPath();
        System.out.println(path3);

        File f6 = new File("src\\org\\demo进阶\\文件\\B文件的获取.java");
        String path6 = f6.getPath();
        System.out.println(path6);


        System.out.println("\n————————————————————————————————————————————————————————————getName");
        //4.getName 获取名宁
        //细节1:
        //a.txt:
        //      a 文件名
        //      txt 后缀名、扩展名
        // 细节2:
        //文件夹:返回的就是文件来的名字
        //******说那么多都是废话******就相当于切割返回最后一段  才不管路径存不存在*******

        File f7 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件\\B文件的获取.java");
        System.out.println(f7.getName());
        File f8 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件");
        System.out.println(f8.getName());
        File f9 = new File("E:\\idea\\不存在的");
        System.out.println(f9.getName());


        System.out.println("————————————————————————————————————————————————————————————lastModified");
        //5.lastModified 返回文件的最后修改时间(时间毫秒值)
        File f10 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件\\B文件的获取.java");
        System.out.println(f10.lastModified());
        File f11 = new File("E:\\idea\\java20220916\\src\\org\\demo进阶\\文件");
        long time = f11.lastModified();
        System.out.println(time);
        File f12 = new File("E:\\idea\\不存在的");
        System.out.println(f12.lastModified());

        //如何把时间的毫秒值变成字符串表示的时间呢?
        //课堂练习
        //yyyy年MM月dd日 HH: mm: ss
        ZonedDateTime dateTime = Instant.ofEpochMilli(time).atZone(ZoneId.of("Asia/Shanghai"));
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String format = formatDate.format(dateTime);
        System.out.println(format);
    }
}
