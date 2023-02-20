package org.demo进阶.方法引用;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 练习 {
    public static void main(String[] args) {
        /*
        * 练习1:集合中存储一些字符串的数据，比如: 张三,23。
        *      收集到Student类型的数组当中(使用方法引用完成)
        * */
        System.out.println("\n——————练习1——————");
        练习1();

        /*
        * 练习2:创建集合添加学生对象，学生对象属性: name，age
        *      只获取姓名并放到数组当中(使用方法引用完成)
        * */
        System.out.println("\n——————练习2——————");
        练习2();

        /*
        * 练习3:创建集合添加学生对象，学生对象属性: name，age
        *      把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)     可后练习
        * */
        System.out.println("\n——————练习3——————");
        练习3();
    }



    private static void 练习1() {
        //集合中存储一些字符串的数据，比如: 张三,23。
        //收集到Student类型的数组当中
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,15", "周芷着,14", "赵,13", "张,20", "张三丰,100", "张深山,40", "张良,35", "王二麻子,37");

        Stu[] array = list.stream()
                .map(Stu::new)
                .toArray(Stu[]::new);

        System.out.println(Arrays.toString(array));

    }

    private static void 练习2() {
        //练习2:创建集合添加学生对象，学生对象属性: name，age
        //只获取姓名并放到数组当中(使用方法引用完成)
        ArrayList<Stu> list = new ArrayList<>();
        Stu s1 = new Stu("ikun",108);
        Stu s2 = new Stu("苏珊",23);
        Stu s3 = new Stu("树枝",66);
        Stu s4 = new Stu("小黑子",100);
        Collections.addAll(list, s1, s2, s3, s4);

        String[] array = list.stream()
                .map(Stu::getName)
                .toArray(String[]::new);

        System.out.println(Arrays.toString(array));
    }

    private static void 练习3() {
        //创建集合添加学生对象，学生对象属性: name，age
        //把姓名和年龄拼接成:张三-23的字符串，并放到数组当中(使用方法引用完成)     课后练习
        ArrayList<Stu> list = new ArrayList<>();
        Stu s1 = new Stu("ikun",167);
        Stu s2 = new Stu("苏珊",23);
        Stu s3 = new Stu("树枝",66);
        Stu s4 = new Stu("小黑子",10000);
        Collections.addAll(list, s1, s2, s3, s4);

        String[] array = list.stream()
                .map(Stu::strSplic)
                .toArray(String[]::new);
        System.out.println(Arrays.toString(array));


    }
}

class Stu{
    private String name;
    private int age;

    public Stu() {}

    //——————————————专门定制——————————————————
    public Stu(String str) {
        String[] arr = str.split(",");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
    }

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //——————————————专门定制——————————————————张三-23的字符串
    public String strSplic() {
        return this.name+"-"+this.age;
    }
    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Stu{name = " + name + ", age = " + age + "}";
    }
}