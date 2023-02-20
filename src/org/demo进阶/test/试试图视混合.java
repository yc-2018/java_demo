//仰晨study 创建时间2023/2/7 3:29 星期二
package org.demo进阶.test;

import java.io.*;

public class 试试图视混合 {//结果是不行————————————————————————————
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("E:\\Users\\Dell\\Desktop\\一手托腮.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\Users\\Dell\\Desktop\\Rec 0001.mp4",true));

        int ch;
        while ((ch = bis.read()) != -1) {
            bos.write(ch);
        }
        bos.close();
        bis.close();
    }
}
