//仰晨study 创建时间2023/2/11 3:31 星期六
package org.demo进阶.网络编程;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

    public class J_练习7_浏览器 {
        public static void main(String[] args) throws IOException {
            ServerSocket serverSocket = new ServerSocket(10086);
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            byte[] bytes = new byte[4096];
            int read = inputStream.read(bytes);
            System.out.println("接收到的消息" + new String(bytes, 0, read));

            //返回消息
            OutputStream outputStream = socket.getOutputStream();

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/org/demo进阶/test/hh.html"));
            byte[] arr = new byte[1024];
            int len;

            while ((len=bis.read(arr)) != -1) {
                outputStream.write(arr,0,len);
                System.out.println(new String(arr,0,len));
            }


            bis.close();
            socket.close();
            serverSocket.close();
        }
    }

