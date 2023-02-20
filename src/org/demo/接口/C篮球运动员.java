package org.demo.接口;

public class C篮球运动员 extends B运动员{
    public C篮球运动员() {
    }

    public C篮球运动员(String name, int age) {
        super(name, age);
    }

    @Override
    public void 学习() {
        System.out.println(this.getName()+ "正在打篮球⛹，已经练习两年半");
    }


}
