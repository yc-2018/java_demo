package com.nnd.demo.常用API.时间相关;
//2月有29号就是

import java.time.LocalDate;
import java.util.Calendar;

public class 闰年 {
    public static void main(String[] args) {
        //JDK7
        Calendar instance = Calendar.getInstance();
        instance.set(2000,1,29);//月份+1
        System.out.println(instance.get(Calendar.YEAR));
        System.out.println(instance.get(Calendar.MONTH)+1);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

        //JDK8
        LocalDate date = LocalDate.of(2000, 2, 28);//2001 2 29 不存在会报错
        date = date.plusDays(1);
        System.out.println(date);

        /*
        * 老师思路  看1年是365  还是366
        *
        *           3月1号减一看看
        *
        *           有is方法---...
        *
        * */
        // true: 闰年
        // false: 平年
        boolean leapYear = date.isLeapYear();
        System.out.println(leapYear);
    }
}
