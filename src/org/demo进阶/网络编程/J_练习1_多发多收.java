//仰晨study 创建时间2023/2/11 0:32 星期六
package org.demo进阶.网络编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class J_练习1_多发多收 {
    /*
    客户端:多次发送数据
    服务器:接收多次接收数据，并打印
    */
}

class 客户{
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);

        Scanner s = new Scanner(System.in);
        OutputStream os = socket.getOutputStream();


        while (true){
            System.out.println("请输入想要发送的信息");
            String str = s.nextLine();
            if ("886".equals(str))break;
            os.write((str+"\r\n").getBytes());
        }
            socket.close();
    }
}


class 服务器{//练习7 启动服务器  在浏览器输入127.0.0.1:10086   就完成
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(10086);

        //while (true) {
            System.out.println("等待接收---");
            Socket accept = ss.accept();
            //System.out.println("收到开始解析...");
            BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));

            int ch;
            while ((ch = br.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println("\n");//客户端不重新close() get 压根运行不到这里  但是close就get报错了
        //}

        accept.close();
        ss.close();
    }
}
