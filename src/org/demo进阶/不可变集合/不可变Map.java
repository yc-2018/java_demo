package org.demo进阶.不可变集合;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 不可变Map {
    public static void main(String[] args) {

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
            //细节1:
                // 键是不能重复的 (重复会报错    IllegalArgumentException
            //细节2
                // Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
        Map<String, String> map = Map.of("ikun", "小黑子", "素质", "树子", "哎呦", "你干嘛",
                     "油饼", "有病", "食不食", "是不是","苏珊", "速删", "荔枝", "理智",
                     "只因", "鸡", "啊哈哈", "?!!", "无雨了", "无语了");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            String value = map.get(key);
            System.out.println(key+":"+value);
        }

        //map.put("两年半", "2.5");    //报错    UnsupportedOperationException

        System.out.println("----------超过10对的就要用Map.ofEntries(Entry对象)----");
        HashMap<String, String> hm = new HashMap<>();
        hm.put("ikun", "小黑子");
        hm.put("素质", "树子");
        hm.put("哎呦", "你干嘛");
        hm.put("油饼", "有病");
        hm.put("食不食", "是不是");
        hm.put("苏珊", "速删");
        hm.put("荔枝", "理智");
        hm.put("只因", "鸡");
        hm.put("啊哈哈", "?!!");
        hm.put("无雨了", "无语了");
        hm.put("2.5","两年半");

        //2.利用上面的数据来获取一个不可变的集合

        //获取到所有的键值对对象 (Entry对象)
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        //把entries变成一个数组
        Map.Entry[] arr1 = new Map.Entry[0];//会自动重新创建数组
        // 如果集合的长度 > 数组的长度 : 数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        // 如果集合的长度<= 数组的长度: 数据在数组中放的下，此时不会创建新的数组，而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);

        //不可变集合
        Map map1 = Map.ofEntries(arr2);     //没写泛化 obj
        System.out.println(map1);

        //↑一步到位=↓
        Map<Object, Object> map2 = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        System.out.println(map2);


        System.out.println();
        System.out.println("-------JDK10后新增加方法·真·一步到位--------------底层其实也和上面一样---");
        Map<String, String> map3 = Map.copyOf(hm);
        System.out.println(map3);

        //map3.put("666","777");      // 报错 UnsupportedOperationException
    }
}
