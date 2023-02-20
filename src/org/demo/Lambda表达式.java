package org.demo;

import java.util.Arrays;
import java.util.Comparator;

/*
* 函数式编程
***函数式编程 (Functional programming)是一种思想特点
***函数式编程思想，忽略面向对象的复杂语法，强调做什么，而不是谁去做
***而我们要学习的Lambda表达式就是函数式思想的体现。
***//* **************************************************
Lambda表达式的标准格式   Lambda表达式是JDK8开始后的一种新语法形式
() ->{
 }

()对应着方法的形参
->固定格式
{}对应着方法的方法体
*********************************************************/
//注意点
//      Lambda表达式可以用来简化匿名内部类的书写
//      Lambda表达式只能简化函数式接口的匿名内部类的写法
//      函数式接口:
        //有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@Functionalinterface注解
public class Lambda表达式 {
    public static void main(String[] args) {

        //匿名内部类写法--------------------------------------------
        method(new Swim() {
            @Override
            public void swiming() {
                System.out.println("匿名内部类：正在游泳🏊");
            }
        });

        //Lambda正常写法---------------------------------------------
    method(()->{
        System.out.println("Lambda正常写法：正在冬泳🏊");
    });

        //Lambda省略写法--------------------------------------------
        /*lambda的省略规则:
            1.参数类型可以省略不写。
            2.如果只有一个参数，参数类型可以省略，同时()也可以省略。
            3.如果Lambda表达式的方法体只有一行，大括号，分号，return可以省略不写，需要同时省略。*/
        method(()-> System.out.println("Lambda省略写法：正在蛙泳🏊"));

        //====*********************************************************=======
        //////**********************练习********************************//////
                //定义数组并存储一些字符串，利用Arrays中的sort方法进行排序要求:
                //按照字符串的长度进行排序，短的在前面，长的在后面。(暂时不比较字符串里面的内容)
        String[] arr = {"a", "aaaa", "aaa","aa"};
                //如果以后我们要把数组中的数据按照指定的方式进行排列，就需要用到sort方法，而且要指定排序的规则
        Arrays.sort(arr, (o1, o2) -> o1.length()-o2.length());          //字符串的长度进行排序
        System.out.println(Arrays.toString(arr));                      //[a, aa, aaa, aaaa]

    }


    private static void method(Swim swim) {
        swim.swiming();
    }

    @FunctionalInterface    //接口上方可以加@Functionalinterface注解
    interface Swim{
        void swiming();     //有且仅有一个抽象方法的接口叫做函数式接口
    }
}
