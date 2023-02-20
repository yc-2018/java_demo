package org.demo.练习;
// 有一个很有名的数学逻辑题叫做不死神兔问题，
// 有一对兔子，从出生后第三个月起每个月都生一对兔子小兔子长到第三个月后每个月又生一对兔子，
// 假如兔子都不死，问第十二个月的兔子对数为多少?
/*
1月: 1对
2月: 1对
3月: 2
4月: 3
5月: 5
6月: 8
特点: 从第三个数据开始，是前两个数据和(斐波那契数列)
*/

import java.util.Arrays;

public abstract class 不死神兔 {
    public static void main(String[] args) {
        //求解1:
        //1.创建一个长度为12的数组
        int[] arr = new int[12];
        //2.手动给0索引和1索引的数据进行赋值
        arr[0]=1;
        arr[1]=1;
        //3.利用循环给剩余的数据进行赋值
        for (int i = 2; i < arr.length; i++)
            arr[i]=arr[i-1]+arr[i-2];

        System.out.println(Arrays.toString(arr));   //[1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]
        //最大索引上的数据就是结果


        //求解2:
        //递归的方式去完成
        //1.递归的出口
        //2.找到递归的规律
        //Fn(12) = Fn(11) + Fn(10);
        //Fn(11) = Fn(10) + Fn(9);
        //Fn(10) = Fn(9) + Fn(8);
        //...
        //Fn(3) = Fn(1) + Fn(2);
        //Fn(2) = 1;
        //Fn(1) = 1;
        System.out.println(getCount(12));
    }

    public static int getCount(int month) {
        if (month==1||month==2)return 1;
        return getCount(month - 1) + getCount(month - 2);
    }
}
