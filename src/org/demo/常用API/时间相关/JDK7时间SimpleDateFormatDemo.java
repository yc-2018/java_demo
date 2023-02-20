package org.demo.常用API.时间相关;
/*      构造方法                                            说明
public simpleDateFormat()                   构造一个simpleDateFormat，使用默认格式
public SimpleDateFormat(string pattern      构造一个simpleDateFormat，使用指定的格式

        常用方法                                            说明
public final string format(Date date)       格式化 (日期对象->字符串)
public Date parse(string source)            解析 (字符串 ->日期对象)*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//y年   M月   d日   H时   m分  s秒

/*
1.simpleDateFormat的两个作用
    格式化
    解析
2.如何指定格式
    yyyy年MM月dd日 HH: mm: ss
*/
public class JDK7时间SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //1.利用空参构造创建simpleDateFormat对象，默认格式------------
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);           //70-1-1 上午8:00       有猫饼   应该是1970-1-1 上午8:00才对

        //2.利用带参构造创建simpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d1);
        System.out.println(str2);           //1970年01月01日 08:00:00

        // 课堂练习: yyyy年MM月dd日 时:分:秒 星期E
        // "yyyy年MM月dd日 HH:mm:ss EE"==1970年01月01日 08:00:00 星期四

        //1.定义一个字符串表示时间-------------------------------------------------------------字符串转化为时间
        String str = "2023-11-11 11:11:11";
        //2.利用空参构造创建simpleDateFormat对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // 细节:
        // 创建对象的格式要跟字符串的格式完全一致
        Date date = sdf.parse(str);
        System.out.println(date);               //Sat Nov 11 11:11:11 CST 2023
        System.out.println(date.getTime());     //1699672271000

    }

}
