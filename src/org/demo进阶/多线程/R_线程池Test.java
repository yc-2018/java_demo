//仰晨study 创建时间2023/2/9 2:48 星期四
package org.demo进阶.多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class R_线程池Test {
    /*
        public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
        public static ExecutorService newFixedThreadPool (int nThreads) 创建有上限的线程池
    */
    public static void main(String[] args) throws InterruptedException {
        //1.获取线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);

        //2.提交任务
        pool.submit(new MyRun_());
        pool.submit(new MyRun_());
        pool.submit(new MyRun_());
        pool.submit(new MyRun_());
        pool.submit(new MyRun_());

        //3.销毁线程池(正式项目是不会关的 但是这里不关 运行也不会停
        pool.shutdown();


    }
}

class MyRun_ implements Runnable {
//    private final String name;
//    public MyRun_(String name) {
//        Thread.currentThread().setName(name);
//        this.name = name;
//    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---" + (char)(i+64));
        }
    }
}

//↙看之间的数字   3个线程 总共做了50次