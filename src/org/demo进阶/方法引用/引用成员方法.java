package org.demo进阶.方法引用;

import java.util.ArrayList;
import java.util.Collections;

public class 引用成员方法 extends Fu {
        /*格式:对象::成员方法
            其他类:其他类对象::方法名
            本类: this::方法名           引用处不能是静态方法  静态方法没有this关键字
            父类:super::方法名           引用处不能是静态方法

            练习1:
            集合中有一些名字，按照要求过滤数据

        */
    public static void main(String[] args) {

        引用其他类成员方法();

        引用成员方法 引用成员方法 = new 引用成员方法();
        引用成员方法.引用本类的成员方法();

        引用成员方法.引用父类的成员方法();

    }



    private static void 引用其他类成员方法() {
        System.out.println("————其他类练习：集合中有一些名字，按照要求过滤数据————");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰");

        //过滤数据(只要以张开头，而且名字是3个字的)
        //1
        /*list.stream().filter(s -> s.startsWith("张")&&s.length()==3).forEach(System.out::println);
        System.out.println("-------------");*/


        //2  方便看看方法把方法抽出来写3
        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("张")&&s.length()==3;
            }
        }).forEach(System.out::println);
        System.out.println("-------------");*/


        //3
        list.stream().filter(new StringOperation()::stringJudge).forEach(System.out::println);
    }

    private void 引用本类的成员方法() {
        //练习2:
        //GUI界面中点击事件的方法引用写法
        //界面就麻烦不写了 说说吧
        //  图形化界面我们要绑定鼠标点击事件   要继承 实现全部方法   go.addActionListener(this) 点击后执行本类对应的方法
        //     我们可以写一个 类型 返回值 参数一样的方法method     go.addActionListener(this::method)点击后就执行本类的method方法
        //     如此一来就不用写implements (实现)了

        System.out.println("————————本类 练习  过滤名字 只要2个字的————————");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰","赵诗曼");

        list.stream().filter(this::stringJudge).forEach(System.out::println);
    }

    private void 引用父类的成员方法() {
        System.out.println("————————父类 练习  过滤名字 只要2个字姓赵的————————");
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰","赵诗曼");

        list.stream().filter(super::strJudge).forEach(System.out::println);
    }

    private boolean stringJudge(String string) {
        return string.length()==2;
    }
}



class StringOperation{

    public boolean stringJudge(String string) {
        return string.startsWith("张")&&string.length()==3;
    }
}

class Fu{
    public boolean strJudge(String string) {
        return string.startsWith("赵") && string.length() == 2;
    }
}