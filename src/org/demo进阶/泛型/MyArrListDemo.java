package org.demo进阶.泛型;


public class MyArrListDemo{

    public static void main(String[] args) {
        MyArrList<String> myList = new MyArrList<String>();

        myList.add("ikun");
        myList.add("小黑子");
        myList.add("苏珊");
        myList.add("荔枝");

        System.out.println(myList);

        String s = myList.get(1);
        System.out.println(s);
    }

}
