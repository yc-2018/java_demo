//仰晨study 创建时间2023/2/8 18:11 星期三
package org.demo进阶.多线程;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class P_练习3_奇数 {
    /*(学生自己练习 )
        同时开启两个线程，共同获取1-100之间的所有数字
        要求:将输出所有的奇数
    */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        getNumber call = new getNumber();
        FutureTask<Integer[]> ft = new FutureTask<>(call);
        Thread t1 = new Thread(ft);
        Thread t2 = new Thread(ft);
        t1.start();
        t2.start();

        Arrays.stream(ft.get()).filter(n->n%2!=0).forEach(System.out::print);
    }
}

class getNumber implements Callable {
    private Integer[] array = new Integer[100];
    private int count = 1;

    @Override
    public Object call() {
        while (true) {
            Thread.yield();
            synchronized (getNumber.class) {
                if (count > 100) {
                    break;
                } else {
                    array[count-1]=count++;
                    //System.out.println(Thread.currentThread().getName());
                }
            }
        }
        return array;
    }
}

//————————————老师代码————————————————————————————————————
/*
public class MyRunable implements Runnable {

    //第二种方式实现多线程，测试类中MyRunable只创建一次，所以不需要加static
    int number = 1;

    @Override
    public void run() {
        //1.循环
        while (true) {
            //2.同步代码块
            synchronized (MyThread.class) {
                //3.判断共享数据（已经到末尾）
                if (number > 100) {
                    break;
                } else {
                    //4.判断共享数据（没有到末尾）
                    if(number % 2 == 1){
                        System.out.println(Thread.currentThread().getName() + "打印数字" + number);
                    }
                    number++;
                }
            }
        }
    }
}
*/