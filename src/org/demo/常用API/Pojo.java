package org.demo.常用API;

import java.util.Objects;
//克隆就是要实习这个空接口  不然会报错的哇
public class Pojo implements Cloneable{
    private String name;
    private int age;
    private char xb;//性别
    private long id;


    public Pojo() {
    }

    public Pojo(String name, int age, char xb, long id) {
        this.name = name;
        this.age = age;
        this.xb = xb;
        this.id = id;
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

    /**
     * 获取
     * @return xb
     */
    public char getXb() {
        return xb;
    }

    /**
     * 设置
     * @param xb
     */
    public void setXb(char xb) {
        this.xb = xb;
    }

    /**
     * 获取
     * @return id
     */
    public long getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "pojo{name = " + name + ", age = " + age + ", xb = " + xb + ", id = " + id + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pojo pojo = (Pojo) o;
        return age == pojo.age && xb == pojo.xb && id == pojo.id && Objects.equals(name, pojo.name);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // 调用父类中的clone方法
        // 相当于让Java帮我们克隆一个对象，并把克降之后的对象返回出去。
        return super.clone();
    }

}
