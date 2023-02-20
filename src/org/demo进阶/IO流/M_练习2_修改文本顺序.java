package org.demo进阶.IO流;

import java.io.*;
import java.util.*;

public class M_练习2_修改文本顺序 {
    //需求:把《出师表》的文章顺序进行恢复到一个新文件中
    public static void main(String[] args) throws IOException {
        普通方法();

        Tree方法();
    }

    private static void Tree方法() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("aaa\\csb.txt"));


        TreeMap<Integer, String> tm = new TreeMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            //0: 序号 1 : 内容
            tm.put(Integer.parseInt(line.split("\\.")[0]), line);   //想不带序号就line  带序号 就~[1]
        }
        br.close();

        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa\\出师表T.txt"));
        Set<Map.Entry<Integer, String>> entries = tm.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            bw.write(entry.getValue());
            bw.newLine();
        }
        bw.close();

    }

    private static void 普通方法() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("aaa\\csb.txt"));


        ArrayList<String> list = new ArrayList<>();
        String s;
        while ((s = br.readLine()) != null) {
            list.add(s);
        }
        //按序号排序
        list.sort(Comparator.comparingInt(o -> Integer.parseInt(o.split("\\.")[0])));

        //写出
        BufferedWriter bw = new BufferedWriter(new FileWriter("aaa\\出师表。.txt"));
        for (String s1 : list) {
            bw.write(s1);
            bw.newLine();
        }
        bw.close();
    }
}
