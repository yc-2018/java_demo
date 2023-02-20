package org.demo.继承和重写;

public class test {
    public static void main(String[] args) {
        //创建哈士奇对象
        C哈士奇 c哈士奇 = new C哈士奇();
        c哈士奇.eat();
        c哈士奇.breakHome();
        c哈士奇.seeHome();

        System.out.println("------------------");

        //创建布偶猫对象
        C布偶猫 布偶猫 = new C布偶猫();
        布偶猫.dirnk();
        布偶猫.eat();
        布偶猫.eatMouse();

        System.out.println("------------------");
        //创建泰迪对象
        C泰迪 泰迪 = new C泰迪();
        泰迪.eat();
        泰迪.touch();

        System.out.println("--------子类的构造方法隐藏了super（）去访问父类的无参构造----------------");
        C中华狸花猫 中华狸花猫 = new C中华狸花猫();
        System.out.println("↑");
        //如果想访问父类的有参构造就要new C中华狸花猫(“例子”);   然后在子类的super（例子）
    }
}
