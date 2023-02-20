//仰晨study 创建时间2023/2/12 2:12 星期日
package org.demo进阶.反射.练习2_配置文件;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class 动态创建对象调用方法Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException{
        /*
        反射可以跟配置文件结合的方式，动态的创建对象，并调用方法                改配置文件就能改变运行结果
    */


        //1.读取配置文件中的信息
        Properties prop = new Properties();

        FileInputStream fis = new FileInputStream("src\\org\\demo进阶\\反射\\练习2_配置文件\\config.properties");
        prop.load(fis);
        fis.close();

        //2.获取全类名和方法名
        String className = (String) prop.get("classname");
        String  methodName = (String)prop.get("methodName");

        //3.利用反射创建对象并运行方法
        Class<?> clazz = Class.forName(className);

        //获取构造方法
        Constructor<?> con = clazz.getDeclaredConstructor();
        Object o = con.newInstance();
        System.out.println(o);

        //获取成员方法并运行
        Method method = clazz.getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);


    }
}






/*Properties不支持读取中文只能先把作文写进去让他自动转换先

FileOutputStream fos = new FileOutputStream("src\\org\\demo进阶\\反射\\练习2_配置文件\\config.properties");
        prop.put("classname", "org.demo进阶.反射.练习2_配置文件.Student");
        prop.put("methodName", "study");
        prop.store(fos,"No Chinese, please");
        fos.close();*/