package org.demo.静态变量;

public class 静态变量 {
        /*
            被static修饰的成员变量，叫做静态变量
            特点:
            被该类所有对象共享
            不属于对象，属于类
            随着类的加载而加载，优先于对象存在       # 加载在堆空间的静态区
            调用方式:
            类名调用(推荐)
            对象名调用
        */

        String stuName;
        int age;
        static String teacherName;      // 静态变量


    public void show(){
        System.out.println("Ta叫"+stuName+"  年龄"+age+"  老师是"+teacherName);
    }
}
