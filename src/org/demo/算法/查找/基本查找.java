package org.demo.算法.查找;

import java.util.ArrayList;

//无序可用，缺点查询时间长
public class 基本查找 {
    public static void main(String[] args) {
        int[] arr ={2,5,54,76,34,12,97,45,4,32,60,54};

        //基本查找  并返回索引
        int index = 基本查找(arr, 54);
        System.out.println(index);

        ArrayList<Integer> indexs = 基本查找_重复(arr, 54);
        System.out.println(indexs);

    }

    //不考虑存在重复
    private static int 基本查找(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                return i;
            }
        }
        return -1;
    }

    //考虑存在重复
    private static ArrayList<Integer> 基本查找_重复(int[] arr, int s) {
        ArrayList<Integer> indexs = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == s) {
                indexs.add(i);
            }
        }
        return indexs;
    }
}
