//仰晨study 创建时间2023/2/9 2:31 星期四
package org.demo进阶.多线程;

public interface  Q_线程池 {/*
吃饭买碗的故事***********
小A同学    买了个碗    盛饭吃    吃完把碗砸了-------这就是前面的多线程干的事情

弊端1:每次都要买碗，浪费时间     弊端2:每次吃完都把碗摔了，浪费资源
————————————————以前写多线程的弊端————————————————————
弊端1:用到线程的时候就创建      弊端2:用完之后线程消失


—————————————————线程池主要核心原理———————————————————
1、创建一个池子，池子中是空的

2、提交任务时，池子会创建新的线程对象，任务执行完毕，线程归还给池子
   下回再次提交任务时，不需要创建新的线程，直接复用已有的线程即可

3、但是如果提交任务时，池子中没有空闲线程，也无法创建新的线程，任务就会排队等待
————————————————线程池代码实现——————————————————————
1，创建线程池
2，提交任务
3，所有的任务全部执行完毕，关闭线程池（一般项目里面是不会关的 就像你24小时都能访问百度一样）


Executors:线程池的工具类通过调用方法返回不同类型的线程池对象
                    方法名称                                                说明
public static ExecutorService newCachedThreadPool()                 创建一个没有上限的线程池
public static ExecutorService newFixedThreadPool(int nThreads)      创建有上限的线程池

————————————————————————————————————————————————————————————————————————————————————
饭店的故事***********
核心元素一:正式员工数量————————————————————————————————————核心线程数量               (不能小于0)
核心元素二:餐厅最大员工数——————————————————————————————————线程池中最大线程的数量       (最大数量 >= 核心线程数量)                          （最大-正式=临时）
核心元素三:临时员工空闲多长时间被辞退(值)————————————————————空闲时间(值)                (不能小于0)
核心元素四:临时员工空闲多长时间被辞退 (单位)——————————————————空闲时间(单位)              (用TimeUnit指定)
核心元素五:排队的客户 ————————————————————————————————————阻塞队列                    (不能为null)
核心元素六:从哪里招人 ————————————————————————————————————创建线程的方式               (不能为null)
核心元素七:当排队人数过多，超出顾客请下次再来 (拒绝服务) ——————要执行的任务过多时的解决方案    (不能为null)


自定义线程池
设           核心线程3   临时线程:3  队伍长度:3
提交10个任务 123到核心   456要排队   789创建临时线程执行   10↓触发任务拒绝策的↓

自定义线程池(任务拒绝策略)                  说明
ThreadPoolExecutor.AbortPolicy                  默认策略: 丢弃任务并抛出RejectedExecutionException异常
ThreadPoolExecutor.DiscardPolicy                丢弃任务，但是不抛出异常 这是不推荐的做法
ThreadPoolExecutor.DiscardOldestPolicy          抛弃队列中等待最久的任务 然后把当前任务加入队列中 （把排队在第一位的给扔了 然后排队）
ThreadPoolExecutor.CallerRunsPolicy             调用任务的run()方法绕过线程池直接执行








*/

}
