package org.demo进阶.IO流;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public abstract class O_反序列化流 {//也叫  对象操作输入流
    //可以把序列化到本地文件中的对象，读取到程序中来

    /*构造方法                                    说明
public ObjectInputStream(InputStream out)   把基本流变成高级流

      成员方法                                    说明
public object readObject()                  把序列化到本地文件中的对象，读取到程序中来
*/
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("aaa\\class.txt"));

        O_student o1 = (O_student) ois.readObject();        //强转回原来的类型
        O_student o2 = (O_student) ois.readObject();
        Object o3 = ois.readObject();
        Object o4 = ois.readObject();   //EOFException 不会反回负一或者null  直接报错   想法循环 加try
        System.out.println(o1);         //老师说一般规定把类都放进数组  在写出  这样  读入就一次就好了
        System.out.println(o2);
        System.out.println(o3);         //O_student{name = 只有, age = 0}  因为age加了瞬态关键字所以写就没有写进去  所以读出来就是默认值
        System.out.println(o4);

        ois.close();
    }
}
//如果在Javabean添加了属性读取也会报错    原因:文件中的版本号，跟Javabean的版本号不匹配
    //固定版本号
        //方法1 private static final long serialVersionUID = 1L;      //自己写

        //方法2 在在设置里面搜索
                //勾选  不带'serialVersionUID'的可序列化类
                //      Serializable class without 'serialVersionUlD

                //勾选  transient 字段在反序列化时未初始化
                //      Transient field is not initialized on deserialization
        //然后写完属性 在类的报黄提醒中自动添加

        //方法3 复制别的类的再改一下数值  比如 双击shift 搜索ArrayList
        //      就能看到private static final long serialVersionUID = 8683452581122892189L;