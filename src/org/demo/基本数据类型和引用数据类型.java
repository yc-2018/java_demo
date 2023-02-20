package org.demo;

public class 基本数据类型和引用数据类型 {
    public static void main(String[] args) {
     /*   基本数据类型        引用数据类型

            整数类型
            浮点数类型      除了左边的其他所有类型  比如String
            布尔类型
            字符类型*/

      // 传递引用数据类型时，传递的是地址值，形参的改变，影响实际参数的值
        int a = 100;
        System.out.println(a);      //100
        改变值(a);
        System.out.println(a);      //100
        String c = "ikun";
        改变值(c);
        System.out.println(c);      //ikun
        int[] i = {11,11,11,11};
        改变值(i);
        System.out.println(i[0]);   //167
    }

    public static void 改变值(int a){
        a = 200;
    }
    public static void 改变值(String c){
        c = "小黑子";
    }
    public static void 改变值(int[] i){
        i[0] = 167;
    }
}
