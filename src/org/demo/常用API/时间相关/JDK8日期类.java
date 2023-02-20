package org.demo.常用API.时间相关;/*
为什么要学JDK8新增时间相关类呢?
------------代码层面-----------------------
JDK7:代码麻烦        日期对象--比较--计算=== 毫秒值
IDK8:简单            判断的方法--计算时间间隔的方法
------------安全层面-----------------------
JDK7:多线程环境下会导致数据安全的问题
IDK8:时间日期对象都是不可变的，解决了这个问题
*/

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/*Date类
* ZoneId:时区
* Instant:时间戳
* ZoneDateTime:带时区的时间
* */
public class JDK8日期类 {
    public static void main(String[] args) {
        //ZoneId时区-----------------------------------------------------------
        //static Set<String> getAvailableZoneIds()      获取java中支持的所有时区
        //static ZoneId systemDefault()                 获取系统默认时区
        //static ZoneId of(string zoneId)               获取一个指定时区

        //获取所有的时区名称
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        print(zoneIds.size());                     //601   # 表示有601个时区
        print(zoneIds);                            //时区集合 忘记就在里面搜索

        //获取当前系统的默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        print(zoneId);                             //Asia/Shanghai

        //获取指定的时区
        ZoneId zoneId1 = ZoneId.of("US/Pacific");
        print(zoneId1);

        print("---------------------------------");
        //---------------------------------------------------
        // Instant时间戳--------------------------------------
        // static Instant now()                         获取当前时间的Instant对象(标准时间)
        // static Instant ofXxxx(long epochMilli)       根据(秒/毫秒/纳秒)获取Instant对象
        // ZonedDateTime atZone(ZoneId zone)            指定时区
        // boolean isXxx(Instant otherInstant)          判断系列的方法
        // Instant minusXxx(long millisToSubtract)      减少时间系列的方法
        // Instant plusXxx(long millisToSubtract)       增加时间系列的方法

        //获取当前时间的Instant对象(标准时间)
        Instant now = Instant.now();        //不带时区
        print(now);

        //根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant1 = Instant.ofEpochMilli(1000);//毫秒  计算机时间原点过了一毫秒
        print(instant1);

        Instant instant2 = Instant.ofEpochSecond(10L);// 秒   时间原点过10秒
        print(instant2);

        Instant instant3 = Instant.ofEpochSecond(4L, 1000000000L);  //秒+纳秒
        print(instant3);

        //指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Chongqing"));
        print(time);                //2023-01-09T15:17:47.397+08:00[Asia/Chongqing]

        //isXxx 判断
        Instant instant4 = Instant.ofEpochSecond(0L);
        Instant instant5 = Instant.ofEpochSecond(1000L);
        System.out.println(instant4.isBefore(instant5));    //判断调用者代表的时间是否在参数表示时间的前面    # true
        System.out.println(instant4.isAfter(instant5));     //判断调用者代表的时间是否在参数表示时间的后面    # false

        // Instant minusXxx(long millisToSubtract)            减少时间系列的方法
        Instant instant6 = Instant.ofEpochSecond(1000L);
        print(instant6);    //1970-01-01T00:16:40Z
        Instant instant7 = instant6.minusSeconds(1);    //在原来的时间上减少一秒
        print(instant7);    //1970-01-01T00:16:39Z

        //增加时间系列的方法
        print("注意：增加或减少的方法都会产生一个新的对象");
        Instant instant8 = Instant.ofEpochSecond(0L);
        print(instant8.plusSeconds(60L));

        print("-------------------------------------------");
        //ZoneDateTime带时区的时间--------------------------
        //static ZonedDateTime now()                获取当前时间的ZonedDateTime对象
        //static ZonedDateTime ofXxxx(。。。)        获取指定时间的ZonedDateTime对象
        // ZonedDateTime withXxx(时间)               修改时间系列的方法
        //ZonedDateTime minusXxx(时间)               减少时间系列的方法
        //ZonedDateTime plusXxx(时间)                增加时间系列的方法

        //获取当前时间对象(带时区)
        ZonedDateTime now1 = ZonedDateTime.now();
        print(now1);

        //获取指定的时间对象(带时区)
        ZonedDateTime time1 = ZonedDateTime.of(2023, 10, 1,
                                               11, 12, 12,
                                               0, ZoneId.of("Asia/Shanghai"));

        //通过Instant + 时区的方式指定获取时间对象
        Instant instant9 = Instant.ofEpochSecond(0L);
        ZoneId zoneId2 = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time2 = ZonedDateTime.ofInstant(instant9, zoneId2);
        print(time2);
        //withXxx 修改时间系列的方法
        ZonedDateTime time3 = time2.withYear(2000).withMonth(2);                //修改年  月
        print(time3);
        //减少时间
        ZonedDateTime time4 = time3.minusYears(3).minusSeconds(3600);           //减少年 秒
        print(time4);
        //增加时间
        ZonedDateTime time5 = time4.plusMonths(3).plusDays(19).plusHours(8);    //增加 月  日  时
        print(time5);

    }
    private static void print(Object obj) {
        System.out.println(obj);
    }
}
