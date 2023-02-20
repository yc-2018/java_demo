package org.demo.抽象类和抽象方法;

public class CCC青蛙 extends BBB动物{
    //被忘了构造方法
    public CCC青蛙() {}

    public CCC青蛙(String name, int age) {
        super(name, age);
    }

    @Override
    public void 吃() {
        System.out.println("青蛙吃虫子");
    }
}
