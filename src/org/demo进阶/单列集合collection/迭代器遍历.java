package org.demo进阶.单列集合collection;
//Collection的遍历方式
    //迭代器遍历
    //增强for遍历
    //Lambda表达式遍历
/*迭代器遍历
迭代器在Java中的类是Iterator，迭代器是集合专用的遍历方式
Collection集合获取迭代器
    Iterator<E>iterator()   返回迭代器对象，默认指向当前集合的0索引
Iterator中的常用方法
boolean hasNext()           判断当前位置是否有元素，有元素返回true,没有元素返回false
E next()                    获取当前位置的元素，并将迭代器对象移向下一个位置。

迭代器遍历时，不能用集合的方法进行增加或者删除
    如果我实在要删除: 那么可以用迭代器提供的remove方法进行删除，如果我要添加，暂时没有办法。
*/

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 迭代器遍历 {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();    //1.创建集合并添加元素
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");

        Iterator<String> it = coll.iterator();          //2.获取迭代器对象
                                                        //迭代器就好比是一个箭头，默认指向集合的0索引处
        while (it.hasNext()) {                          //3.利用循环不断的去获取集合中的每一个元素
            String str = it.next();                     //4.next方法的两件事情: 获取元素并移动指针
            System.out.println(str);
            if (str.equals("aaa"))
                it.remove();                            //迭代器提供的remove方法进行删除
                //coll.remove("aaa");                   //ConcurrentModificationException
                                                        //但是遍历到ccc的时候用这个方法删aaa是不会报错的
        }

        System.out.println(coll);

        //System.out.println(it.next());                  //当上面循环结束之后，迭代器的指针已经指向了最后没有元素的位置  # 屁 遍历结束后it.remove(); 删的是最后一个元素
                                                         // 抛出NoSuchElementException
        System.out.println(it.hasNext());               //false//迭代器遍历完毕，指针不会复位
    //细节注意点:
        //报错NoSuchElementException
        //迭代器遍历完毕，指针不会复位
        //循环中只能用一次next方法
        //迭代器遍历时，不能用集合的方法进行增加或者删除

        //如果我们要继续第二次遍历集合，只能再次获取一个新的迭代器对象
        Iterator<String> it2 = coll.iterator();
        //it2.remove();          //报错：IllegalStateException      //看来是删除最后next返回的对象
        System.out.println(it2.next());
    }
}
//迭代器的四个细节:
    //如果当前位置没有元素，还要强行获取会报NoSuchElementException
    //迭代器遍历完毕，指针不会复位
    //循环中只能用一次next方法
    //迭代器遍历时，不能用集合的方法进行增加或者删除
