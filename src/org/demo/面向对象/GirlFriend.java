package org.demo.面向对象;

public class GirlFriend {
    private String name;
    private int age;
    private String gender;


    //无参构造方法
    public GirlFriend() {}
    //全参构造方法
    public GirlFriend(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
//针对于每一个私有化的成员变量，都要提供get和set方法
    //set方法: 给成员变量赋值
    //get方法: 对外提供成员变量的值



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18 && age <= 26) {
            this.age = age;
        }else System.out.println("非法输入");


    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void sleep(){
        System.out.println("女朋友在睡觉");
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }
}
