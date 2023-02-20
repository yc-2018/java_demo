package org.demo进阶.单列集合collection;
/*TreeSet的特点
    ·不重复、无索引、可排序
    ·可排序: 按照元素的默认规则 (有小到大)排序
    ·TreeSet集合底层是基于"""红黑树"""的数据结构实现排序的，增删改查性能都较好。*/

//TreeSet集合默认的规则
    //对于数值类型:Integer，Double，默认按照从小到大的顺序进行排序
    //对于字符、字符串类型:按照字符在ASCII码表中的数字升序进行排序。

//TreeSet 的两种比较方式
    //方式一:
        //默认排席/自然排序:javabean类实现Comparable接口指定比较规则
    //方式二:
        //比较器排序: 创建TreeSet对象时候，传递比较器Comparator指定规则

//使用原则:默认使用第一种，如果第一种不能满足当前需求，就使用第二种

import java.util.TreeSet;

public abstract class TreeSet集合 {
    public static void main(String[] args) {
        练习1();//存储整数并进行排序

        System.out.println("---------------------");

        练习2();//TreeSet对象排序

        System.out.println("---------------------");

        练习3();//用字符串长度排序    比较器排序: 创建TreeSet对象时候，传递比较器Comparator指定规则
    }

    private static void 练习3() {
        //需求:请自行选择比较器排序和自然排序两种方式
        //要求:存入四个字符串，"c"“ab”"df”“ikun"
            //按照长度排序，如果一样长则按照首字母排序

        //分析： String类我们没有办法 修改它的compareTo()方法  所以我们要用到 第二种方法定义他的排序规则
        String s1 = "df";
        String s2 = "c";
        String s3 = "ikun";
        String s4 = "ab";

        //o1:表示当前要添加的元素
        //o2: 表示已经在红黑树存在的元素
        //返回值规则跟之前是一样的
        TreeSet<String> ts = new TreeSet<>((o1, o2) -> {
            int i = o1.length() - o2.length();          // 按照长度排序
            return i == 0 ? o1.compareTo(o2) : i;      //  如果一样长则按照首字母排序
        });

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);     //[c, ab, df, ikun]
    }
    private static void 练习2() {
        //需求:创建TreeSet集合，并添加几个学生对象
        //学生对象属性:
        //姓名，年龄。
        //要求按照学生的年龄进行排序
        //同年龄按照姓名字母排列(暂不考虑中文)
        //同姓名，同年龄认为是同一个人

        //创建学生对象
        Student s1 = new Student("ikun", 108);
        Student s2 = new Student("suShan", 23);
        Student s3 = new Student("liZhi", 2);
        Student s4 = new Student("aKun", 108);
        Student s5 = new Student("ikun", 108);

        //默认排序/自然排序: Javabean类实现Comparable接口指定比较规则
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for (Student t : ts) {
            System.out.println(t);
        }
    }


    private static void 练习1() {
        //练习   需求:存储整数并进行排序
        //1·创建集合
        TreeSet<Integer> ts = new TreeSet<>();

        //2·添加元素
        ts.add(5);
        ts.add(2);
        ts.add(9);
        ts.add(3);
        ts.add(4);

        //3·遍历  打印吧
        System.out.println(ts);     //自动排序了  //[2, 3, 4, 5, 9]
    }

}

class Student implements Comparable<Student>{
    private String name;
    private int age;


    public Student() {
    }

    public Student(String name, int age) {
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

    public String toString() {
        return "Student{name = " + name + ", age = " + age + "}";
    }

    //默认排序/自然排序: Javabean类察现Comparable接口指定比较规则
    //要求按照学生的年龄进行排序
    //同年龄按照姓名字母排列(暂不考虑中文)
    //同姓名，同年龄认为是同一个人
    @Override
    public int compareTo(Student o) {
        System.out.println("插入过程   this = " + this+"  o = " + o);
        int i = this.getAge() - o.getAge();                             //this: 表示当前要添加的元素
        return i == 0 ? this.getName().compareTo(o.getName()) : i;      //o: 表示已经在红黑树存在的元素
        //返回值:
            //负数:认为要添加的元素是小的，存左边
            //正数:认为要添加的元素是大的，存右边
            //0:认为要添加的元素已经存在，舍弃
    }
}