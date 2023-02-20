//仰晨study 创建时间2023/2/6 3:09 星期一
package org.demo进阶.多线程;/*
多线程的第三种实现方式:
                    特点:可以获取到多线程运行的结果

                    1.创建一个类MyCallable实现Callable接口
                    2.重写call (是有返回值的，表示多线程运行的结果)

                    3.创建MyCallable的对象 (表示多线程要执行的任务)
                    4.创建FutureTask的对象(作用管理多线程运行的结果)
                    5.创建Thread类的对象，并启动 (表示线程)
*/

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class C_利用Callable {//利用Callable接口和Future接口方式实现

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建MyCallable的对象 (表示多线程要执行的任务)
        MyCallable mc = new MyCallable();
        //创建FutureTask的对象(作用管理多线程运行的结果)
        FutureTask<Integer> ft = new FutureTask<>(mc);
        //创建线程的对象
        Thread t1 = new Thread(ft);
        //启动线程
        t1.start();

        //获取多线程运行的结果
        Integer result = ft.get();
        System.out.println(result);
    }
}

class MyCallable implements Callable {

    @Override
    public Object call() throws Exception {
        int sum =0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}