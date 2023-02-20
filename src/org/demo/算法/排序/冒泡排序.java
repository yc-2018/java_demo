package org.demo.算法.排序;

import java.util.Arrays;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[]arr={3,2,5,4,1};

        int[]排序后数组=冒泡排序算法(arr);
        System.out.println(Arrays.toString(排序后数组));
    }

    private static int[] 冒泡排序算法(int[] arr) {
        for (int j = 1; j < arr.length; j++) {              //表示我要执行多少轮。
            for (int i = 0; i < arr.length-j; i++) {        //每一轮中我如何比较数据并找到当前的最大值
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
            System.out.println("第"+j+"次排序"+Arrays.toString(arr));
        }
        return arr;
    }
}
//1，相邻的元素两两比较，大的放右边，小的放左边。
//2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推
//3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。