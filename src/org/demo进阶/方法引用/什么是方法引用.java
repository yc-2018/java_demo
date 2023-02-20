package org.demo进阶.方法引用;

import java.util.Arrays;

public interface 什么是方法引用 {//把已经有的方法拿过来用，当做函数式接口中抽象方法的方法体
    //但是要满足4个条件
        //1.引用处必须是函数式接口

        //2.被引用的方法必须已经存在————————————————————————不存在自己写也是很麻烦的啦
        //3.被引用方法的形参和返回值 需要跟抽象方法保持一致
        //4.被引用方法的功能要满足当前需求
        static void main(String[] args) {
            //需求:创建一个数组，进行倒序排列
            Integer[] arr = {5, 6, 7, 2, 1, 3, 4, 8, 9};

            //匿名内部类
//            Arrays.sort(arr, new Comparator<Integer>() {
//                @Override
//                public int compare(Integer o1, Integer o2) {
//                    return o2-o1;
//                }
//            });

            //lambda表达式
//            Arrays.sort(arr, (o1, o2) -> o2-o1);

            //方法引用
            Arrays.sort(arr,什么是方法引用::subtraction);

            System.out.println(Arrays.toString(arr));
        }


    //可以是Java已经写好的，也可以是一些第三方的工具类
    private static int subtraction(int num1, int num2) {
            return num2-num1;
    }
}

/*总结
1.什么是方法引用?
    把已经存在的方法拿过来用，当做函数式接口中抽象方法的方法体

2.::是什么符号?
    方法引用符

3.方法用时要注意什么?
    需要有函数式接口
    被引用方法必须已经存在
    被引用方法的形参和返回值需要跟抽象方法保持一致
    被引用方法的功能要满足当前的需求

4.方法引用的分类
    引用静态方法------------------------类名::静态方法
                /引用其他类的成员方法-----对象::成员方法
    引用成员方法——引用本类的成员方法-------this::成员方法
                \引用父类的成员方法------super::成员方法
    引用构造方法------------------------类名: : new

    其他调用方式——使用类名引用成员方法-----类名::成员方法>>>不能引用所有类中的成员方法>如果抽象方法的第一个参数是A类型的>只能引用A类中的方法
                \引用数组的构造方法------数据类型[]::new
* */
