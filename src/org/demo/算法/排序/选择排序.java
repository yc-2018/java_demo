package org.demo.算法.排序;
//选择排序:从 0 索引开始，拿着每一个索引上的元素跟后面的元素依次比较小的放前面，大的放后面，以此类推。
import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int[]arr={3,2,5,4,1};

        int[]排序后数组=选择排序算法(arr);
        System.out.println("最终结果"+Arrays.toString(排序后数组));
    }

    private static int[] 选择排序算法(int[] arr) {
        for (int j = 0; j < arr.length-1; j++) {        //外循环: 几轮
            for (int i = j+1; i < arr.length; i++) {    //内循环: 每一轮我要千什么事情?
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
        return arr;
    }
}
