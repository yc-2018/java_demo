package org.demo.常用API.正则;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 正则2网络练习 {
    public static void main(String[] args) throws IOException {
        //所有的身份证号码都爬取出来。

        //创建一个URL对象
        URL url = new URL("https://shuangyashan.dbw.cn/system/2007/08/22/050944026.shtml");
        //连接上这个网址
        URLConnection conn = url.openConnection();
//        System.out.println(conn);
        //创建一个对象去读取网络中的数据
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//        System.out.println(br.readLine());//自动一行一行读取网页
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
//        System.out.println(br.readLine());
        String line;
        String re = "[1-9]\\d{5}(?:18|19|20)\\d{2}(?:0\\d|10|11|12)(?:0[1-9]|[1-2]\\d|30|31)\\d{3}[\\dXx]";
        Pattern pattern = Pattern.compile(re);
        //一行一行读取
        while ((line=br.readLine()) != null){
            //拿着文本匹配器的对象matcher按照pattern的规则去读取当前的这一行信息
            Matcher matcher = pattern.matcher(line);
//            System.out.println(line);//看看网页又没有问题
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        br.close();//用完当然要关闭连接
    }
}
