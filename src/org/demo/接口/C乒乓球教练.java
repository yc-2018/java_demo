package org.demo.接口;

public class C乒乓球教练 extends B教练 implements B说英语{
    public C乒乓球教练() {
    }

    public C乒乓球教练(String name, int age) {
        super(name, age);
    }

    @Override
    public void 教() {
        System.out.println(this.getName()+ "只在教学乒乓球");
    }

    @Override
    public void 学英语() {
        System.out.println(this.getName()+ "教练正在学习讲英语");
    }
}
