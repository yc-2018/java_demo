//仰晨study 创建时间2023/2/5 18:32 星期日
package org.demo进阶.IO流;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//中文写成都会变成Unicode编码\u6CA1\u6709\u6CDB\u578B=\u5565\u90FD\u80FD\u5199
/**/
public abstract class T_Properties类 {//Properties作为双列集合的方法
    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();         //字节流 字符流 都是支持的
        prop.put("苏珊", "一般只写字符串");
        prop.put("没有泛型", "啥都能写");
        prop.put("abc", "123");
        //——————————————————写————————————————————————————
        FileOutputStream fos = new FileOutputStream("aaa\\xx.properties");
        prop.store(fos, "ikun:中文会变编码，这里相当于是注释");
        fos.close();

        //——————————————————读————————————————————————————
        FileReader fr = new FileReader("aaa\\xx.properties");
        prop.load(fr);      //集合里面的元素会被覆盖
        fr.close();

        System.out.println(prop);
    }
}
/*重点:有一些特有的方法，可以把集合中的数据，按照键值对的形式写到配置文件当中。
    也可以把配置文件中的数据，读取到集合中来。后缀名: properties
细节:虽然我们可以往Properties当中添加任意的数据类型，
     但是一般只会往里面添加字符串类型的数据
     properties.store(输出流,"放到文件的注释") ;
     properties.load(输入流);*/