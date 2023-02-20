//仰晨study 创建时间2023/2/15 18:39 星期三
package org.demo进阶.注解;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MaAoonDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1.获取MyTestDemo这个类的字节码文件对象
        Class<?> clazz = Class.forName("org.demo进阶.注解.MyTestDemo");


        Constructor<?> constructor = clazz.getDeclaredConstructor();
        Object o = constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();


        for (Method method : methods) {
            if (method.isAnnotationPresent(MyTest.class)) {
                method.invoke(o);
            }
        }


    }
}
