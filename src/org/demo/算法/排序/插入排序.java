package org.demo.算法.排序;
// 插入排序:将0索引的元素到N索引的元素看做是有序的，把N+1 索引的元素到最后一个当成是无序的。
// 遍历无序的数据，将遍历到的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
// N的范围:0~最大索引
import java.util.Arrays;

public class 插入排序 {
    public static void main(String[] args) {
        int[]arr={3,4,5,2,1};
        int[]arrr={3,4,5,2,1};

        插入排序垃圾算法(arr);
        System.out.println("垃圾算法最终结果"+ Arrays.toString(arr));

        System.out.println("----------------------------------------");

        插入排序老师算法(arrr);
        System.out.println("老师算法最终结果"+ Arrays.toString(arrr));
    }

    private static int[] 插入排序老师算法(int[] arr) {
        //找到无序的哪一组数组是从哪个索引开始的。可选-----有序 时间复杂度少的原因
        int startIndex = -1;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                startIndex=i+1;
                break;
            }
        }
        //遍历从startIndex开始到最后一个元素，依次得到无序的哪一组数据中的每一个元系

        for (int i = startIndex; i < arr.length; i++) {
            //问题: 如何把遍历到的数据，插入到前面有序的这一组当中

            //记录当前要插入数据的索引
            int j =i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int itmp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = itmp;
                j--;
            }
            System.out.println("中间结果"+ Arrays.toString(arr));
        }
        return arr;
    }


    //妈的0点写到2点 不知道写的什么牛马
    private static int[] 插入排序垃圾算法(int[] arr) {
        int count=0;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j <=count; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                if (count< arr.length-1)count++;
            }
            System.out.println("中间结果"+ Arrays.toString(arr));
        }
        return arr;
    }
}
