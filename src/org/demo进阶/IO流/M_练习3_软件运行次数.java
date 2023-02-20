package org.demo进阶.IO流;

import java.io.*;

public class M_练习3_软件运行次数 {
    /*
    实现一个验证程序运行次数的小程序，要求如下:
            1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
            2.程序运行演示如下:
                第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
                第二次运行控制台输出: 欢迎使用本软件,第2次使用免费
                第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
                第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("aaa\\count.txt"));
        int count = Integer.parseInt(br.readLine());

        if ((++count) <= 3) {
            System.out.println("欢迎使用本软件,第"+count+"次使用免费~");
            BufferedWriter bw = new BufferedWriter(new FileWriter("aaa\\count.txt"));  //老师写在if外面
            bw.write("" + count);   //如果写数字 就会输出数字对应的字符  所以 要加“”
            bw.close();
        }else {
            System.out.println("本软件只能免费使用3次,欢迎您注册会员后继续使用~");
        }
    }
}
