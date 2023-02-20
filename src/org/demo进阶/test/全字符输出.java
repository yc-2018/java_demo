package org.demo进阶.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class 全字符输出 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa\\java GBK 字符全输出.txt", Charset.forName("GBK")));
        for (int i = 32; i < 2000000; i++) {
            bw.write(i);
        }
        bw.close();
    }
}
