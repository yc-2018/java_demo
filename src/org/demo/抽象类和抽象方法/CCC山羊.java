package org.demo.抽象类和抽象方法;

public class CCC山羊 extends BBB动物{
    public CCC山羊() {}

    public CCC山羊(String name, int age) {
        super(name, age);
    }

    @Override
    public void 吃() {
        System.out.println(this.getName()+"在吃草");
    }

    @Override
    public void 喝水() {
        System.out.println("喝悲伤的苦瓜汤");
    }
}
