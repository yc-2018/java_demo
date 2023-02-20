package org.demo.常用API;

public class 质数练习 {
    public static void main(String[] args) {
        long 开始时间 = System.currentTimeMillis();
        System.out.println(是否质数(10000));
        long 结束时间 = System.currentTimeMillis();
        System.out.println("总共花费毫秒："+(结束时间-开始时间));
    }

    public static boolean 是否质数(int number){
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if(number%i==0){
                return false;
            }
            System.out.println(i-1);
        }
        return true;
    }
}
