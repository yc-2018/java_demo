package org.demo.算法.查找;
//属于二分查找改进
// 前提条件:数组中的数据必须是有序的***
// 核心逻辑: 每次排除一半以上 （尽可能多）的查找范围

public class 插值查找 {
    //插值查找: mid尽可能的靠近要查找的数据，***但是要求数据尽可能的分布均匀***
    public static void main(String[] args) {
    int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 110};
        int index = 插值查找(arr, 34);
        System.out.println(index);

    }

    private static int 插值查找(int[] arr, int number) {
        //先定义2个变量记录查询的范围
        int min =0;
        int max = arr.length-1;

        //循环截半去找
        while (true) {
            if (min > max) {
                return -1;
            }
            //找到尽量靠近目标的位置************
            int mid = min+((number-arr[min])/(arr[max]-arr[min]))*(max-min);
            //拿着mid去比较
            if (arr[mid] == number) {
                return mid;             //找到  返回
            } else if (arr[mid] > number) {
                max = mid - 1;              //说明目标mid不在右边
            } else if (arr[mid] < number) {
                min = mid + 1;              //说明目标mid不在左边
            }
            System.out.println("看看我循环多少次");
        }

    }
}
