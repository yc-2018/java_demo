//仰晨study 创建时间2023/2/11 0:35 星期六
package org.demo进阶.网络编程;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class J_练习2_接收和反馈 {
    /*
    * 客户端:发送一条数据接收服务端反馈的消息并打印
    * 服务器:接收数据并打印再给客户端反馈消息
    * */

    }
class 客户端{

    public static void main(String[] args) throws IOException {
//客户端：发送一条数据，接收服务端反馈的消息并打印
        //服务器：接收数据并打印，再给客户端反馈消息



        //1.创建Socket对象并连接服务端
        Socket socket = new Socket("127.0.0.1",10086);


        //2.写出数据
        socket.getOutputStream().write("见到你很高兴！".getBytes());

        //写出一个结束标记
        socket.shutdownOutput();



        //3.接收服务端回写的数据
        InputStreamReader isr = new InputStreamReader(socket.getInputStream());
        int b;
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }


        //释放资源
        socket.close();
    }
}

class 服务器端{
    public static void main(String[] args) throws IOException {
        //客户端：发送一条数据，接收服务端反馈的消息并打印
        //服务器：接收数据并打印，再给客户端反馈消息


        //1.创建对象并绑定10000端口
        ServerSocket ss = new ServerSocket(10086);

        //2.等待客户端连接
        Socket socket = ss.accept();

        //3.socket中获取输入流读取数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        int b;
        //细节：
        //read方法会从连接通道中读取数据
        //但是，需要有一个结束标记，此处的循环才会停止
        //否则，程序就会一直停在read方法这里，等待读取下面的数据
        while ((b = isr.read()) != -1){
            System.out.print((char)b);
        }
        System.out.println("--------------");

        //4.回写数据
        String str = "到底有多开心？";
        OutputStream os = socket.getOutputStream();
        os.write(str.getBytes());

        //释放资源
        socket.close();
        ss.close();


    }
}