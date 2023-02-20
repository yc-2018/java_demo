package org.demo.继承和重写;

public class U默认值 {
    private String name;
    private int age;
    private String school;


    //默认值   new 空参构造时  自动赋值给有参构造
    public U默认值() {
        this(null,0,"ikun大学");
    }

    public U默认值(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }




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
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
