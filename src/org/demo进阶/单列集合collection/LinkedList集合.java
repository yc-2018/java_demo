package org.demo进阶.单列集合collection;

import java.util.LinkedList;

public abstract class LinkedList集合 {
    //底层数据结构是双链表，查询慢，首尾操作的速度是极快的，所以多了很多首尾操作的特有API。

    /*特有方法
    public void addFirst(E e)     在该列表开头插入指定的元素
    public void addLast(E e)      将指定的元素追加到此列表的末尾
    public E getFirst()           返回此列表中的第一个元素
    public E getLast()            返回此列表中的最后一个元素
    public E removeFirst()        从此列表中删除并返回第一个元素
    public E removeLast()         从此列表中删除并返回最后一个元素
*/

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        System.out.println(list);

        //添加元素
        list.add("ikun");
        list.add("苏珊");
        list.add("荔枝");
        System.out.println(list);


        //在该列表开头插入指定的元素
        list.addFirst("香精煎鱼");
            System.out.println(list);

        //将指定的元素追加到此列表的末尾
        list.addLast("油饼");
            System.out.println(list);

        //返回此列表中的第一个元素
        String first = list.getFirst();
        System.out.println(first);

        //返回此列表中的最后一个元素
        String last = list.getLast();
        System.out.println(last);

        //从此列表中删除并返回第一个元素
        String s = list.removeFirst();
        System.out.println(s);
        System.out.println(list);

        //从此列表中删除并返回最后一个元素
        String s1 = list.removeLast();
        System.out.println(s1);
        System.out.println(list);

        //------------------
        System.out.println(list.get(2));
        System.out.println(list.indexOf("苏珊"));
    }
}
