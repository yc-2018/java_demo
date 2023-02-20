package org.demo.静态变量;

public class 静态变量test {
    public static void main(String[] args) {
        静态变量.teacherName = "小黑子老师";     //类名直接点         # 其实只能存在一个
        静态变量 s1 = new 静态变量();
        s1.stuName = "纯路人";
        s1.age=18;
        s1.teacherName="吊毛";
        s1.show();                          //Ta叫纯路人  年龄18  老师是吊毛       # 一般用类名来点的

        静态变量 s2 = new 静态变量();
        s2.stuName = "真癌粉";
        s2.age=66;
        s2.show();                          //  Ta叫真癌粉  年龄66  老师是吊毛     # s1点的s2 也变了
    }
}
