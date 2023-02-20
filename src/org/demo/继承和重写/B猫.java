package org.demo.继承和重写;

public class B猫 extends A动物{
    private int b;

    public B猫(int b) {
        this.b = b;
    }





    public B猫() {
        System.out.println("猫这个大类的空参构造方法  其他继承的猫类会先访问这个空参");
    }

    public void eatMouse(){
        System.out.println("抓老鼠咯");
    }


}
