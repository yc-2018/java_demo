package org.demo.接口;

public class C篮球教练 extends B教练{
    public C篮球教练() {
    }

    public C篮球教练(String name, int age) {
        super(name, age);
    }

    @Override
    public void 教() {
        System.out.println(this.getName() + "教练教学打篮球🏀已经两年半");
    }
}
