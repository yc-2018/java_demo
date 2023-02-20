package org.demo.多态;

public class AB老师 extends AA人{
    @Override
    public void show() {
        System.out.println("*老师的信息为:"+getName()+getAge());
    }
}
