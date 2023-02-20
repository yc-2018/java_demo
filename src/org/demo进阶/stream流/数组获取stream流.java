package org.demo进阶.stream流;

import java.util.Arrays;
import java.util.stream.Stream;

public class 数组获取stream流 {
    public static void main(String[] args) {
        // 数组 public static <T> Stream<T> stream(T[] array)    Arrays工具类中的静态方法

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        String[] arr2 = {"i", "k", "u", "n", "!"};

        //获取stream流
        Arrays.stream(arr1).forEach(i -> System.out.println(i));
        System.out.println("------------");
        Arrays.stream(arr2).forEach(s -> System.out.println(s));

        //细节’
        //stream接口中静态方法of的细节
        //方法的形参是一个可变参数，可以传递一堆零散的数据，也可以传递数组
        //但是数组必须是引用数据类型的，如果传递基本数据类型，是会把整个数组当做一个元素，放到Stream当中。
        Stream.of(arr1).forEach(i -> System.out.println(i));    //[I@2f4d3709
        Stream.of(arr2).forEach(s -> System.out.print(s));
    }
}
