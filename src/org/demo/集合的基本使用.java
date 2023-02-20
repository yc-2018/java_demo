package org.demo;

import java.util.AbstractList;
import java.util.ArrayList;

public class 集合的基本使用 {//集合不能存基本数据类型

    public static void main(String[] args) {
        // 1.创建集合的对象
        // 泛型: 限定集合中存储数据的类型
        // ArrayList<String> list = new ArrayList<String>();
        // JDK7:

        // 此时我们创建的是ArrayList的对象，而ArrayList是java已经写好的一个类
        // 这个类在底层做了一些处理
        // 打印对象不是地址值，而是集合中存储数据内容
        // 在展示的时候会拿[]把所有的数据进行包裹


        /*
        *           方法名                        说明
            boolean add(E e)            添加元素，返回值表示是否添加成功
            boolean remove(E e)         删除指定元素,返回值表示是否删除成功
            E remove(int index)         删除指定索引的元素,返回被删除元素
            E set(int index,E e)        修改指定索引下的元素,返回原来的元素
            E get(int index)            获取指定索引的元素
            int size()                  集合的长度，也就是集合中元素的个数
        * */
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        //添加
        System.out.println(list.add("123"));    //返回布尔值
        list.add("aaa");
        list.add("ikun");
        list.add("小黑子");
        list.add("小黑子");
        System.out.println(list);

        // 删除
        boolean result = list.remove("aaa");
        System.out.println(""+result+"   "+list.remove("bbb"));         //true   false
        System.out.println(list);
        String remove = list.remove(0);//返回被删除的那个值
        System.out.println(remove);         //123
        System.out.println(list);           //[ikun, 小黑子]

        // 修改
        System.out.println(list.set(0,"真i坤"));      //ikun   如果接收就是返回原来的元素
        System.out.println(list);                   //[真i坤, 小黑子]

        // 查询元素
        String s = list.get(1);
        System.out.println(s);                      //小黑子

        //遍历  快捷键 list.fori
        for (int i = 0; i < list.size(); i++) {
            String s1 = list.get(i);
            System.out.println(s1);
        }

    }
}
