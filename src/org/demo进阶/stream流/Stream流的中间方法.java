package org.demo进阶.stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public abstract class Stream流的中间方法 {
    public static void main(String[] args) {
        /*名称*******************************************说明*****************
Stream<T> filter(Predicate<? super T> predicate)        过滤
Stream<T> limit(long maxSize)                           获取前几个元素
Stream<T> skip(long n)                                  跳过前几个元素
Stream<T> distinct()                                    元素去重，依赖(hashCode和equals方法)
static <T> Stream<T> concat(Stream a, Stream b)         合并a和b两个流为一个流
Stream<R> map(Function<T,R> mapper)                     转换流中的数据类型

注意1:中间方法，返回新的Stream流，原来的Stream流只能使用一次，建议使用链式编程
注意2:修改Stream流中的数据，不会影响原来集合或者数组中的数据
*/


        ArrayList<String> list = new ArrayList<>();
        list.add("蔡ikun");
        list.add("蔡树枝");
        list.add("蔡苏珊");
        list.add("荔枝");
        list.add("小黑子");
        list.add("蔡ikun");
        list.add("蔡ikun");

        System.out.println("\n--------------过滤-----把蔡开头的留下，其余数据过滤不要-----------");

        /*list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true，表示当前数据留下
                //如果返回值为false，表示当前数据舍弃不要
                return s.startsWith("蔡");
            }
        }).forEach(System.out::println);*/

        list.stream()
                .filter(s -> s.startsWith("蔡"))
                .filter(s -> s.length()==3)
                .forEach(System.out::println);

        System.out.println("\n——————————获取前几个元素———跳过前几个元素—————————————————");

        list.stream().limit(3).forEach(s -> System.out.print(s+"\t"));    //获取前几个元素
        System.out.println();
        list.stream().skip(3).forEach(s -> System.out.print(s+"\t"));         //跳过前几个元素

        System.out.println("\n\n---课堂练习 获取 蔡树枝, 蔡苏珊, 荔枝---");
        //第一种思路:先 获取前面 再 跳过
       list.stream().limit(4).skip(1).forEach(s -> System.out.print(s+" "));
        System.out.println();

        //第二种思路:先  跳过  再  获取
        list.stream().skip(1).limit(3).forEach(s -> System.out.print(s+" "));
        System.out.println();


        System.out.println("\n———————————元素去重（依赖(hashCode和equals方法)）———————————————");
        list.stream()
                .distinct()
                .forEach(s -> System.out.print(s+" "));
        System.out.println();//如果是自己写的类一定要重写hashCode和equals


        System.out.println("\n—————————————合并a和b两个流为一个流—————————————");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("油饼");
        list1.add("香精煎鱼");
        list1.add("香翅捞饭");
        list1.add("狮豹者");

        Stream.concat(list.stream(),list1.stream()).forEach(s -> System.out.print(s+" "));
        System.out.println();



        System.out.println("\n—————————————转换流中的数据类型—————————————");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "油饼-2", "香精煎鱼-26", "香翅捞饭-25", "荔枝-18");

        //需求:只获取里面的价格并进行打印
        //String->int

        //第一个类型:流中原本的数据类型
        //第二个类型:要转成之后的类型

        //apply的形参s: 依次表示流里面的每一个数据
        //返回值: 表示转换之后的数据

        //当map方法执行完毕之后，流上的数据就变成了整数
        //所以在下面forEach当中，s依次表示流里面的每一个数据，这个数据现在就是整数了

        /*list2.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s.split("-")[1]);
            }
        }).forEach(s-> System.out.print(s+" "));
        System.out.println();*/

        list2.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s-> System.out.print(s+" "));
        System.out.println();


        System.out.println("\n\n不会影响原来数组中的数据:\n"+list+"\n"+list1+"\n"+list2);

    }
}
