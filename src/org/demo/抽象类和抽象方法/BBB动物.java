package org.demo.抽象类和抽象方法;

public abstract class BBB动物 {
    private String name;
    private int age;


    public BBB动物() {}

    public BBB动物(String name, int age) {
        this.name = name;
        this.age = age;
    }


    //定义普通方法
    public void 喝水(){
        System.out.println("喝水ing");
        return;
    }

    //定义抽象方法********************************
    public abstract void 吃();


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
