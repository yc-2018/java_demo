package org.demo.面向对象;

public class Hhh {
    private int age;
    private String name;
    public double socer;


    public Hhh() {
    }

    public Hhh(int age, String name, double socer) {
        this.age = age;
        this.name = name;
        this.socer = socer;
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
     * @return socer
     */
    public double getSocer() {
        return socer;
    }

    /**
     * 设置
     * @param socer
     */
    public void setSocer(double socer) {
        this.socer = socer;
    }

    public String toString() {
        return "Hhh{age = " + age + ", name = " + name + ", socer = " + socer + "}";
    }
}
