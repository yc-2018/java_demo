package org.demo.继承和重写;

public class C泰迪 extends B狗{
    public void touch(){
        System.out.println("泰迪又来蹭一蹭");
    }

    @Override
    public void eat() {
        System.out.println("泰迪在吃狗粮（重写的父类的方法）");
    }
}
