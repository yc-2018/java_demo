package org.demo进阶.stream流;

import java.util.*;
import java.util.stream.Collectors;

public abstract class Stream流的终结方法 {
    public static void main(String[] args) {
/*————————名称——————————————————————————说明——————————————————
void forEach(Consumer action)           遍历
long count()                            统计
toArray()                               收集流中的数据，放到数组中
collect(Collector collector)            收集流中的数据，放到集合中
——————————————————————————————————————————————————————————————*/
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"ikun","树枝","苏珊","荔枝","小黑子");


        System.out.println("———————————————遍历—————————————————");

        list.stream().forEach(s -> System.out.println(s+" "));
        System.out.println();


        System.out.println("———————————————统计—————————————————");
        long count = list.stream().count();
        System.out.println(count);


        System.out.println("\n———————————————收集流中的数据，放到数组中—————————————————");
        Object[] arr1 = list.stream().toArray();    //obj类型的显然不是想要的
        System.out.println(Arrays.toString(arr1));


        //IntFunction的泛型: 具体类型的数组
        //apply的形参:流中数据的个数，要跟数组的长度保持一致
        //apply的返回值: 具体类型的数组
        //方法体:就是创建数组

        //toArray方法的参数的作用: 负责创建一个指定类型的数组
        //toArray方法的底层，会依次得到流里面的每一个数据，并把数据放到数组当中
        //toArray方法的返回值: 是一个装着流里面所有数据的数组

        /*String[] arr = list.stream().toArray(new IntFunction<String[]>() {
            @Override
            public String[] apply(int value) {
                return new String[value];
            }
        });*/
        String[] arr = list.stream().toArray(value -> new String[value]);
        System.out.println(Arrays.toString(arr));



        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"张无忌-男-15","周芷若-女-14","赵敏-女-13","张强-男-20",
                "张三丰-男-109","张翠山-男-40","张良-男-35","王二麻子-男-37","谢广坤-男-41");
        System.out.println("\n———————————————收集流中的数据，放到list集合中—————————————————");

        // 收集List集合当中
        // 需求:
        // 我要把所有的男性收集起来
        List<String> newList1 = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toList());
        System.out.println(newList1);


        System.out.println("\n———————————————收集流中的数据，放到set集合中—————————————————");//和list集合的区别就是去重
        Set<String> newList2 = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))       //字符串在前面可防止null？
                .collect(Collectors.toSet());
        System.out.println(newList2);
        //毛记得密用forEach一样爽个
        HashSet<String> hs = new HashSet<>();
        list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .forEach(s -> hs.add(s));
        System.out.println(hs);


        System.out.println("\n———————————————收集流中的数据，放到Map集合中—————————————————");
        // 谁作为键,谁作为值.
        // 我要把所有的男性收集起来
        // 键:姓名。 值:年龄
        //list1.stream().filter(s -> "男".equals(s.split("-")[1])).collect(Collectors.toMap(键的规则, 值的规则));
        //方法体:生成键/值的代码
        //返回值: 已经生成的键
        /*注意点:
            如果我们要收集到Map集合当中，键不能重复，否则会报错*/
        Map<String, Integer> map = list1.stream()
                .filter(s -> "男".equals(s.split("-")[1]))
                .collect(Collectors.toMap(s -> s.split("-")[0], s -> Integer.parseInt(s.split("-")[2])));
        System.out.println(map);
    }
}
