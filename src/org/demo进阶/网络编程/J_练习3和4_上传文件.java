//仰晨study 创建时间2023/2/11 0:47 星期六
package org.demo进阶.网络编程;
import java.net.ServerSocket;
import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class J_练习3和4_上传文件 {
    /*
    * 练习3
    * 客户端:将本地文件上传到服务器。接收服务器的反馈。
    * 服务器: 接收客户端上传的文件，上传完毕之后给出反馈
    *
    *
    * 练习4
    * 解决重复名问题
    * */

}

class 客户端_{
    public static void main(String[] args) throws IOException {
//客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //1. 创建Socket对象，并连接服务器
        Socket socket = new Socket("127.0.0.1",10086);

        //2.读取本地文件中的数据，并写到服务器当中
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("aaa\\a.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        byte[] bytes = new byte[1024];
        int len;
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.flush();//如果不刷新  会有一段数据还在缓存里面  没写到服务端 导致图片少了一点 没损坏就算好的了
        bis.close();//这个是外界的  应该是要自己关的才对

        //往服务器写出结束标记
        socket.shutdownOutput();


        //3.接收服务器的回写数据
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println(line);


        //4.释放资源
        socket.close();
    }
}

class 服务器端_{
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10086);

        //2.等待客户端来连接
        Socket socket = ss.accept();

        //3.读取数据并保存到本地文件中
        String name = UUID.randomUUID().toString().replace("-", "");
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("aaa\\"+name+".jpg"));
        int len;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes)) != -1){
            bos.write(bytes,0,len);
        }
        bos.close();
        //4.回写数据
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("上传成功");
        bw.newLine();
        bw.flush();//如果不刷新  还在缓冲里面  客户端会收到null

        //5.释放资源
        socket.close();
        ss.close();
    }
}