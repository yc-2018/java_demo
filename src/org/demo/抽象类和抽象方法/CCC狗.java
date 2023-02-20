package org.demo.抽象类和抽象方法;

public class CCC狗 extends BBB动物{
    public CCC狗() {
    }

    public CCC狗(String name, int age) {
        super(name, age);
    }

    @Override
    public void 吃() {
        System.out.println("狗子在吃骨头");
    }
}
