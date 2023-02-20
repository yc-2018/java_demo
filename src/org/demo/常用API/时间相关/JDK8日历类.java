package org.demo.常用API.时间相关;
/*细节 每次修改时间都是一个新的对象------------
* LocalDate:年、月、日
*LocalTime:时、分、秒
*LocalDateTime:年、月、日 时、分 秒  可转化为上面的类 toLocalDate()  toLocalTime()
* */

/*
static XXX now()       获取当前时间的对象
static XXX of()        获取指定时间的对象
get开头的方法           获取日历中的年、月、日、时、分、秒等信息(类不同 获取到的信息会有不同  比如LocalTime这个类 只能获取到 时、分、秒
isBefore，isAfter     比较两个 LocalDate
with开头的             修改时间系列的方法
minus开头的            减少时间系列的方法
plus开头的             增加时间系列的方法
*/

import java.time.*;

public class JDK8日历类 {
    public static void main(String[] args) {
        //年月日
        LocalDateDemo();

        print("*-------------------------------*");

        //时分秒
        LocalTimeDemo();

        print("*-------------------------------*");

        //年月日时分秒
        LocalDateTimeDemo();


    }




    //年月日
    private static void LocalDateDemo() {
        //获取当前时间的日历对象(包含 年月日)
        LocalDate nowDate = LocalDate.now();
        print(nowDate);

        //获取指定的时间的日历对象
        LocalDate lDate = LocalDate.of(2018, 6, 30);
        print("指定时间"+lDate+"高中毕业啦");

        //get系列方法获取日历中的每一个属性值
        //年
        int year = lDate.getYear();
        print("year:"+year+"那个夏天，到底有什么是值得怀念的");

        //月
        //方法1
        Month m = lDate.getMonth();
        print(m);               //JUNE
        print("month:"+m.getValue());    //6
        //方法2
        int month = lDate.getMonthValue();
        print("month:"+month);           //6

        //日
        int day = lDate.getDayOfMonth();
        print("day:"+day);

        //获取一年的第几天
        int dayOfYear = lDate.getDayOfYear();
        print("获取一年的第几天:"+dayOfYear);

        //获取星期
        DayOfWeek dayOfWeek = lDate.getDayOfWeek();
        print("获取星期几"+dayOfWeek);
        print("获取星期值"+dayOfWeek.getValue());

        //is开头的方法表示判断
        print(lDate.isAfter(lDate));    //  <
        print(lDate.isBefore(lDate));   //  >

        //with开头的方法表示修改，只能修改年月日
        LocalDate withLocaDate = lDate.withYear(2020);
        print(withLocaDate+"实习在7.13开始，也表示着 什么的结束");

        //minus开头的方法表示减少,只能减少年月日
        LocalDate minusLocalDate = lDate.minusYears(4);
        print(minusLocalDate+"那年还在老家呢");

        //plus开头的方法表示增加,只能增加年月日
        LocalDate plusLocalDate = lDate.plusYears(3).plusMonths(2).plusDays(-3);
        print(plusLocalDate+"是新的开始");

        // ---------
        // 判断今天是否是你的生目
        LocalDate birDate = LocalDate.of(2000, 1, 12);
        LocalDate nowDate1 = LocalDate.now();

        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);
        print(nowMd);//--01-09
        print("今天是你的生日吗"+birMd.equals(nowMd));
    }

    //时分秒
    private static void LocalTimeDemo() {
        // 获取本地时间的日历对象。 (包含 时分秒)
        LocalTime nowTime = LocalTime.now();
        print("为你报时："+nowTime);

        print("小时为："+nowTime.getHour());
        print("分钟为"+nowTime.getMinute());
        print("秒为"+nowTime.getSecond());
        print("纳秒为"+nowTime.getNano());

        print("-------------------------");

        print(LocalTime.of(8,20));//时分
        print(LocalTime.of(8,20,30));//时分秒
        print(LocalTime.of(8,20,30,565201413));//时分秒纳秒
        LocalTime mTime = LocalTime.of(8, 20, 30, 565201413);

        //is系列的方法
        print(mTime.isAfter(nowTime));      //  >
        print(nowTime.isBefore(mTime));     //  <

        //with系列的方法，只能修改时、分、秒
        print(mTime.withHour(5));
        print(mTime.withMinute(20));
        print(mTime.withSecond(13));

        //minus系列的方法，减少时、分、秒
        print(mTime.minusHours(3));

        //plus系列的方法，增加时、分、秒
        print(mTime.plusMinutes(39));
    }

    //年月日时分秒
    private static void LocalDateTimeDemo() {
        // 当前时间的的日历对象 (包含 年月日时分秒)
        LocalDateTime nowDateTime = LocalDateTime.now();
        print("今天是："+nowDateTime);
        print("年:"+nowDateTime.getYear());
        print("月:"+nowDateTime.getMonthValue());
        print("日:"+nowDateTime.getDayOfMonth());
        print("时:"+nowDateTime.getHour());
        print("分:"+nowDateTime.getMinute());
        print("秒:"+nowDateTime.getSecond());
        print("纳秒:"+nowDateTime.getNano());
        print("这是今年的第几天："+nowDateTime.getDayOfYear());
        print("星期几："+ nowDateTime.getDayOfWeek());
        print("星期值："+ nowDateTime.getDayOfWeek().getValue());
        print("月份："+ nowDateTime.getMonth());
        print("月数："+ nowDateTime.getMonth().getValue());

        LocalDate ld = nowDateTime.toLocalDate();
        print("转化为年月日："+ld);

        LocalTime lt = nowDateTime.toLocalTime();
        print("转换为时分秒："+lt);
        print("时:"+lt.getHour());
        print("分:"+lt.getMinute());
        print("秒:"+lt.getSecond());

    }

    //打印简化
    private static void print(Object obj) {
        System.out.println(obj);
    }
}
