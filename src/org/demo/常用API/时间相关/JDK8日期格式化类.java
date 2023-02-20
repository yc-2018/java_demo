package org.demo.常用API.时间相关;
/*SimpleDateFormat
*DateTimeFormatter
*用于时间的格式化和解析
* */

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
static DateTimeFormatter ofpattern(格式)        获取格式对象
String format(时间对象)                          按照指定方式格式化
*/
public class JDK8日期格式化类 {
    public static void main(String[] args) {
        //获取时间对象
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));

        //解析/格式化器
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EE a");
        System.out.println(dtf1.format(time));  //2023-01-09 16:10:18 星期一 下午
    }
}
