//仰晨study 创建时间2023/2/9 3:16 星期四
package org.demo进阶.多线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class S_线程池Test1 {
    /*
        public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
        public static ExecutorService newFixedThreadPool (int nThreads) 创建有上限的线程池
    */
    public static void main(String[] args) throws InterruptedException {
        //1.获取线程池对象
        ExecutorService pool = Executors.newCachedThreadPool();

        //2.提交任务
        pool.submit(new MyRun_());
        Thread.sleep(1000);     //实验目的是让上面的线程执行完  看看下面的会用到那个线程
        pool.submit(new MyRun_());
        Thread.sleep(1000);
        pool.submit(new MyRun_());
        Thread.sleep(1000);
        pool.submit(new MyRun_());
        Thread.sleep(1000);
        pool.submit(new MyRun_());

        //3.销毁线程池(正式项目是不会关的 但是这里不关 运行也不会停
        pool.shutdown();
    }
}
//不睡觉的话 会自动创建5个线程

//睡觉的话只会创建一个线程 因为线程执行完就可以复用了