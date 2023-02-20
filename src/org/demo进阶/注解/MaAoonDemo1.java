//仰晨study 创建时间2023/2/15 17:04 星期三
package org.demo进阶.注解;


@SuppressWarnings("all")
public class MaAoonDemo1 {
    public static void main(String[] args) {
        int a =1;
        int b = 1;

        method();   //提示的时候有划线 写完又没有....

        //黄色的波浪线 警告信息    取消没被使用的告警信息
    }

    //已过时的方式，还是可以继续使用的，但是一定会有替代解决方案
    @Deprecated
    private static void method() {
        System.out.println("看看我还能不能用");
    }
}

