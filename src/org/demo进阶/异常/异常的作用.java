package org.demo进阶.异常;

public class 异常的作用 {
    public static void main(String[] args) {
        //异常作用一: 异常是用来查询bug的关键参考信息异常
        //作用二:异常可以作为方法内部的一种特殊返回值，以便通知调用者底层的执行情况

        /*Person[] arr = new Person[3];       // null null null
        String name = arr[0].getName();     //报空指针异常 NullPointerException
        System.out.println(name);*/

        Person p = new Person();
        p.setName("ikun");
        //年龄要求在18--30之间
        p.setAge(108);              //自行写控制年龄 不在范围直接报错 RuntimeException
                                    //选择1: 自己悄悄处理
                                    //选择2: 打印在控制台上
        System.out.println(p);

    }
}


class Person{
    private String name;
    private int age;


    public Person() {
    }

    public Person(String name, int age) {
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
        if (age < 18 || age > 30)
            throw new RuntimeException();
        else
            this.age = age;
    }

    public String toString() {
        return "Person{name = " + name + ", age = " + age + "}";
    }
}