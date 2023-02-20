//仰晨study 创建时间2023/2/10 18:14 星期五
package org.demo进阶.网络编程;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class H_TCP发送数据 {
    public static void main(String[] args) throws IOException {
        //TCP协议，发送数据

        //1.创建Socket对象
        //细节：在创建对象的同时会连接服务端
        //      如果连接不上，代码会报错        ----   所以要先运行接收数据（服务器端）

        Socket socket = new Socket("127.0.0.1", 10086);

        //2.可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write("little黑子 是吧".getBytes());        //19个字节

        //3.释放资源
        os.close();
        socket.close();
    }
}
