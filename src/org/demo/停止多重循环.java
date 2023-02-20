package org.demo;

public class 停止多重循环 {
    public static void main(String[] args) {
       hhh: for (int i=0; i<10 ;i++){           // 一般不用hhh  一般用loop
           System.out.println(i);
               for (int a=0;a!=10;a++){
                   System.out.println("小黑子");
                   if (a==2){
                       System.out.println("直接停止");
                       //System.exit(0);              //方法1  停止虚拟机运行  相当于吧窗口都关了
                       break hhh;                     //方法2
                   }
               }
       }
    }
}
