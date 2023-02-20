package org.demo.字符串;

public class 字符串的替换 {//.replace
    public static void main(String[] args) {
        //获取你说的话
        String s = "ntmd,你玩的真好下次别玩了sb";
        //定义一个敏感词库
        String[] sArr = {"tmd","sb","ctmd","mlgb"};

        for (String value : sArr) {
            s = s.replace(value, "***");

        }
        System.out.println(s);


    }
}
