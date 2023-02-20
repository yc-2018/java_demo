//仰晨study 创建时间2023/2/13 23:44 星期一
package org.demo进阶.枚举;

public interface 啥枚举 {/*
    枚举的概述
            枚举是Java中的一种特殊类型
    枚举的作用:"是为了做信息的标志和信息的分类"

    定义枚举类的格式:                   如：
    修饰符 enum 枚举名称{                  public enum Season {
        第一行都是罗列枚举类实例的名称             SPRING,SUMMER,AUTUMN,WINTER
    }                                   }

   通过编译再反编译就能看到
    Compiled from "Season.java"
    public final class Season extends java.lang.Enum<Season> {
        public static final Season SPRING = new Season();
        public static final Season SUMMER = new Season();
        public static final Season AUTUMN = new Season();
        public static final Season WINTER = new Season();
        public static Season[] values();
        public static Season valueOf(java.lang.String);

    }

枚举的特征:
枚举类都是继承了枚举类型:java.lang.Enum
枚举都是最终类，不可以被继承。
构造器的构造器都是私有的，枚举对外不能创建对象
枚举类的第一行默认都是罗列枚举对象的名称的。
枚举类相当于是多例模式。



案例说明:
    现在开发的超级玛丽游戏需要接收用户输入的四个方向的信号(上下左右)，以便控制玛丽移动的方向.
选择常量做信息标志和分类:
    虽然可以实现可读性，但是入参值不受约束，代码相对不够严谨
枚举做信息标志和分类:
    代码可读性好，入参约束严谨，代码优雅，是最好的信息分类技术!建议使用!


    */
}
