package org.demo.字符串;

public class 字符串变字符数组 {
    public static void main(String[] args) {
        String str = "ikun or 小黑子";
        char[] strArr = str.toCharArray();
        System.out.println(strArr[8]);
        strArr[8]='大';
        //字符数组转回字符串
        String str1 = new String(strArr);
        System.out.println(str1);
    }
}
