package org.demo.继承和重写;

public class C中华狸花猫 extends B猫{
    public C中华狸花猫() {
        //子类的构造方法隐藏了super（）去访问父类的无参构造
        super();
        System.out.println("狸花猫类的构造方法   会先访问猫类的空参构造");
    }
}
