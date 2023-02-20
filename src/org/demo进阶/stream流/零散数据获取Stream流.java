package org.demo进阶.stream流;

import java.util.stream.Stream;

public class 零散数据获取Stream流 {
    public static void main(String[] args) {
        //public static<T> Stream<T> of(T... values)     stream接口中的静态方法

        Stream.of(1, 2, 3, 4, 56, 7, 8, 9, 10).forEach(s -> System.out.println(s));

        System.out.println("-------------");

        Stream.of("i", "k", "u", "n", "!").forEach(s -> System.out.println(s));
    }
}
