//仰晨study 创建时间2023/2/11 16:48 星期六
package org.demo进阶.反射.获取构造方法;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class 获取构造方法Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
    /*
        Class类中用于获取构造方法的方法
            Constructor<?>[] getConstructors()                                返回所有公共构造方法对象的数组
            Constructor<?>[] getDeclaredConstructors()                        返回所有构造方法对象的数组
            Constructor<T> getConstructor(Class<?>... parameterTypes)         返回单个公共构造方法对象
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes) 返回单个构造方法对象


        Constructor类中用于创建对象的方法
            T newInstance(Object... initargs)                                 根据指定的构造方法创建对象
            setAccessible(boolean flag)                                       设置为true,表示取消访问检查
    */

        System.out.println("1 .获取class字节码文件对象");
        Class clazz = Class.forName("org.demo进阶.反射.获取构造方法.Student");
        System.out.println(clazz);




        System.out.println("\n2.获取构造方法");
        Constructor[] cons1 = clazz.getConstructors();          //全部公共的
        System.out.println(Arrays.toString(cons1));

        Constructor[] cons2 = clazz.getDeclaredConstructors();  //全部方法 包括私有的
        System.out.println(Arrays.toString(cons2));

        Constructor con1 = clazz.getConstructor();              //拿他的空参构造
        System.out.println(con1);

        Constructor con2 = clazz.getConstructor(String.class);  //拿他一个参数是字符串的构造（为什么这样设置 因为有方法重载）
        System.out.println(con2);

        Constructor con3 = clazz.getDeclaredConstructor(String.class, int.class);   //拿他私有的s i 方法  上面的方法是获取不到的会报错的
        System.out.println(con3);

        Constructor con4 = clazz.getDeclaredConstructor(int.class);                 //拿他受保护的i 方法  上上面的方法是获取不到的会报错的
        System.out.println(con4);

        Constructor con5 = clazz.getConstructor(int[].class);     //可变参数
        System.out.println(con5);

        System.out.println("——————————————————获取修饰符————————————————————");

        int modifiers = con3.getModifiers();    //获取修饰符  返回 常量字段值 PRIVATE是2  PUBLIC是1  PROTECTED是4 STATIC是8
        System.out.println(modifiers);
        System.out.println(con4.getModifiers());

        System.out.println("——————————————————获取参数个数————————————————————");

        int pCount = con3.getParameterCount();
        System.out.println("pCount 的参数个数= " + pCount);
        System.out.println(con1.getParameterCount());
        System.out.println(con5.getParameterCount());

        System.out.println("——————————————————获取名字————————————————————");
        String name = con1.getName();
        System.out.println(name);

        System.out.println("——————————————————获取参数类型————————————————————");
        Parameter[] parameters = con3.getParameters();
        System.out.println(Arrays.toString(parameters));

        System.out.println("——————————————————创建对象————————————————————");
        //暴力反射：表示临时取消权限校验
        con3.setAccessible(true);

        Object stu = con3.newInstance("苏珊", 23);
        System.out.println(stu);
    }
}
