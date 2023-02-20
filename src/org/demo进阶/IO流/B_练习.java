package org.demo进阶.IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class B_练习 {
    //文件拷贝  小视频
        //要求统计一下拷贝时间，单位毫秒
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\S视频\\完成的\\PR衣服_20190624.mp4");
        FileOutputStream fos = new FileOutputStream("aaa\\v.mp4");      //吗的  追加了 时长不变大小翻倍

        long beginTime = System.currentTimeMillis();

        int b;
        while ((b = fis.read()) != -1) fos.write(b);    //核心思想: 边读边写

        //释放资源
        //      规则: 先开的最后关闭
        fos.close();
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("打印复制完成，时间为"+(endTime-beginTime));

    }
}
