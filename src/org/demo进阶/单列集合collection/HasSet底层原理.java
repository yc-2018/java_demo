package org.demo进阶.单列集合collection;/*
HashSet底层原理
    HashSet集合 底层采取哈希表存储数据
    哈希表是一种对于增删改查数据性能都较好的结构
哈希表组成
    JDK8之前: 数组+链表
    JDK8开始: 数组+链表+红黑树*/

//哈希值
    //int index = （数组长度-1）& 哈希值；


import java.util.HashSet;
import java.util.Objects;

abstract public class HasSet底层原理 {
    /*哈希值
        根据hashCode方法算出来的int类型的整数
        该方法定义在Object类中，所有对象都可以调用，默认使用地址值进行计算
        一般情况下，会重写hashCode方法，利用对象内部的属性值计算哈希值*/

    /*对象的哈希值特点
        如果没有重写hashCode方法，不同对象计算出的哈希值是不同的                    Object.hashCode()谁都可以用的啦
        如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样
        的在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)*/
    public static void main(String[] args) {

        stu s1 = new stu("ikun", 66);
        stu s2 = new stu("ikun", 66);
        System.out.println(s1.hashCode());      //没重写：460141958     //重写后100274216
        System.out.println(s2.hashCode());      //没重写：1163157884    //重写后100274216

        //(哈希碰撞)
        System.out.println("abc".hashCode());//96354
        System.out.println("acD".hashCode());//96354

        //HashSetJDK8以前底层原理
        //1、创建一个默认长度16，默认加载因为0.75的数组，数组名table       16 X 0.75 = 12
        //           HashSet<string> table = new HashSet<>();
        //2、根据元素的哈希值跟数组的长度计算出应存入的位置
        //3、判断当前位置是否为null，如果是null直接存入
        //4、如果位置不为null，表示有元素，则调用equals方法比较属性值
        //5、一样:不存      不一样: 存入数组，形成链表
            //JDK8以前: 新元素存入数组，老元素挂在新元素下面
            //IDK8以后: 新元素直接挂在老元素下面

        //HashSetJDK8以后底层原理的其他变化
            //当链表长度大于8而且数组长度大于等于64  该链表自动转换为红黑树

            //如果集合中存储的是自定义对象，必须要重hashCode和equals方法      不然一样的东西都能放进去

        /*HashSet 的三个问题
问题1: HashSet为什么存和取的顺序不一样?        存通过has值   取 按顺序（数组+链表） ？
问题2: HashSet为什么没有索引?                因为数组下面挂着链表 所以没法定索引   ？
问题3: HashSet是利用什么机制保证数据去重的?     哈希值相同 会先对比 不同在放进去     ？
问题4：HashSet添加元素的过程?                 （数组长度-1）& 哈希值  位置有就链表到先面？
问题5：HashSet集合的底层数据结构是什么样的?      数组+链表（+红黑树（JDK8））       ？
*/
    }
}

class stu{
    private String name;
    private int age;


    public stu() {
    }

    public stu(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        stu stu = (stu) o;
        return age == stu.age && Objects.equals(name, stu.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String toString() {
        return "stu{name = " + name + ", age = " + age + "}";
    }
}

class Demo用HashSet去重{/*
需求:创建一个存储学生对象的集合，存储多个学生对象
使用程序实现在控制台遍历该集合。
要求:学生对象的成员变量值相同，我们就认为是同一个对象             //就是重写hashCode和equals方法
*/

    public static void main(String[] args) {
        stu s1 = new stu("ikun", 108);
        stu s2 = new stu("苏珊", 23);
        stu s3 = new stu("荔枝", 66);
        stu s4 = new stu("ikun", 108);

        HashSet<stu> hs = new HashSet<>();
        System.out.println(hs.add(s1)); //true
        System.out.println(hs.add(s2)); //true
        System.out.println(hs.add(s3)); //true
        System.out.println(hs.add(s4)); //false # 如果没有重写 就会成功添加进去

        System.out.println(hs);   //[stu{name = 荔枝, age = 66}, stu{name = 苏珊, age = 23}, stu{name = ikun, age = 108}]
    }

}