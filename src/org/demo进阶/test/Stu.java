package org.demo进阶.test;

public class Stu {
    private String name;
    private int age;

    public Stu() {
    }

    public Stu(String name, int age) {
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
        return "Stu{name = " + name + ", age = " + age + "}";
    }

    public int nameLen() {
        int count=0;
        for (int i = 0; i < this.name.length(); i++) {
            count++;
        }
        return count;
    }
}
