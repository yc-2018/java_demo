//仰晨study 创建时间2023/2/10 2:10 星期五
package org.demo进阶.网络编程;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class G_组播_聊天室 {//先运行3个接收端在运行发送代码
    public static void main(String[] args) throws IOException {
         /*
            组播发送端代码
        */

        //创建MulticastSocket对象————————————————————————————很单播/广播就这个对象是不一样的
        MulticastSocket ms = new MulticastSocket();

        // 创建DatagramPacket对象
        String s = "你好,你好!" ;
        byte[] bytes = s.getBytes();
        InetAddress address = InetAddress.getByName("224.0.0.1");//————————————在224里面 设置一样的就是一组
        int port = 10000;

        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, address, port) ;

        // 调用MulticastSocket发送数据方法发送数据
        ms.send(datagramPacket);

        // 释放资源
        ms.close();


    }
}

class 接收端1 {
    public static void main(String[] args) throws IOException {
        /*
            组播接收端代码
        */


        //1. 创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket(10000);

        //2. 将将当前本机，添加到224.0.0.1的这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //3. 创建DatagramPacket数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //4. 接收数据
        ms.receive(dp);

        //5. 解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();

        System.out.println("ip为：" + ip + ",主机名为：" + name + "的人，发送了数据：" + new String(data,0,len));

        //6. 释放资源
        ms.close();


    }
}

class 接收端2 {
    public static void main(String[] args) throws IOException {
        /*
            组播接收端代码
        */


        //1. 创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket(10000);

        //2. 将将当前本机，添加到224.0.0.1的这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.1");
        ms.joinGroup(address);

        //3. 创建DatagramPacket数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //4. 接收数据
        ms.receive(dp);

        //5. 解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();

        System.out.println("ip为：" + ip + ",主机名为：" + name + "的人，发送了数据：" + new String(data,0,len));

        //6. 释放资源
        ms.close();


    }
}

class 接收端3 {
    public static void main(String[] args) throws IOException {
        /*
            组播接收端代码
        */


        //1. 创建MulticastSocket对象
        MulticastSocket ms = new MulticastSocket(10000);

        //2. 将将当前本机，添加到224.0.0.1的这一组当中
        InetAddress address = InetAddress.getByName("224.0.0.2");//------------组号就不一样了
        ms.joinGroup(address);

        //3. 创建DatagramPacket数据包对象
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        //4. 接收数据
        ms.receive(dp);

        //5. 解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        String ip = dp.getAddress().getHostAddress();
        String name = dp.getAddress().getHostName();

        System.out.println("ip为：" + ip + ",主机名为：" + name + "的人，发送了数据：" + new String(data,0,len));

        //6. 释放资源
        ms.close();


    }
}