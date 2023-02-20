//仰晨study 创建时间2023/2/9 18:02 星期四
package org.demo进阶.网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class C_InetAddress类的使用 {
    //java.net 类InetAddress 直接已知子类Inet4Address,Inet6Address
    /*
        static InetAddress getByName(String host)  确定主机名称的IP地址。主机名称可以是机器名称，也可以是IP地址
        String getHostName()                        获取此IP地址的主机名
        String getHostAddress()                     返回文本显示中的IP地址字符串

        机器名称：在我的电脑  右键属性 面有一个叫电脑名称的 就是了
*/

    public static void main(String[] args) throws UnknownHostException {
        //1.获取InetAddress的对象
        //IP的对象 一台电脑的对象
        //InetAddress address = InetAddress.getByName("yc2023");//没有会报错UnknownHostException: 不知道这样的主机。
        InetAddress address = InetAddress.getByName("192.168.59.1");
        System.out.println(address);

        //获取这个ip的名字
        String name = address.getHostName();
        System.out.println(name);               //yc2023

        //获取这个IP的IP地址
        String ip = address.getHostAddress();
        System.out.println(ip);


    }
}
