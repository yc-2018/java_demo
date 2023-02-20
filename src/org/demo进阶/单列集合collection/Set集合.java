package org.demo进阶.单列集合collection;/*
1.Set系列集合的特点
    无序       （存取顺序不一致）
    不重复     （可以去除重复）
    无索引     （没有带索引的方法，所以不能使用普通for循环遍历，也不能通过索引来获取元素）
     Set集合的方法上基本上与Collection的API一致

2.Set集合的实现类特点
    HashSet: 无序、不重复、无索引
    LinkedHashSet: 有序、不重复、无索引
    TreeSet: 可排序、不重复、无索引

Collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的。
public boolean add(E e)                 把给定的对象添加到当前集合中
public void clear()                     清空集合中所有的元素
public boolean remove(E e)              把给定的对象在当前集合中删除
public boolean contains(object obj)     判断当前集合中是否包含给定的对象
public boolean isEmpty()                判断当前集合是否为空
public int size()                       返回集合中元素的个数/集合的长度
*/

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class Set集合 {
    //练习
        //利用Set系列的集合，添加字符串，并使用多种方式遍历
        //迭代器
        //增强for
        //Lambda表达式
    public static void main(String[] args) {
        //多态方式创建一个Set对象
        Set<String> set = new HashSet<>();

        //添加元素
        boolean r1 = set.add("ikun");
        boolean r2 = set.add("ikun");
        System.out.println(r1);         //true
        System.out.println(r2);         //false     # 不重复
        System.out.println(set);        //[ikun]

        set.add("苏珊");
        set.add("荔枝");
        set.add("树枝");
        System.out.println(set);        //[树枝, 荔枝, ikun, 苏珊]  # 无序


        System.out.println("---------迭代器遍历------------------");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str+" \t 迭代器");
        }


        System.out.println("---------增强for遍历------------------");
        for (String str : set) {
            System.out.println(str+" \t 食不食油饼");
        }

        System.out.println("---------Lambda表达式遍历------------------");
        set.forEach(s -> System.out.println(s+" \t 又没有树枝"));

    }
}
