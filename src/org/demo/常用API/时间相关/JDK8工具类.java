package org.demo.常用API.时间相关;
/*
Duration用于计算两个“时间”间隔(秒，纳秒)
Period用于计算两个“日期”间隔(年、月、日)
ChronoUnit 用于计算两个“日期”间隔         全（重点掌握这个就行）
*/

import java.time.*;
import java.time.temporal.ChronoUnit;

public class JDK8工具类 {
    public static void main(String[] args) {
        //Period用于计算两个“日期”间隔(年、月、日)
        PeriodDemo();

        System.out.println("-------------------------------------------------");

        //Duration用于计算两个“时间”间隔(秒，纳秒)
        DurationDemo();

        System.out.println("-------------------------------------------------");

        //ChronoUnit 用于计算两个“日期”间隔(年、月、日、秒、纳秒...）
        ChronoUnitDemo();
    }

    //ChronoUnit 用于计算两个“日期”间隔(年、月、日、秒、纳秒...）
    private static void ChronoUnitDemo() {
        //获取当前时间
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        //生日的时间
        LocalDateTime birthDate = LocalDateTime.of(2000, 5, 12,0,00,00);
        System.out.println(birthDate);

        System.out.println("相差的年数:"+ ChronoUnit.YEARS.between(birthDate, today));
        System.out.println("相差的月数:"+ ChronoUnit.MONTHS.between(birthDate, today));
        System.out.println("相差的周数:"+ ChronoUnit.WEEKS.between(birthDate, today));
        System.out.println("相差的天数:"+ ChronoUnit.DAYS.between(birthDate, today));
        System.out.println("相差的时数:"+ ChronoUnit.HOURS.between(birthDate, today));
        System.out.println("相差的分数:"+ ChronoUnit.MINUTES.between(birthDate,today));
        System.out.println("相差的秒数:"+ ChronoUnit.SECONDS.between(birthDate, today));
        System.out.println("相差的毫秒数:"+ ChronoUnit.MILLIS.between(birthDate,today));
        System.out.println("相差的微秒数:"+ ChronoUnit.MICROS.between(birthDate,today));
        System.out.println("相差的纳秒数:"+ ChronoUnit.NANOS .between(birthDate,today));
        System.out.println("相差的半天数:"+ChronoUnit.HALF_DAYS.between(birthDate,today));
        System.out.println("相差的十年数: " + ChronoUnit.DECADES.between(birthDate, today));
        System.out.println("相差的世纪(百年)数: " + ChronoUnit.CENTURIES.between(birthDate, today));
        System.out.println("相差的下年数: "+ ChronoUnit.MILLENNIA.between(birthDate, today));
        System.out.println("相差的纪元数:"+ ChronoUnit.ERAS.between(birthDate,today));
    }

    //Duration用于计算两个“时间”间隔(秒，纳秒)
    private static void DurationDemo() {
        //获取本地日期时间对象。
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        //出生的日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(2000, 5, 12,0,00,00);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today);//第二个参数减第一个参数
        System.out.println("相差的时间间隔对象"+duration);       //PT198669H39M21.152S
        System.out.println("================================");
        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.toMillis());//两个时间差的毫秒数
        System.out.println(duration.toNanos());//两个时间差的纳秒数
    }

    //Period用于计算两个“日期”间隔(年、月、日)
    private static void PeriodDemo() {
        //获取当前本地 年月日
        LocalDate today = LocalDate.now();
        System.out.println(today);

        //生日的 年月日
        LocalDate birthDate = LocalDate.of(2000, 5, 12);
        System.out.println(birthDate);

        Period period = Period.between(birthDate, today);//第二个参数减第一个参数

        System.out.println("相差的时间间隔对象："+period);    //P22Y7M28D
        System.out.println(period.getYears());  //22        # 相隔年
        System.out.println(period.getMonths()); //7         # 相隔月（<=12 会跑到年）
        System.out.println(period.getDays());   //28        # 相隔日（<=12 会跑到月）

        System.out.println(period.toTotalMonths()); //271   # 一共过的总月
    }
}
