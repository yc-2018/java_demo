package org.demo.常用API;
/*---------------objects的成员方法
方法名                                                         说明
public static boolean equals(Object a,object b)         先做非空判断..比较两个对象
public static boolean isNull(object obj)                判断对象是否为null，为null返回true ,反之
public static boolean nonNull(object obi)               判断对象是否为null，跟isNull的结果相反
*/

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Pojo pojo1 = new Pojo("ikun", 108, 's', 6);
        Pojo pojo2 = null;
//        System.out.println(pojo2.equals(pojo1));//报错，空指针

        //先做非空判断..比较两个对象
        System.out.println(Objects.equals(pojo2, pojo1));

        //判断对象是否为null，为null返回true ,反之
        System.out.println(Objects.isNull(pojo2));

        //判断对象是否为null，跟isNull的结果相反
        System.out.println(Objects.nonNull(pojo2));
    }

}
/*
1.objects是一个对象工具类，提供了一些操作对象的方法
2.equals(对象1，对象2):先做非空判断，比较两个对象
3.isNu11(对象):判断对象是否为空
4.nonNu11(对象):判断对象是否不是空
*/