//仰晨study 创建时间2023/2/10 1:43 星期五
package org.demo进阶.网络编程;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class F_练习_聊天室 {
     /*
            按照下面的要求实现程序
                UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
                UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
        */
}
//为了更好的模拟  发送端  可以 设置  运行多个  在右上角 ▷左边 编辑配置 看清楚包名——>修改选项(Modify options)——>允许多个实例（ALT+U）
class 发送端send{
    public static void main(String[] args) throws IOException {
        //1.创建对象DatagramSocket的对象
        DatagramSocket ds = new DatagramSocket();

        //2.打包数据
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入您要说的话：");
            String str = sc.nextLine();
            if("886".equals(str)){
                break;
            }
            byte[] bytes = str.getBytes();
            InetAddress address = InetAddress.getByName("127.0.0.1");//广播 255.255.255.255
            int port = 10086;
            DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
            //3.发送数据
            ds.send(dp);
        }


        //4.释放资源
        ds.close();
    }
}

class 接收端receive{
    public static void main(String[] args) throws IOException {
        //1.创建对象DatagramSocket的对象
        DatagramSocket ds = new DatagramSocket(10086);

        //2.接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);

        while (true) {
            ds.receive(dp);

            //3.解析数据包
            byte[] data = dp.getData();
            int len = dp.getLength();
            int port = dp.getPort();
            String name = dp.getAddress().getHostName();

            //4.打印数据
            System.out.println("端口为：" + port + ",主机名为：" + name + "的人，发送了数据：" + new String(data,0,len));
        }
    }
}