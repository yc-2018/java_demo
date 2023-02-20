package org.demo.算法.查找;//手动分块....................
/*
*分块的原则1: 前一块中的最大数据，小于后一块中所有的数据(块内无序，块间有序)
*分块的原则2: 块数数量一般等于数字的个数开根号。比如:16个数字一般分为4块左右
*核心思路:先确定要查找的元素在哪一块，然后在块内挨个查找
*
* 如果没办法每个块从小到大  那么就  再定义一个最小值  但是要求每个块不能有交集    然后就把要查找的数字 和每个块的最大 和最小值比较
* *///扩展的分块查找(查找的过程中还需要添加数据 →哈希查找

public class 分块查找 {
    public static void main(String[] args) {
        int[] arr = {16,5,9,12,21,18,
                     32,23,37,26,45,34,
                     50,48,61,52,73,66};
        //创建3个块对象
        块 块1 = new 块(21, 0, 5);
        块 块2 = new 块(37, 6, 11);
        块 块3 = new 块(73, 12, 17);
        //定义数组用来管理三个块的对象(索引表)
        块[] 块arr = {块1, 块2, 块3};
        //调用方法.传递索引表，数组，要查找的元素
        int index = 分块查找算法(块arr,arr,34);
        System.out.println("索引为"+index);

    }

    private static int 分块查找算法(块[] 块arr, int[] arr, int number) {
        int index = -1;
        if (number>块arr[块arr.length-1].get最大值())return index;   //超范围没必要

        for (int i = 0; i < 块arr.length; i++) {
            if (块arr[i].get最大值()>=number){
                index=i;                        //记录的只是第几个对象
                break;
            }
        }
        //在第index个块中 进行基本查找  （二分也行）
        for (int i = 块arr[index].开始索引; i <= 块arr[index].结束索引; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static class 块{
        private int 最大值;
        private int 开始索引;
        private int 结束索引;


        public 块() {
        }

        public 块(int 最大值, int 开始索引, int 结束索引) {
            this.最大值 = 最大值;
            this.开始索引 = 开始索引;
            this.结束索引 = 结束索引;
        }

        /**
         * 获取
         * @return 最大值
         */
        public int get最大值() {
            return 最大值;
        }

        /**
         * 设置
         * @param 最大值
         */
        public void set最大值(int 最大值) {
            this.最大值 = 最大值;
        }

        /**
         * 获取
         * @return 开始索引
         */
        public int get开始索引() {
            return 开始索引;
        }

        /**
         * 设置
         * @param 开始索引
         */
        public void set开始索引(int 开始索引) {
            this.开始索引 = 开始索引;
        }

        /**
         * 获取
         * @return 结束索引
         */
        public int get结束索引() {
            return 结束索引;
        }

        /**
         * 设置
         * @param 结束索引
         */
        public void set结束索引(int 结束索引) {
            this.结束索引 = 结束索引;
        }

        public String toString() {
            return "块{最大值 = " + 最大值 + ", 开始索引 = " + 开始索引 + ", 结束索引 = " + 结束索引 + "}";
        }
    }
}
