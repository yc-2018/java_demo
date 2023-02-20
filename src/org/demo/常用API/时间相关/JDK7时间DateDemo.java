package org.demo.常用API.时间相关;/*
时间的相关知识点
    世界标准时间:格林尼治时间 /格林威治时间 (Greenwich Mean Time) 简称 GMT
               目前世界标准时间(UTC) 已经替换为:原子钟
               中国标准时间:世界标准时间+8小时(东八区

    时间单位换算:1秒1000毫秒     1毫秒1000微秒       1微秒1000纳秒
*/

import java.util.Date;

public class JDK7时间DateDemo {
    public static void main(String[] args) {
        //创建一个当前时间                (***注意一定是java.util包下的
        Date date1 = new Date();        //默认是当前时间
        System.out.println(date1);

        //2.创建对象表示一个指定的时间
        Date date2 = new Date(0L);  //时间原点1970年1970年1月1日星期四08:00:00
        System.out.println(date2);

        date2.setTime(1000L);        //设置/修改毫秒值
        System.out.println(date2);

        long time1 = date1.getTime();   //获取时间对象的毫秒值
        System.out.println(time1);
        System.out.println(date2.getTime());


        System.out.println("---练习 打印时间原点开始一年后的时间---");
        date2.setTime(1000L*60*60*24*365);
        System.out.println(date2);

    }
}
/*
1、如何创建日期对象?
Date date = new Date():
Date date = new Date(指定毫秒值):

2、如何修改时间对象中的毫秒值
setTime(毫秒值)

3、如何获取时间对象中的毫秒值
getTime();
* */