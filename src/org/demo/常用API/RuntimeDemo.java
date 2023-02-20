package org.demo.常用API;

import java.io.IOException;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        /*
        public static Runtime getRuntime()          当前系统的运行环境对象
        public void exit(int status)                停止虚拟机
        public int availableProcessors()            获得CPU的线程数
        public long maxMemory()                     JVM能从系统中获取总内存大小(单位byte)
        public long totalMemory()                   JVM已经从系统中获取总内存大小(单位byte)
        public long freeMemory()                    JVM剩余内存大小(单位byte)
        public Process exec(String command)         运行cmd命令
        */

        //获取runtime对象
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1==r2);

        //停止虚拟机  system.exit就是调用这个方法
        //Runtime.getRuntime().exit(0);
        //System.out.println("看看我执行了吗");

        //获取CPU的线程数(和运行电脑相关
        System.out.println(Runtime.getRuntime().availableProcessors()); //8

        //总内存大小，单位Byte（字节）/1024=kb  /1024 =mb
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        //已经从系统中获取总内存大小(单位byte)
        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);

        //剩余内存大小(单位byte)
        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);

        //运行cmd命令
        //Runtime.getRuntime().exec("ipconfig");//没啥反应的
        //Runtime.getRuntime().exec("notepad");//打来记事本
        // shutdown : 关机
        // 加上参数才能执行
        // -s : 默认在1分钟之后关机
        // -s -t 指定时间 : 指定关机时间
        // -a : 取消关机操作
        // -r: 关机并重启
//        Runtime.getRuntime().exec("shutdown -s -t 3600");//一个小时后关机
//        Runtime.getRuntime().exec("shutdown -a");
    }
}
