package org.demo.接口;

public class 啥接口呀 {
    //为什么有接口?
    //接口: 就是一种规则，是对行为的抽象    # 有些动物会游泳  有些不会   那么  游泳就可以定义为接口


/*    -------------接口的定义和使用----------------
接口用关键字interface来定义
    public interface 接口名{}
接口不能实例化
接口和类之间是实现关系，通过implements关键字表示    public class 类名implements 接口名几
接口的子类(实现类)
    要么重写接口中的所有抽象方法
    要么是抽象类
注意1: 接口和类的实现关系，可以单实现，也可以多实现。
    public class 类名 implements 接口名1，接口名2{}
注意2:实现类还可以在继承一个类的同时实现多个接口。
    public class 类名 extends 父类implements 接口名1,接口名2{}



    ---------------接口中成员的特点--------------------
成员变量-----------
    只能是常量
    默认修饰符:public static final
构造方法------------
    没有
成员方法---------------
    只能是抽象方法
    默认修饰符:public abstract·
    JDK7以前: 接口中只能定义抽象方法。
    JDK8的新特性: 接口中可以定义有方法体的方法。
    JDK9的新特性: 接口中可以定义私有方法


    ----------------接口和类之间的关系-------------------
类和类的关系----------
    继承关系，只能单继承，不能多继承，但是可以多层继承
类和接口的关系--------
    实现关系，可以单实现，也可以多实现，还可以在继承一个类的同时实现多个接口
接口和接口的关系------
    继承关系，可以单继承，也可以多继承
    细节: 如果实现类实现了最下面的子接口，那么就需要重写所有的抽象方法
*/












}
