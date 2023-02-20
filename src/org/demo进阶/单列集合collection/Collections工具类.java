package org.demo进阶.单列集合collection;/*Collections常用的API
方法名称                                                                          说明
public static <T> boolean addAll(Collection<T> c，T...elements)          批量添加元素
public static void shuffle(List<?> list)                                打乱List集合元素的顺序
//------------------下面的自行练习------------------------------------------
public static <T> void sort(List<T> list)                               排序
public static <T> void sort(List<T> list， Comparator<T> c)              根据指定的规则进行排序
public static <T> int binarySearch (List<T> list, T key)                以二分查找法查找元素
public static <T> void copy(List<T> dest， List<T> src)                  拷贝集合中的元素
public static <T> int fill (List<T> list, T obj)                        使用指定的元素填充集合
public static <T> void max/min(Collection<T> coll)                      根据默认的自然排序获取最大/小值
public static <T> void swap(List<?> list, int i, int j)                 交换集合中指定位置的元素
*/

import java.util.ArrayList;
import java.util.Collections;

public class Collections工具类 {
    public static void main(String[] args) {

        //批量添加元素
        ArrayList<String> arr = new ArrayList<>();
        Collections.addAll(arr, "ikun", "小黑子", "又没有树枝", "油饼食不食", "蒸虾头", "香精煎鱼食不食");
        System.out.println(arr);

        //打乱List集合元素的顺序
        Collections.shuffle(arr);
        System.out.println(arr);
    }
}
