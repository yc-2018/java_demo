//仰晨study 创建时间2023/2/11 17:49 星期六
package org.demo进阶.反射.获取成员变量;

import java.lang.reflect.Field;
import java.util.Arrays;

public class 获取成员变量Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
    /*
       Class类中用于获取成员变量的方法
            Field[] getFields()：                返回所有公共成员变量对象的数组
            Field[] getDeclaredFields()：        返回所有成员变量对象的数组
            Field getField(String name)：        返回单个公共成员变量对象
            Field getDeclaredField(String name)：返回单个成员变量对象

       Field类中用于创建对象的方法
            void set(Object obj, Object value)：赋值
            Object get(Object obj)              获取值

    */


        System.out.println("1.获取class字节码文件的对象");
        Class clazz = Class.forName("org.demo进阶.反射.获取成员变量.Student");
        System.out.println(clazz);



        System.out.println("\n2.获取所有的成员变量");
        Field[] fields = clazz.getDeclaredFields();
        System.out.println(Arrays.toString(fields));


        System.out.println("\n获取单个成员变量");
        Field name = clazz.getDeclaredField("name");   //没有会报错NoSuchFieldException
        System.out.println(name);

        System.out.println("\n获取权限修饰符");
        int modifiers = name.getModifiers();
        System.out.println(modifiers);

        System.out.println("\n获取成员变量的名字");
        String n = name.getName();
        System.out.println(n);

        System.out.println("\n获取成员变量的数据类型");
        Class<?> type = name.getType();
        System.out.println(type);

        System.out.println("\n获取成员变量记录的值");
        Student s = new Student("ikun", 108, "信仰");
        //因为是私有的所以一定要先暴力反射 才能获取 或 修改 里面的值
        name.setAccessible(true);
        String value = (String) name.get(s);
        System.out.println(value);              //ikun

        System.out.println("\n修改对象里面记录的值");
        name.set(s, "小黑子");
        System.out.println(s);

    }
}
