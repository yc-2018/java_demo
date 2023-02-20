package org.demo.接口;

public class C乒乓球运动员 extends B运动员 implements B说英语{
    public C乒乓球运动员() {
    }

    public C乒乓球运动员(String name, int age) {
        super(name, age);
    }

    @Override
    public void 学英语() {
        System.out.println("乒乓球运动员" + this.getName() + "正在学英语" + B说英语.a);//静态方便调用
    }

    @Override
    public void 学习() {
        System.out.println(this.getName() + "在学习打乒乓球");
    }

    @Override
    public void 接口默认方法() {
        System.out.println(this.getName() + "修改了接口里面的默认方法");
    }
}
