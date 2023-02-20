package org.demo.算法.排序;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        //第一轮:把0 索引的数字作为基准数，确定基准数在数组中正确的位置   比基准数小的全部在左边，比基准数大的全部在右边。
        int[]arr={6,2,7,9,3,4,5,10,8,6};
        int[]arr1={6,2,7,9,3,4,5,10,8,6};

        快速排序算法(arr,0, arr.length-1);
        System.out.println("结果"+Arrays.toString(arr));
        System.out.println("上面带了自己的想法-----下面来欣赏老师的");
        快速排序老师算法(arr1,0, arr1.length-1);
        System.out.println("老师结果"+Arrays.toString(arr1));
    }

    private static void 快速排序老师算法(int[] arr, int i, int j) {
        //定义两个变量记录要查找的范围
        int start = i;
        int end = j;
        if (start > end) {
            return;         //递归出口
        }

        //记录基准数
        int baseNumber = arr[i];

        //利用循环找到要交换的数字
        while (start != end) {
            //利用end，从后往前开始找，找比基准数小的数字
            while (true) {
                if (end == start || arr[end] < baseNumber) {
                    break;
                }
                end--;
            }
            //利用start，从前往后找，找比基准数大的数字
            while (true) {
                if (end <= start || arr[start] > baseNumber) {
                    break;
                }
                start++;
            }
            System.out.println(""+start+" "+end);
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        // 当start和end指向了同一个元素的时候，那么上面的循环就会结束
        // 表示已经找到了基准数在数组中应存入的位置
        // 基准数归位
        // 就是拿着这个范围中的第一个数宁，跟start指向的元素进行交换
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start] = temp;

        System.out.println(Arrays.toString(arr));

        System.out.println("前面的");
        快速排序老师算法(arr,i,start-1);
        System.out.println("后面的");
        快速排序老师算法(arr,start+1,j);
    }

    // 参数一:我们要排序的数组
    // 参数二: 要排序数组的起始索引
    // 参数三:要排序数组的结束索引
    private static void 快速排序算法(int[] arr ,int i ,int j) {
        if (i>=j)return;
        int start =i;               //要排序数组的起始索引
        int end = j;     //要排序数组的结束索引
        int baseNumber = arr[i];    ////记录基准数

        //利用循环找到要交换的数字
        while (start != end) {
            while (start != end && arr[end] >= baseNumber)      end--;
            while (start != end && arr[start] <= baseNumber)   start++;
            System.out.println(""+start+" "+end);


            int temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;

        }
        int temp = arr[i];
        arr[i] = arr[start];
        arr[start]=temp;
        System.out.println(Arrays.toString(arr));

        System.out.println("前面的");
        快速排序算法(arr,i,start-1);
        System.out.println("后面的");
        快速排序算法(arr,start+1,j);

    }
}
