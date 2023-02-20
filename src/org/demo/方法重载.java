package org.demo;

public class 方法重载 {
    public static void main(String[] args) {
        /*
        * 方法的重载
        * 在同一个类中，定义了多个同名的方法，这些同名的方法具有同种的功能
        * 每个方法具有不同的参数类型或参数个数，这些同名的方法，就构成了重载关系
        *
        * 简单记:同一个类中，方法名相同，参数不同的方法。与返回值无关
        */
        System.out.println(方法重载.求和(3.14,10));
        System.out.println(求和(3,0.14));
    }


    public static double 求和(int a, double b){
        return a+b;
    }
    public static double 求和(double a, double b){
        return a+b;
    }
}
//return break关键字的区别
//return:其实跟循环没有什么关系，跟方法有关的，表示1结束方法 2返回结果
//       如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束了。