package org.demo进阶.泛型;

import java.util.ArrayList;

public class ListUtilDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();


        ListUtil.addAll(list,52,14,13,245,556,666);     //参数一:集合        参数二~最后: 要添加的元素

        System.out.println(list);
    }
}
