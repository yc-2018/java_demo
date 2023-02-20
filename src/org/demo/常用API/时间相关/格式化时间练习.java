package org.demo.常用API.时间相关;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
        *   假设，你初恋的出生年月日为: 2000-11-11
        * 请用字符串表示这个数据，并将其转换为: 2000年11月11日
        *
        *创建一个Date对象表示2000年11月11日
        * 创建一个simpleDateFormat对象，并定义格式为年月日
        * 把时间变成: 2000年11月11日*/
public class 格式化时间练习 {
    public static void main(String[] args) throws ParseException {

        String str = "2000-11-11";
        //定义和字符串格式一样的格式化对象
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        //把字符串对象转换为时间
        Date d1 = sdf1.parse(str);

        //格式化对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(d1);
        System.out.println(result);
    }
}
