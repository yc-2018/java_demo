package org.demo进阶.单列集合collection;
//list集合  包括  ArrayList     LinkedList      Vector（过时）

/*List集合的特点
*   有序:存和取的元素顺序一致
*   有索引:可以通过索引操作元素
*   可重复:存储的元素可以重复
* */
/*List集合的特有方法
    Collection的方法List都继承了
    List集合因为有索引，所以多了很多索引操作的方法

        void add(int index,E element)       在此集合中的指定位置插入指定的元素
        E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        E get(int index)                    返回指定索引处的元素
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class ArrayList集合 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ikun");
        list.add("苏珊");
        list.add("荔枝");
        list.add("树枝");
        System.out.println("添加后"+list);

        //指定位置插入指定的元素/////////////////////////////////////////////////
            //细节: 原来索引上的元素会依次往后移
        list.add(0, "小黑子");
        System.out.println("插入后"+list);

        //删除指定索引处的元素，返回被删除的元素/////////////////////////////////////
        list.remove(0);

        list.remove("苏珊");          //存在 删除成功返回true   反之
        System.out.println("删除后"+list);
        //细节
        //List<Integer> list1 = new ArrayList<>();
        //list.add(1);list.add(2);list.add(3);
        //删除元素
        //list.remove(1);
        //请问: 此时删除的是1这个元素，还是1索引上的元素?
        //为什么?
        //因为在调用方法的时候，如果方法出现了重戟现象
        //优先调用，实参跟形参类型一致的那个方法。
        //所以会删除索引是1的元素
        //解决办法1：
        //手动装箱，手动把基本数据类型的1变成Integer类型   Integer.valueOf(1)

        //修改指定索引处的元素，返回被修改的元素////////////////////////////////////////////////
        String result = list.set(1, "篮球");
        System.out.println(result);
        System.out.println("修改后"+list);

        //返回指定索引处的元素///////////////////////////////////////////////////////////////
        String s = list.get(0);
        System.out.println("返回指定索引处的元素: "+s);


        System.out.println("---------------List集合的遍历方式---------------------");
        //******************/////////List集合的遍历方式////////////****************/////////
        System.out.println("///////////////迭代器遍历/////////////////////////////////////");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }

        System.out.println("//////////////列表迭代器遍历////////////////////////////////");
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        //额外添加了一个方法: 在遍历的过程中，可以添加元素
        ListIterator<String> it1 = list.listIterator();
        while (it1.hasNext()) {
            String str = it1.next();
            if (str.equals("篮球")) {
                it1.add("只因");
            }
        }
        System.out.println(list);

        System.out.println("////////////////////增强for遍历///////////////////////////");
        for (String s1 : list) {
            System.out.println(s1);
        }


        System.out.println("////////////////////Lambda表达式遍历///////////////////////");
        list.forEach(s12 -> System.out.println(s12+"   油饼？"));


        System.out.println("////////////////////普通for循环 (因为List集合存在索引)///////");
        //size方法跟get方法还有循环结合的方式，利用索引获取到集合中的每一个元素
        for (int i = 0; i < list.size(); i++) {
            //i:依次表示集合中的每一个索引
            String str = list.get(i);
            System.out.println(i+str);
        }


        /*五种遍历方式对比
迭代器遍历   在遍历的过程中需要删除元素，请使用迭代器
列表迭代器   在遍历的过程中需要添加元素，请使用列表迭代器
增强for遍历         仅仅想遍历，那么使用增强for或Lambda表达式
Lambda表达式        仅仅想遍历，那么使用增强for或Lambda表达式
普通for     如果遍历的时候想操作索引，可以用普通for
*/

        //ArrayList集合底层原理
            //1、利用空参创建的集合，在底层创建一个默认长度为0的数组
            //2、添加第一个元素时，底层会创建一个新的长度为10的数组
            //3、存满时，会扩容1.5倍
            //4、如果一次添加多个元素，1.5倍还放不下，则新创建数组的长度以实际为准
    }
}
