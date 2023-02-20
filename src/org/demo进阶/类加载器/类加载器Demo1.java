//仰晨study 创建时间2023/2/14 2:18 星期二
package org.demo进阶.类加载器;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class 类加载器Demo1 {
    public static void main(String[] args) throws IOException {
        //static ClassLoader getSystemClassLoader() 获取系统类加载器
        //InputStream getResourceAsStream(String name)  加载某一个资源文件

        //获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();

        //利用加载器去加载一个指定的文件
        //参数：文件的路径（放在src的根目录下，默认去那里加载）
        //返回值：字节流。
        InputStream is = systemClassLoader.getResourceAsStream("prop.properties");//类加载器 相对路径不是项目下 而是src下

        Properties prop = new Properties();
        prop.load(is);

        System.out.println(prop);

        is.close();
    }
}
