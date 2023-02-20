package org.demo;

public class 数组 {
    public static void main(String[] args) {
//        数据类型[] 数组名 = new 数据类型[]{ 元素1，元素2，元素3...};
//        数据类型 数组名[] = new 数据类型[]{ 元素1，元素2，元素3...};
//        一般用第一种  可简化↓
//        数据类型[] 数组名 = { 元素1，元素2，元素3...};

        //记录3个学生的信息
        //年龄
        int[] age1 = new int[]{21,22,23};
        int[] age2 = {21,22,23};
        //姓名
        String[] name1 = new String[]{"张三","李四","王五"};
        String[] name2 = {"张三","李四","王五"};
        //身高
        double[] height1 = new double[]{172.2,182.9,167.7};
        double[] height2 = {172.2,182.9,167.7};


//        数组的遍历
            // 扩展:
            //自动的快速生成数组的遍历方式
            //idea提供的
            //数组名.fori
        for (int i = 0; i < age1.length; i++) {
            System.out.println(age1[i]+name1[i]+height1[i]);
            System.out.println(age2[i]+name2[i]+height2[i]+"---------");
        }

        System.out.println(age1);   //[I@1b6d3586    [表示当前是个数组    I表示是into类型   @间隔符    b6d3586十六进制地址值


        //数组的动态初始化------------------------------
        ////格式:
        //数据类型[] 数组名 = new 数据类型[数组的长度];//在创建的时候，由我们自己指定数组的长度，由虚拟机给出默认的初始化值
                String[] arr = new String[50];//添加学生
                arr[0] = "zhangsan";
                arr[1] ="lisi";
        //获取
                System.out.println(arr[0]);//zhangsan
                System.out.println(arr[1]);//lisi
                System.out.println(arr[2]);//打印出来的是默认初始化值null
        //数组默认初始化值的规律---------
        //整数类型: 默认初始化值0
        //小数类型:默认初始化值0.0
        //字符类型: 默认初始化值’\ueeee’ 空格
        //布尔类型: 默认初始化值 false
        //引用数据类型:默认初始化值 null



    }
}
