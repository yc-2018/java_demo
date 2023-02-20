package org.demo进阶.双列集合Map;/*
·TreeMap跟TreeSet底层原理一样，都是红黑树结构的
·由键决定特性:不重复、无索引、可排序
·可排序:对键进行排序
·注意:默认按照键的从小到大进行排序，也可以自己规定键的排序规则*/

//代码书写两种排序规则
    //实现Comparable接口，指定比较规则。
    //创建集合时传递Comparator比较器对象，指定比较规则。

import java.util.TreeMap;

public class TreeMap集合 {
    public static void main(String[] args) {
        //需求1:
            //键:整数表示id
            //值:字符串表示商品名称
            //要求:按照id的升序排列、按照id的降序排列
        需求1();

        System.out.println("----------------------------------");

        //需求2:
            //键:学生对象
            //值:籍贯
            //要求:按照学生{{年龄}}的升序排列，年龄一样按照{{姓名}}的字母排列，同姓名年龄视为同一个人。
        需求2();
    }


    private static void 需求1() {
        //Integer Double 默认情况下都是按照升序排列的
        //String 按照字母再ASCII码表中对应的数字升序进行排列
        //abcdefg ...
        //TreeMap<Integer, String> tm = new TreeMap<>();//   默认  {1=康帅傅, 2=六个核弹, 3=雷碧, 4=可恰可乐, 5=粤力粤}
        TreeMap<Integer, String> tm = new TreeMap<>((o1, o2) -> o2-o1);

        tm.put(3, "雷碧");
        tm.put(2, "六个核弹");
        tm.put(1, "康帅傅");
        tm.put(5, "粤力粤");
        tm.put(4, "可恰可乐");

        System.out.println(tm);         //{5=粤力粤, 4=可恰可乐, 3=雷碧, 2=六个核弹, 1=康帅傅}
    }

    private static void 需求2() {
        TreeMap<Stu, String> tm = new TreeMap<>();      //Stu实线了Comparable<Stu>方法 才可

        Stu s1 = new Stu("ikun", 108);
        Stu s2 = new Stu("苏珊", 23);
        Stu s3 = new Stu("只因", 25);
        Stu s4 = new Stu("a鸡", 108);

        tm.put(s1, "蔡徐村");
        tm.put(s2, "荔枝市");
        tm.put(s3, "太美区");
        tm.put(s4, "小黑镇");
        tm.putIfAbsent(s1, "黄昏都不变国");   //不覆盖值方法

        tm.forEach((stu, s) -> System.out.println(stu+"——>"+s));
    }
}
class Stu implements Comparable<Stu>{
    private String name;
    private int age;


    public Stu() {
    }

    public Stu(String name, int age) {
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
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Stu{name = " + name + ", age = " + age + "}";
    }


    @Override
    public int compareTo(Stu o) {
        int i = this.getAge()-o.getAge();
        return i == 0 ? this.getName().compareTo(o.getName()) : i;
    }
}