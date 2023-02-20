package org.demo.继承和重写;

public class Xtest构造方法 {
    public static void main(String[] args) {
        XC子子类 子子类 = new XC子子类();
        子子类.setCm(182);             //本身的
        子子类.setName("小黑子");       //父类的父类的
        子子类.setAge(22);              //父类的父类的
        子子类.setKg(131.4);               //父类的


        System.out.println(子子类.getName()+子子类.getCm()+" 今年"+子子类.getAge()+"岁 体重："+ 子子类.getKg());

    }
}
