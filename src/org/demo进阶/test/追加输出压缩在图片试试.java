//仰晨study 创建时间2023/2/6 17:21 星期一
package org.demo进阶.test;

import java.io.*;

public class 追加输出压缩在图片试试 {

    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\Users\\Dell\\Desktop\\myio.rar"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\Users\\Dell\\Desktop\\1.png",true));
        int ch;
        while ((ch = bis.read()) != -1) bos.write(ch);
        bos.close();
        bis.close();
    }
}
