package org.demo进阶.IO流;

import java.io.Serializable;

/*
使用对象输出流将对象保存到文件时会出现NotSerializableException异常
解决方案:需要让Javabean类实现Serializable接口
*/
public class O_student implements Serializable {
    /* Serializable接口里面是没有抽象方法，标记型接口
     * 一旦实现了这个接口，那么就表示当前的student类可以被序列化
     * 理解:
     *      一个物品的合格证
     * */

    private static final long serialVersionUID = 6854656257737776528L;
    private String name;
    //transient: 瞬态关键字
    //作用:不会把当前属性序列化到本地文件当中
    private transient int age;


    public O_student() {
    }

    public O_student(String name, int age) {
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
        return "O_student{name = " + name + ", age = " + age + "}";
    }
}
