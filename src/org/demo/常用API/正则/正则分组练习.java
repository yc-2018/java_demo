package org.demo.常用API.正则;
/*
* 每组是有组号的，也就是序号
* 规则1:从1开始，连续不间断
* 规则2:以左括号为基准，最左边的是第一组，其次为第二组，以此类推
* */

/**非捕获分组:：：：：：：：：：：：分组之后不需要再用本组数据，仅仅是把数据括起来。
 *  符号              含义                              举例
 * (?:正则)           获取所有                           Java(?:8|11|17)
 * (?=正则)           获取前面部分                       Java(?=8|11|17)
 * (?!正则)           获取不是指定内容的前面部分           Java(?!8|11|17)
* */

/*-----------------------
* 捕获分组:
后续还要继续使用本组的数据
正则内部使用:组号
正则外部使用:$组号
*------------------------ */

public class 正则分组练习 {
    public static void main(String[] args) {
        //需求1: 判断一个字符串的开始字符和结束字符是否一致? 只考虑一个字符
        // 举例: a123a   b456b   17891   &abc&  a123b(false)

        String regex1 = "(.).+\\1";
        //   \\组号: 表示把第X组的内容再出来用一次
        System.out.println("a123a".matches(regex1));
        System.out.println("b456b".matches(regex1));
        System.out.println("17891".matches(regex1));
        System.out.println("&abc&".matches(regex1));
        System.out.println("a123b".matches(regex1));

        System.out.println("---1----------------------2---");

        // 需求2: 判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        // 举例:abc123abc   bbb456bbb    123789123   &!@abc&!@   abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));
        System.out.println("bbb456bbb".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("a123a".matches(regex2));
        System.out.println("abc123abd".matches(regex2));

        System.out.println("---2----------------------3---");


        // 需求3: 判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        // 举例:aaa123aaa    bbb456bbb   111789111   &&abc&&
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("bbb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&abc&".matches(regex3));
        System.out.println("@@@123@@a".matches(regex3));

        System.out.println("---3----------------------4---");

        //口吃练习-------------
        //需求: 把重复的内容 替换为 单个的
        //学学---学
        //编编编编---编
        //程程程程程程---程
        String str ="我要学学编编编编程程程程程程";
        String result = str.replaceAll("(.)\\1*", "$1");
        //  (.) 表示把重复内容的第一个字符看做一组
        //  \\1 表示第一字符再次出现
        //  +至少一次
        //  $1 表示把正则表达式中第一组的内容，再拿出来用    # 正则外部使用:$组号
        System.out.println(result);     //我要学编程

    }
}
