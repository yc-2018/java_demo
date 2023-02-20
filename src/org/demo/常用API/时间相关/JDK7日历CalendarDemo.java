package org.demo.常用API.时间相关;
/*
Calendar代表了系统当前时间的日历对象，可以单独修改、获取时间中的年，月，日
细节: Calendar是一个抽象类，不能直接创建对象。

获取Calendar日历类对象的方法public static Calendar getInstance()


-------------------------------Calendar常用方法-----------------------------
public final Date getTime()                     获取日期对象
public final setTime(Date date)                 给日历设置日期对象

public long getTimeInMillis()                   拿到时间毫秒值
public void setTimeInMillis(long millis)        给日历设置时间毫秒值

public int get(int field)                       取日历中的某个字段信息
public void set(int field,int value)            修改日历的某个字段信息
public void add(int field,int amount)           为某个字段增加/减少指定的值
*/

import java.util.Calendar;
import java.util.Date;

public class JDK7日历CalendarDemo {
    public static void main(String[] args) {
        // 1.获取日历对象
        // 细节1: Calendar是一个抽象类，不能直接new，而是通过一个静态方法获取到子类对象入
        // 底层原理:
        // 会根据系统的不同时区来获取不同的日历对象。
        // 把会把时间中的纪元，年，月，日，时，分，秒，星期，等等的都放到一个数组当中
        // 纪元:0，
        // 年:1，
        // 月:2，
        // 一年中的第几周:3,
        // 一个月中的第几周:4，
        // 一个月中的第几天(日期):5
        //.....一共17个  忘记就直接看源码就好了

        //细节2:
        //月份: 范围0~11 如果获取出来的是0.那么实际上是1月
        //星期:在老外的眼里，星期日是一周中的第一天
        //    1(星期日)   2(星期一)   3(星期二)   4(星期三)   5(星期四)   6(星期五)  7(星期六)
        Calendar c = Calendar.getInstance();    //默认是当前时间
        System.out.println(c);

        //修改日历代表的时间
        Date d = new Date(0L);
        c.setTime(d);           //设置时间
        System.out.println(c);

        int year = c.get(1);    //获取年
        int month = c.get(Calendar.MONTH)+1;    //月份是0到11 所以要加1     # 在设置月份的时候不会报错  时间会往后推
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+"年"+month+"月"+date+"日"+getWeek(week));    //1970年1月1日星期四

        //修改日历的某个字段信息
        c.set(Calendar.YEAR,2023);
        c.set(Calendar.MONTH,3);            //4月
        c.set(Calendar.DAY_OF_MONTH,9);

        //调用方法在这个基础上增加一个月，可以是负数，就表示点前基础上减去
        c.add(Calendar.MONTH,1);

        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH)+1;
        date = c.get(Calendar.DAY_OF_MONTH);
        week = c.get(Calendar.DAY_OF_WEEK);
        System.out.println(year+"年"+month+"月"+date+"日"+getWeek(week));

    }

    //查表法:
    //表: 容器
    //让数据跟索引产生对应的关系

    //传入对应的数字: 1 ~7
    //返回对应的星期
    private static String getWeek(int index) {
        String[] arr = {"","日","一","二","三","四","五","六",};   //定义一个数组，让汉字星期几 跟1~7产生对应关系
        return "星期"+arr[index];                                 //根据索引返回对应的星期
    }
}


/*
*
*1.Calendar表示什么?
* 表示一个时间的日历对象
*2.如何获取对象
*通过getInstance方法获取对象
*常见方法3.
*修改setXxx:getXxx:获取
*add: 在原有的基础上进行增加或者减少
*细节点:
*日历类中月份的范围: 0~11
*日历类中星期的特点: 星期日是一周中的第一天
* */