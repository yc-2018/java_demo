package org.demo进阶.IO流;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringJoiner;

public class J_练习3_修改文件内容 {
    /*文本文件中有以下的数据:
        2-1-9-4-7-8
        将文件中的数据进行排序，变成以下的数据
        1-2-4-7-8-9

        细节1:
            文件中的数据不要换行
        细节2:
            bom头
    */
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("aaa\\排序.txt");
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fr.read()) != -1) {
            sb.append((char)ch);
        }
        fr.close();

        //排序
        //好理解但多代码(sb);
        难理解却少代码(sb);
    }

    private static void 难理解却少代码(StringBuilder sb) throws IOException {
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        //写出
        FileWriter fw = new FileWriter("aaa\\已排序.txt");
        String s = Arrays.toString(arr).replace(", ", "-");
        String result = s.substring(1, s.length() - 1);
        fw.write(result);
        fw.close();

    }

    private static void 好理解但多代码(StringBuilder sb) throws IOException {


        String[] arr = sb.toString().split("-");
        ArrayList<Integer> list = new ArrayList<>();
        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        StringJoiner sj = new StringJoiner("-", "", "");
        for (Integer i : list) {
            sj.add(i + "");
        }

        //写出
        FileWriter fw = new FileWriter("aaa\\已排序.txt");
        fw.write(sj.toString());
        fw.close();
    }
}
