package org.demo进阶.单列集合collection;

import java.util.LinkedHashSet;

public abstract class LinkedHashSet底层原理 {/*
·有序、不重复、无索引。
·这里的有序指的是保证存储和取出的元素顺序一致
·原理:底层数据结构是依然哈希表，只是每个元素又额外的多了一个双链表的机制记录存储的顺序。
*/

    public static void main(String[] args) {
        stu s1 = new stu("ikun", 108);
        stu s2 = new stu("苏珊", 23);
        stu s3 = new stu("荔枝", 66);
        stu s4 = new stu("ikun", 108);

        LinkedHashSet<stu> lhs = new LinkedHashSet<>();
        lhs.add(s1);
        lhs.add(s2);
        lhs.add(s3);
        lhs.add(s4);

        //打印  还是 添加的时候的顺序
        System.out.println(lhs);    //[stu{name = ikun, age = 108}, stu{name = 苏珊, age = 23}, stu{name = 荔枝, age = 66}]
    }
}
/*总结
*1.LinkedHashSet集合的特点和原理是怎么样的?
*   ·有序、不重复、无索引
*   ·底层基于哈希表，使用双链表记录添加顺序
*
*2.在以后如果要数据去重，我们使用哪个?
*   ·默认使用HashSet
*   ·如果要求去重且存取有序，才使用LinkedHashSet
* */