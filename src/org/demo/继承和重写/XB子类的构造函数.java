package org.demo.继承和重写;

public class XB子类的构造函数 extends XA父类 {
    private double kg;

    // 空参构造
    public XB子类的构造函数() {}
    // 带全部参数的构造  父类+子类
    public XB子类的构造函数(String name, int age, double kg) {
        super(name, age);
        this.kg = kg;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }
}
