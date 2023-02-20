package org.demo.接口;

// 因为现在我不想让外界去直接创建人的对象
// 因为直接创建顶层父类人的对象此时是没有意义的
// 所以我就把他写为抽象的。
public abstract class A人 {
    private String name;
    private int age;

    public A人() {
    }

    public A人(String name, int age) {
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

}
