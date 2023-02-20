package org.demo.多态;

public class AB学生 extends AA人{

    @Override
    public void show() {
        System.out.println("学生的信息为:"+getName()+getAge());
    }
}
