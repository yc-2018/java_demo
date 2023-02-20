package org.demo进阶.异常;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

interface 啥异常 {
    /*异常:异常就是代表程序出现的问题
    *误区:不是让我们以后不出异常，而是程序出了异常之后，该如何处理
    *
    *                    ___Error
    *                   /
    *lava.lang.Throwable
    *                   \___Exception————RuntimeException
    *                               \
    *                                \___其他异常
    *
    *
    *Error:代表的系统级别错误(属于严重问题)系统一旦出现问题，sun公司会把这些错误封装成Error对象。
    *      Error是给sun公司自己用的，不是给我们程序员用的。因此我们开发人员不用管它
    *
    *Exception:叫做异常，代表程序可能出现的问题
    *          我们通常会用Exception以及他的子类来封装程序出现的问题
    *
    *运行时异常:RuntimeException及其子类，编译阶段不会出现异常提醒
    *         运行时出现的异常(如: 数组索引越界异常)       ——→代码出错而导致程序出现的问题 一般是由于参数传递错误带来的问题
    *
    *编译时异常:编译阶段就会出现异常提醒的。(如:日期解析异常) ——→作用在于提醒程序员。
    *
    *
    *        ——→  Java文件
    *               |
    *           (Javac命令)————————编译时异常:编译阶段就要进行处理的异常。(如:日期解析异常)
    *               ↓
    *       ——→  字节码文件
    *               |
    *           (Java命令)————————运行时异常:RuntimeException及其子类，编译阶段不需要处理代码运行时出现的异常(如: 数组索引越界异常)
    *               ↓
    *        ——→  运行结果
    *
    * */
    static void main(String[] args) throws ParseException {
        //编译时异常(在编译阶段，必须要手动处理，否则代码报错)
        /*String time = "2023年1月25";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date date = sdf.parse(time);   // .parse这个方法需要异常处理 不然就报错*/

        //运行时异常(在编译阶段是不需要处理的，是代码运行时出现的异常 )
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]); //ArrayIndexOutOfBoundsException
    }
    /*总结
    *1.异常体系的最上层父类是谁? 异常分为几类?
    *   父类: Exception.
    *   异常分为两类: 编译时异常、运行时异常
    *
    * 2.编译时异常和运行时异常的区别?
    *   ·编译时异常: 没有继承RuntimeException的异常，直接继承于Exception。
    *               编译阶段就会错误提示
    *   ·运行时异常:RuntimeException本身和子类
    *             编译阶段没有错误提示，运行时出现的
    * */
}
