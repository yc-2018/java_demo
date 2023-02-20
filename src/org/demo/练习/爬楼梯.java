package org.demo.练习;

public abstract class 爬楼梯 {
    /*
    可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
    如果这个楼梯有20个台阶，小明一共有多少种爬法呢?

    运算结果:
    1层台阶 1种爬法
    2层台阶 2种爬法
    3层台阶 3种爬法  = 1个台阶的爬法+2个台阶的爬法
    4层台阶 5种爬法  = 2个台阶的爬法+3个台阶的爬法
    7层台阶 21种爬法

    20个台阶的爬法 = 19个台阶的爬法+18个台阶的爬法
    */
    public static void main(String[] args) {
        System.out.println(getCount(20));   //写100 当场原地挂机  40阶就很极限了
    }

    //斐波那契数列
    private static int getCount(int n) {
        if (n==1)return 1;
        if (n==2)return 2;
        return getCount(n-1)+getCount(n-2);
    }
}

//扩展  如果 他有的时候一次爬一个台阶，有的时候一次爬两个台阶   还有的时候爬3阶    如果这个楼梯有20个台阶，小明一共有多少种爬法呢?(注意：阶为3的时候就有4种方法了
