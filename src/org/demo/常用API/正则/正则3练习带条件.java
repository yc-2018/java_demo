package org.demo.常用API.正则;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则3练习带条件 {
    public static void main(String[] args) {
        /*有如下文本，请按照要求爬取数据。
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为
        这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台

        需求1:爬取版本号为8,11,17的Java文本，但是只要java，不显示版本号。
        需求2:爬取版本号为8,11,17的lava文本。正确爬取结果为: Java8 ava11 Java17 Java17
        需求3:爬取除了版本号为8,11,17的Java文本
        */


        String str = "java自从95年问世以来，经历了很多版本，目前企业中用的最多的是java8和java11，因为\n" +
                     "这两个是长期支持版本，下一个长期支持版本是java17，相信在未来不久java17也会逐渐登上历史舞台";
        //需求1:爬取版本号为8,11,17的Java文本，但是只要java，不显示版本号。
        //1.定义正则表达式
        String regex1 = "java(?=8|11|17)";
        //?理解为前面的数据Java
        //=表示在Java后面要跟随的数据
        //但是在获取的时候，只获取前半部分
        Pattern p1 = Pattern.compile(regex1);
        Matcher matcher1 = p1.matcher(str);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }
        System.out.println("------------------------");

        //需求2:爬取版本号为8,11,17的lava文本。正确爬取结果为: Java8 ava11 Java17 Java17
//      String regex2 = "java(8|11|17)";
        String regex2 = "java(?:8|11|17)";      //这个需求来看是一样的   ?:就是这个括号不分组
        Pattern p2 = Pattern.compile(regex2);
        Matcher matcher2 = p2.matcher(str);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
        System.out.println("------------------------");

        //需求3:爬取除了版本号为8,11,17的Java文本
        String regex3 = "java(?!8|11|17)";      //?!就是包涵都不要
        Pattern p3 = Pattern.compile(regex3);
        Matcher matcher3 = p3.matcher(str);
        while (matcher3.find()) {
            System.out.println(matcher3.group());
        }
        System.out.println("------------------------");

    }
}
