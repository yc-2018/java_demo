package org.demo.继承和重写;

public class C哈士奇 extends B狗{
    public void breakHome(){
        System.out.println("哈士奇 在拆家 谢谢");
    }

    // @Override是方法重写的注解（一般都要写上，当然不写也不会报错
    @Override
    public void eat() {
        super.eat();                            //本来父类的 用就留着，没有用就删掉
        System.out.println("哈奇士在吃小黑子");   //相当于额外添加的
    }
}
