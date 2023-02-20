//仰晨study 创建时间2023/2/10 18:01 星期五
package org.demo进阶.网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class I_TCP接收数据 {
    public static void main(String[] args) throws IOException {
        //TCP协议，接收数据

        //1.创建对象ServerSocket
        ServerSocket ss = new ServerSocket(10086);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        //3.从连接通道中获取输入流读取数据
        //InputStream is = socket.getInputStream();   //因为这个io流是附上在socket里面的所以关socket就会自动消失  不用自己关
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;

        while ((b = br.read()) != -1) {
            System.out.print((char)b);        //这样写中文肯定是会乱码的 可以用一个byte数组先装起来 再整体转字符串，也可以用转换流

        }

        //4.释放资源
        socket.close();
        ss.close();
    }
}
/*中文乱码  解决分案1 数组-------------------------------------------
    ....
    byte[] bytes = new byte[1024];
    int count = 0;

    while ((b = is.read()) != -1) {
        bytes[count++]=(byte) b;
    }
    System.out.println(new String(bytes,0,count));
    ....
    */

/*中文乱码  解决分案2  转换流-----------------------------------------
    //3.从连接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

       // BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        int b;
        while ((b = br.read()) != -1){
            System.out.print((char) b);
        }
*/