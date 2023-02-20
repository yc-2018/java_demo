package org.demo进阶.泛型;

import java.util.ArrayList;
import java.util.Iterator;


public class 泛型Demo {
    public static void main(String[] args) {
        //1.创建集合的对象
        ArrayList list = new ArrayList();

        //添加元素
        list.add(123);
        list.add("ikun");
        list.add(new Student("苏珊", 23));

        //遍历获取每个元素
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object obj = it.next();
            //多态的弊端是不能访问子类的特有功能
            //obj.length();
            System.out.println(obj);
        }
        Student o = (Student)list.get(2);
        o.study();

//-----------------------------------------------------
        System.out.println("---------添加泛型------------");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("苏珊");
        list1.add("荔枝");
        list1.add("鸡脚");
        list1.add("树枝");

        list1.forEach(s -> System.out.printf("%s的长度是%d个字%n",s,s.length()));


    }
}

//-------------------------------------------pojo-----------------------------------------------------
class Student {
    private String name;
    private int age;


    public Student() {
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

    public void study() {
        System.out.println("学习");
    }
}