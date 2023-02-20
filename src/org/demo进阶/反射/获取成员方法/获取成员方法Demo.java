//仰晨study 创建时间2023/2/11 18:23 星期六
package org.demo进阶.反射.获取成员方法;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class 获取成员方法Demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    /*
       Class类中用于获取成员方法的方法
            Method[] getMethods()：返回所有公共成员方法对象的数组，包括继承的
            Method[] getDeclaredMethods()：返回所有成员方法对象的数组，不包括继承的
            Method getMethod(String name, Class<?>... parameterTypes) ：返回单个公共成员方法对象
            Method getDeclaredMethod(String name, Class<?>... parameterTypes)：返回单个成员方法对象


       Method类中用于创建对象的方法
            Object invoke(Object obj, Object... args)：运行方法
            参数一：用obj对象调用该方法
            参数二：调用方法的传递的参数（如果没有就不写）
            返回值：方法的返回值（如果没有就不写）

        获取方法的修饰符
        获取方法的名字
        获取方法的形参
        获取方法的返回值
        获取方法的抛出的异常

    */



        //1. 获取class字节码文件对象
        Class clazz = Class.forName("org.demo进阶.反射.获取成员方法.Student");

        System.out.println("2. 获取里面所有的方法对象(包含父类中所有的公共方法)");
        Method[] methods = clazz.getMethods();
        Arrays.stream(methods).forEach(System.out::println);


        System.out.println("\n————————————获取里面所有的方法对象(不能获取父类的，但是可以获取本类中私有的方法)————————————");
        Method[] methods1 = clazz.getDeclaredMethods();
        Arrays.stream(methods1).forEach(System.out::println);


        System.out.println("\n获取指定的单一方法");
        Method m = clazz.getDeclaredMethod("eat", String.class);
        System.out.println(m);


        System.out.println("\n获取方法的修饰符");
        int modifiers = m.getModifiers();
        System.out.println(modifiers);


        System.out.println("\n获取方法的名字");
        String name = m.getName();
        System.out.println(name);


        System.out.println("\n获取方法的形参");
        Parameter[] parameters = m.getParameters();
        System.out.println(Arrays.toString(parameters));


        System.out.println("\n获取方法的抛出的异常");
        Class<?>[] exceptionTypes = m.getExceptionTypes();
        System.out.println(Arrays.toString(exceptionTypes));


        System.out.println("\n————————————————方法运行————————————————————");
        /*Method类中用于创建对象的方法
        Object invoke(Object obj, Object... args)：运行方法
        参数一：用obj对象调用该方法
        参数二：调用方法的传递的参数（如果没有就不写）
        返回值：方法的返回值（如果没有就不写）*/

        Student s = new Student();
        //暴力反射方法
        m.setAccessible(true);
        //参数一s：表示方法的调用者
        //参数二"汉堡包"：表示在调用方法的时候传递的实际参数
        String result = (String)m.invoke(s, "汉堡包");
        System.out.println(result);

        //System.out.println(Arrays.deepToString(m.getParameterAnnotations()));//获取参数注释
    }
}
