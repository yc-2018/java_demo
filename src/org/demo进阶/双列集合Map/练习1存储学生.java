package org.demo进阶.双列集合Map;

import java.util.HashMap;
import java.util.Objects;
import java.util.function.BiConsumer;

/*需求
创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)
存储三个键值对元素，并遍历
要求:同姓名，同年龄认为是同一个学生*/
public class 练习1存储学生 {
    public static void main(String[] args) {
        Student s1 = new Student("ikun", 108);
        Student s2 = new Student("苏珊", 23);
        Student s3 = new Student("香菜凤仁鸡", 25);
        Student s4 = new Student("ikun", 108);

        HashMap<Student, String> hm = new HashMap<>();

        hm.put(s1, "蔡徐村");
        hm.put(s2, "荔枝市");
        hm.put(s3, "篮球区");
        hm.put(s4, "蔡徐村");

        hm.forEach((student, s) -> System.out.println(student+"————"+s));
    }
}


class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
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