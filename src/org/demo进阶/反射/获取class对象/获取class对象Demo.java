//仰晨study 创建时间2023/2/11 16:31 星期六
package org.demo进阶.反射.获取class对象;

public class 获取class对象Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        /*
         * 获取class对象的三种方式：
         *   1. Class.forName("全类名");
         *   2. 类名.class
         *   3. 对象.getClass();
         *
         * */

        //1. 第一种方式
        //全类名 ： 包名 + 类名
        //最为常用的
        Class<?> clazz1 = Class.forName("org.demo进阶.反射.获取class对象.Student");

        System.out.println(clazz1);

        //2. 第二种方式
        //一般更多的是当做参数进行传递      比如锁synchronized ()
        Class clazz2 = Student.class;
        System.out.println(clazz2);


        //3.第三种方式
        //当我们已经有了这个类的对象时，才可以使用。
        Student s = new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);


        System.out.println(clazz1==clazz2); //true
        System.out.println(clazz2==clazz3); //true

    }
}
