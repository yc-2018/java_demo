package org.demo进阶.不可变集合;

import java.util.Iterator;
import java.util.List;

public class 不可变List {
    public static void main(String[] args) {
        //一旦创建完毕之后，是无法进行修改的，在下面的代码中，只能进行查询操作
        List<String> list = List.of("ikun", "苏珊", "树枝", "荔枝");

        System.out.println(list);//打印 正常

        for (String s : list)  //遍历正常
            System.out.println(s);


        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        //list.add("小黑子");    //报错UnsupportedOperationException
        //list.remove(1);       //报错

    }
}
