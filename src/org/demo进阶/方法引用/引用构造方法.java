package org.demo进阶.方法引用;

import java.util.ArrayList;
import java.util.Collections;

public class 引用构造方法 {
    /*
    * 格式:类名::new
    * 范例: student::new
    */
    public static void main(String[] args) {
        /*练习:
         * 集合里面存储姓名和年龄，比如:张无忌,15
         * 要求:将数据封装成Student对象并收集到List集合中
         * */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌,108", "周芷若,18", "赵敏,25", "张强,66", "张三丰,999");

        list.stream().map(Student::new).forEach(System.out::println);
    }
}

class Student{
    private String name;
    private int age;

    public Student() {
    }

    //——————————————专门定制——————————————————
    public Student(String str) {
        String[] arr = str.split(",");
        this.name = arr[0];
        this.age = Integer.parseInt(arr[1]);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "Student{name = " + name + ", age = " + age + "}";
    }
}