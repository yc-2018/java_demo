package org.demo进阶.单列集合collection;

import java.util.ArrayList;
import java.util.Collection;

/*
* Collection单列集合--
    * --List系列集合:添加的元素是有序、可重复、有索引       ArrayList(底层数组)   LinkedList(底层链表)      Vector（淘汰）
    * --set系列集合: 添加的元素是无序、不重复、无索引       HashSet->(LinkedHashSet)    TreeSet
    * Collection是单列集合的祖宗接口，它的功能是全部单列集合都可以继承使用的。
*Map双列集合
* *//*
public boolean add(E e)                 把给定的对象添加到当前集合中
public void clear()                     清空集合中所有的元素
public boolean remove(E e)              把给定的对象在当前集合中删除
public boolean contains(object obj)     判断当前集合中是否包含给定的对象
public boolean isEmpty()                判断当前集合是否为空
public int size()                       返回集合中元素的个数/集合的长度
*/
public class 单列集合的顶层接口 {
    public static void main(String[] args) {
                //注意点:
                //Collection是一个接口,我们不能直接创建他的对象。
                //所以，现在我们学习他的方法时，只能创建他实现类的对象。
                //实现类: ArrayList

                // 目的:为了学习collection接口里面的方法
                // 自己在做一些练习的时候，还是按照之前的方式去创建对象。

        Collection<String> coll = new ArrayList<>();

                //1.添加元素
                //细节1: 如果我们要往Lst系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
                //细节2: 如果我们要往Set系列集合中添加数据，如果当前要添加元素不存在，方法返回true，表示添加成功。
                //                                    如果当前要添加的元素已经存在，方法返回false，表示添加失败。
                //                                    因为Set系列的集合不允许重复。
        coll.add("ikun");
        coll.add("苏珊");
        coll.add("荔枝");
        System.out.println(coll);

                //2.清空
        //coll.clear();
        //System.out.println(coll);

                // 3.删除
                // 细节1: 因为Collection里面定义的是共性的方法，所以此时不能通过索引进行删除。只能通过元素的对象进行删除。
                // 细节2: 方法会有一个布尔类型的返回值，删除成功返回true，删除失败返回false
                //如果要刚除的元素不存在，就会剧除失败。
        System.out.println(coll.remove("苏珊"));
        System.out.println(coll);

                // 4.判断元素是否包含
                // 细节: 底层是依赖equals方法进行判断是否存在的。
                // 所以，如果集合中存储的是自定义对象，也想通过contains方法来判断是否包含，
                //                        *******那么在javabean类中，一定要重写equals方法。*******
        boolean result = coll.contains("ikun");
        System.out.println(result);

                //5.判断集合是否为空
        boolean result2 = coll.isEmpty();
        System.out.println(result2);

                //6.获取集合的长度
        int size = coll.size();
        System.out.println(size);
    }
}
/*Collection是单列集合的顶层接口，所有方法被List和Set系列集合共享
*
*常见成员方法:
*           add、clear、remove、 contains、 isEmpty、 size
*
*三种通用的遍历方式:
*   迭代器: 在遍历的过程中需要删除元素，请使用迭代器
*   增强for、Lambda:
*       仅仅想遍历，那么使用增强for或Lambda表达式
*
*
* */