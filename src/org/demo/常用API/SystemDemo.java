package org.demo.常用API;
/*System:也是一个工具类，提供了一些与系统相关的方法

public static void exit(int status)---------终止当前运行的 Java 虚拟机
        //方法的形参:
        //状态码:
        //0: 表示当前虚拟机是正常停止
        //非0: 表示当前虚拟机异常停止
public static long currentTimeMillis()--------返回当前系统的时间毫秒值形式
        //时间原点:1970年1月1日 0:0:0，我国在东八区，有8小时时差
public static void arraycopy()----------------(数据源数组，起始索引，目的地数组，起始索引，拷贝个数)数组拷贝

*/

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
        long 开始时间 = System.currentTimeMillis();

        int[] arr1 ={1,2,3,4,5,6,7,8,9,10};
        int[] arr2 =new int[10];
        // 把arr1数组中的数据拷贝到arr2中
        // 参数一: 数据源，要贝的数据从哪个数组而来
        // 参数二: 从数据源数组中的第几个索引开始拷贝
        // 参数三: 目的地，我要把数据拷贝到哪个数组中
        // 参数四: 目的地数组的索引。
        // 参数五: 拷贝的个数
        System.arraycopy(arr1,0,arr2,0,5);
        System.out.println(Arrays.toString(arr2));
        //细节:
        // 1.如果数据源数组和目的地数组都是基本数据类型，那么两者的类型必须保持一致，否则会报错
        // 2.在拷贝的时候需要考虑数组的长度，如果超出范围也会报错
        // 3.如果数据源数组和目的地数组都是引用数据类型，那么子类类型可以赋值给父类类型

        long 结束时间 = System.currentTimeMillis();
        System.out.println("总共花费毫秒："+(结束时间-开始时间));

        System.exit(0);
        System.out.println("************永远不会打印***********");
    }
}
