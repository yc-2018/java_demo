package org.demo.常用API.正则;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则4贪婪模式练习 {
    public static void main(String[] args) {
/*
 贪婪爬取: 在爬取数据的时候尽可能的多获取数据
 非贪婪爬取: 在爬取数据的时候尽可能的少获取数据

 数据：abbbbbbbbbbbbbbbcccccccccddd
    ab+:
    贪婪爬取: abbbbbbbbbbbb
    非贪婪爬取: ab
    Java当中，默认的就是贪婪爬取如果我们在数量词+* 的后面加上问号，那么此时就是非贪婪爬取
 */

        String s ="Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa经历了很多版本，" +
                  "目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本下一个长期支持版本是Java17，" +
                  "相信在未来不久Java17也会逐渐登上历史舞台";

        //贪婪爬取:
        Pattern p1 = Pattern.compile("ab+");
        Matcher matcher1 = p1.matcher(s);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

        //非贪婪爬取
        Pattern p2 = Pattern.compile("ab+?");
        Matcher matcher2 = p2.matcher(s);
        while (matcher2.find()) {
            System.out.println(matcher2.group());
        }
    }
}
