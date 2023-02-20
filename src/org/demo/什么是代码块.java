package org.demo;

public class 什么是代码块 {
    private int age;
    private String name;



    {/////////////// 构造代码块         本来空参构造和带参构造有一样的代码时  就可以抽取出来放在2个构造函数之前---------------------
        //构造代码块:
        // 1.写在成员位置的代码块
        // 2.作用: 可以把多个构造方法中重复的代码抽取出来
        // 3.执行时机:我们在创建本类对象的时候会先执行构造代码块再执行构造方法
        // 渐渐淘汰了，不够灵活  每次创建对象必然会先执行  比如有一个构造函数不想执行  这就不行了
        // 那用什么呢，1、就在写在一个构造方法里面 ，其他想用就可以直接在构造函数下面用this关键字 this（null ， 0）  就会调用其他构造函数了方法也就执行了
        //           2、调用方法
        System.out.println("开始创建对象了");
    }
    public 什么是代码块(int age, String name) {
//        System.out.println("开始创建对象了");
        this.age = age;
        this.name = name;
    }

    public 什么是代码块() {
//        System.out.println("开始创建对象了");
    }
    //////////////////// 静态代码块---------------------------------------------------------
    //格式:static{}
    // 特点:需要通过static关键字修饰，随着类的加载而加载，并且自动触发、只执行一次
    // 使用场景:在类加载的时候，做一些数据初始化的时候使用。
    static {
        System.out.println("静态代码块 new 多少次都只在最开始执行一次");
    }





    public static void main(String[] args) {
        ///////////// 局部代码块    淘汰了     让用完的代码提前变成垃圾回收--------------------------------------------------
        // 局部代码块-------------------------------------
        {
            int a = 111;
        }
//        System.out.println(a);   //a在花括号后面就消失了，这里就会报错（局部代码块）

        什么是代码块 why = new 什么是代码块();
        why.setAge(55);
        why.setName("22年12.15啊 艹");

        什么是代码块 whyA = new 什么是代码块(20, "今天软考没过");

        System.out.println(why.getAge()+"   害   "+why.getName());
        System.out.println(whyA.getAge()+"   害   "+whyA.getName());
    }
















    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
