package org.demo.练习;

public abstract class 猴子吃桃子 {
    /*有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!
    以后每天猴子都吃当前剩下来的一半，然后再多吃一个，
    第10天的时候(还没吃)，发现只剩下一个桃子了，
    请问，最初总共多少个桃子?

        day10:  1
        day9:   (day10 + 1) *2 =4
        day8：  (day9 + 1)*2  = 10
        .....
        */

    public static void main(String[] args) {
    int reult = method(1);
        System.out.println(reult);

        int count=1;
        for (int i = 9; i >= 1; i--) {
            count=(count+1)*2;
        }
        System.out.println(count);
    }
    private static int method(int day) {
        if (day<0||day>10)return -1;        //错误输入
        if (day==10)return 1;               //递归出口
        return (method(day+1)+1)*2;     //规律：每一天的桃子都是后一天的桃子数量+1再*2
    }
}
