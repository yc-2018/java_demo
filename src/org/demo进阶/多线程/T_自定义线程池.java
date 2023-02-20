//仰晨study 创建时间2023/2/9 4:52 星期四
package org.demo进阶.多线程;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class T_自定义线程池 {
    public static void main(String[] args){

    /*
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
        核心线程数量,最大线程数量,空闲线程最大存活时间,任务队列,创建线程工厂,任务的拒绝策略);

        参数一：核心线程数量              不能小于0
        参数二：最大线程数                不能小于0，最大数量 >= 核心线程数量
        参数三：空闲线程最大存活时间       不能小于0
        参数四：时间单位                  用TimeUnit指定
        参数五：任务队列                  不能为null
        参数六：创建线程工厂              不能为null
        参数七：任务的拒绝策略             不能为null
    */

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,
                6,
                60,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        pool.submit(new MyRun_());

        pool.shutdown();


        System.out.println("向Java虚拟机返回可用处理器的数目:"+Runtime.getRuntime().availableProcessors());   //8
    }
}
/*自定义线程池小结
*1、创建一个空的池子
*2、有任务提交时，线程池会创建线程去执行任务，执行完毕归还线程
*
*——不断的提交任务，会有以下三个临界点:
*1、当核心线程满时，再提交任务就会排队
*2、当核心线程满，队伍满时，会创建临时线程
*3、当核心线程满，队伍满，临时线程满时，会触发任务拒绝策略
*
*
*********************
*线程池多大合适呢?
*CPU 密集型运算    最大并行数 + 1     （如果有那条神经了  就可以马上补上）
*
*                                         总时间(CPU计算时间+等待时间)
*I/O 密集型运算    最大并行数*期望 CPU 利用率*——————————————————————
*                                             CPU计算时间
*
*                           100%————————————————>举例: 从本地文件中，读取两个数据，并进行相加
* ↑举例4核8线程↑   8*100% * ———————— =16                 操作一:读取两个数据(1秒钟)  > 等待 和CPU无关
*                            50%                        操作二:相加 (1秒钟)       > cpu
*
*           CPU计算时间 和 等待时间 通过工具类 thread dump 测试
*====================
* 什么是最大并行数?
* 4核8线程     超线程技术
* 最大并行数
* */