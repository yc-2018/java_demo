package org.demo进阶.stream流;

import java.util.ArrayList;

public interface 什么是Stream流 {
    /*————————————————————————————————————————————————————————
    *Stream流的作用
    *   结合了Lambda表达式，简化集合、数组的操作
    *
    * Stream的使用步骤
    *   ·获取Stream流对象
    *   ·使用中间方法处理数据
    *   ·使用终结方法处理数据
    *
    * 如何获取Stream流对象
    *   ·单列集合: Collection中的默认方法stream
    *   ·双列集合:不能直接获取
    *   ·数组: Arrays工具类型中的静态方法stream
    *   ·一堆零散的数据: stream接口中的静态方法of
    *
    * 常见方法
    *   ·中间方法:filter, limit,skip, distinct, concat, map
    *   ·终结方法:forEach. count. collect
    ***——————————————————————————————————————————————————————————
    *
    *stream流的使用步骤:
    *   1.先得到一条Stream流(流水线)，并把数据放上去
    ****获取方式*********************方法名*******************************************说明**********
    *   单列集合           default Stream<E> stream()                        Collection中的默认方法
    *   双列集合           无                                                无法直接使用stream流       .entrySet()或.keySet()转化为set才行
    *   数组              public static <T> Stream<T> stream(T[] array)     Arrays工具类中的静态方法
    *   堆零散数据         public static<T> Stream<T> of(T... values)        Stream接口中的静态方法
    *
    *
    *   2.利用Stream流中的API进行各种操作
    *         （过滤  转换 ）中间方法--------方法调用完毕之后，还可以调用其他方法
    *          （统计 打印）  终结方法------最后一步，调用完毕之后，不能调用其他方法
    * */
    static void main(String[] args) {
        //需求:按照下面的要求完成集合的创建和遍历
            // 创建一个集合，存储多个字符串元素

        ArrayList<String> list = new ArrayList<>();
        list.add("张ikun");
        list.add("苏珊");
        list.add("张黑子");
        list.add("张食油饼！");
        list.add("张三风");
        list.add("菜树枝");

        //把所有以“张”开头的元素存储到新集合中
        //把“张”开头的，长度为5的元素再存储到新集合中
        //遍历打印最终结果

        //以前方法✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖
        //1.把所有以“张”开头的元素存储到新集合中
        ArrayList<String> list1 = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                list1.add(name);
            }
        }
        System.out.println(list1);
        //2.把“张”开头的，长度为5的元素再存储到新集合中
        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if (name.length() == 5) {
                list2.add(name);
            }
        }
        System.out.println(list2);
        System.out.println("✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖");
        //✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖✖

        //✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔✔
        list.stream().filter(name->name.startsWith("张")).filter(name->name.length()==3).forEach(name-> System.out.println(name));
        //链式编程呀
        /*Stream流的使用步骤
            1.先得到一条Stream流(流水线)，并把数据放上去
            2.使用中间方法对流水线上的数据进行操作
            3.使用终结方法对流水线上的数据进行操作
            */

    }
}
