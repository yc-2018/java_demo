package org.demo.算法.查找;
// 前提条件:数组中的数据必须是有序的
// 核心逻辑: 每次排除一半的查找范围
public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {11, 23, 24, 33, 45, 67, 89, 109, 222, 231};
        int index = 二分查找算法(arr, 33);
        System.out.println("索引为"+index);
    }

    private static int 二分查找算法(int[] arr, int number) {
        //先定义2个变量记录查询的范围
        int min =0;
        int max = arr.length-1;

        //循环截半去找
        while (true) {
            if (min > max) {
                return -1;
            }
            //找到中间位置
            int mid = (max+min)/2;
            //拿着mid去比较
            if (arr[mid] == number) {
                return mid;             //找到  返回
            } else if (arr[mid]>number) {
                max=mid-1;              //说明目标mid不在右边
            } else if (arr[mid] < number) {
                min=mid+1;              //说明目标mid不在左边
            }
            System.out.println("看看我循环多少次");
        }
    }
}


/*
1.二分查找的优势?
提前查找效率
2.二分查找的前提条件?
数据必须是有序的
如果数据是乱的，先排序再用二分查找得到的索引没有实际意义，只能确定当前数字在数组中是否存在，因为排序之后数字的位置就可能发生变化了
3.二分查找的过程
min和max表示当前要查找的范围
mid是在min和max中间的
如果要查找的元素在mid的左边，缩小范围时，min不变，max等于mid减1
如果要查找的元素在mid的右边，缩小范围时max不变，min等于mid加1*/