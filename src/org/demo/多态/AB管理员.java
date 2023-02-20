package org.demo.多态;

public class AB管理员 extends AA人{
    @Override
    public void show() {
        System.out.println("-+管理员的信息为:"+getName()+getAge());
    }
}
