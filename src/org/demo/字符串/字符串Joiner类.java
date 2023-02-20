package org.demo.字符串;

import java.util.StringJoiner;

public class 字符串Joiner类 {
    /*JDK8出现的一个可变的操作字符串的容器，可以高效，方便的拼接字符串
    * 方法名                                                         说明
public StringJoiner(间隔符号)                          创建一个StringJoiner对象，指定拼接时的间隔符号
public StringJoiner (间隔符号，开始符号，结束符号)        创建一个StringJoiner对象，指定拼接时的间隔符号开始符号、结束符号
     */
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("+","[","]");
        sj.add("必须是字符串类型的").add("123").add("这个类就是用来拼接的").add(String.valueOf(66)).add(""+77).add(Integer.toString(167));
        System.out.println(sj);
        String str = sj.toString();
        System.out.println(str);

    }
}
