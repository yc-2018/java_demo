package org.demo进阶.IO流;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class O_序列化流 {//也叫对象操作输出流
    //可以把java中的对象写到本地文件中

    /*构造方法                                          说明
public ObjectOutputStream(OutputStream out)     把基本流包装成高级流

      成员方法                                          说明
public final void writeObject(Object obj)       把对象序列化(写出)到文件中去
*/

    public static void main(String[] args) throws IOException {
        O_student ikun = new O_student("ikun", 108);
        O_student suShan = new O_student("苏珊", 23);
        O_student ji = new O_student("只有", 67);

        /*序列化流的小细节
            使用对象输出流将对象保存到文件时会出现NotSerializableException异常
            解决方案:需要让Javabean类实现Serializable接口
        */
        // 创建序列化流的对象/对象操作输出流
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aaa\\class.txt"));
        // 写出数据
        oos.writeObject(ikun);
        oos.writeObject(suShan);
        oos.writeObject(ji);
        //oos.writeObject("吊毛");    //可以的
        // 释放资源
        oos.close();
    }
}
/*序列化流/反序列化流的细节汇总
使用序列化流将对象写到文件时，需要让Javabean类实现Serializable接口
   否则，会出现NotSerializableException异常

序列化流写到文件中的数据是不能修改的，一旦修改就无法再次读回来了

序列化对象后，修改了Javabean类，再次反序列化，会不会有问题?
会出问题，会抛出InvalidClassException异常
解决方案:给Javabean类添加serialVersionUID (序列号、版本号)

如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢?
解决方案: 给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与席列化过程*/