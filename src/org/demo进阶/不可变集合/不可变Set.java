package org.demo进阶.不可变集合;

import java.util.Iterator;
import java.util.Set;

public class 不可变Set {
    public static void main(String[] args) {

        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
            //细节
                //当我们要获取一个不可变的Set集合时，里面的参数一定要保唯一性
        Set<String> set = Set.of("荔枝","树枝", "Ikun", "苏珊", "小黑子");   //如果不唯一会报错 IllegalArgumentException

        for (String s : set)
            System.out.println(s);

        System.out.println("----------------");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }


        //set.add("油饼");            //报错 UnsupportedOperationException
        //set.remove("小黑子");      //报错 UnsupportedOperationException
    }
}
