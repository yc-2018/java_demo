//仰晨study 创建时间2023/2/9 23:50 星期四
package org.demo进阶.网络编程;

import java.io.IOException;
import java.net.*;

public class D_UDP发送数据 {
    //发送数据



    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        //1.创建DatagramSocket对象(快递公司)
        //细节：
        //绑定端口，以后我们就是通过这个端口往外发送
        //空参：所有可用的端口中随机一个进行使用
        //有参：指定端口号进行绑定


        String str = "你好威啊！小黑子";
        byte[] bytes = str.getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");   //发给这个ip
        int potr = 10086;   //发送给别人的端口

        //2.打包数据——>数据包
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, potr);

        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();
    }
}
