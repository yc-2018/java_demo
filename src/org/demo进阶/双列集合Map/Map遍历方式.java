package org.demo进阶.双列集合Map;
//有3种遍历方式
//键找值
//键值对
//Lambda表达式

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Map遍历方式 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("ikun", "小黑子");
        map.put("树枝", "素质");
        map.put("食不食人", "是不是人");
        map.put("荔枝", "理智");

        System.out.println("-------------------方式一：键找值------------------------");
        键找值遍历(map);

        System.out.println("-------------------方式二：键值对------------------------");
        键值对遍历(map);

        System.out.println("-------------------方式三：Lambda表达式------------------------");
//                   方法名称                                                说明
//default void forEach(BiConsumer<? super K,? super V> action)       结合lambda遍历Map集合
        Lambda表达式遍历(map);
    }

    private static void Lambda表达式遍历(Map<String, String> map) {
        map.forEach((s, s2) -> System.out.println(s + "~~>" + s2));
        //底层:
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
    }

    private static void 键值对遍历(Map<String, String> map) {
        //通过.entrySet()获取所有的键值对对象，返回一个Set集合
        Set<Map.Entry<String, String>> entries = map.entrySet();

        //111111
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + "——》" + entry.getValue());
        }

        //22222
//        Iterator<Map.Entry<String, String>> it = entries.iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> entry = it.next();
//            System.out.println(entry.getKey()+" ——》"+entry.getValue());
//        }

        //33333
//        entries.forEach(entry -> System.out.println(entry.getKey() + " ——》" + entry.getValue()));
    }

    private static void 键找值遍历(Map<String, String> map) {
        //获取所有的键，把这些键放到一个单列集合当中
        Set<String> keys = map.keySet();

        //1111111
        for (String key : keys) {
            System.out.println(key + "-->" + map.get(key));     //利用map集合中的键获取对应的值 get
        }

        //222222
//        Iterator<String> it = keys.iterator();
//        while (it.hasNext()) {
//            String key = it.next();
//            System.out.println(key+"-->"+map.get(key));
//        }

        //33333333333
//        keys.forEach(s -> System.out.println(s+"-->"+map.get(s)));
    }

}
