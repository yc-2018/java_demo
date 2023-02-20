//仰晨study 创建时间2023/2/6 2:23 星期一
package org.demo进阶.多线程;

public interface  啥多线程 {
    //线程是操作系统能够进行运算调度的最小单位。它被包含在进程之中，是进程中的实际运作单位。

    //多线程简单理解:应用软件中互相独立，可以同时运行的功能

    /*多线程的应用场景
    *
    *软件中的耗时操作       拷贝、迁移大文件        加载大量的资源文件
    *所有的聊天软件
    *所有的后台服务器
    * */

    /*总结*********************************************
    *1.什么是多线程?
        有了多线程，我们就可以让程序同时做多件事情
    *
    *2.多线程的作用?
        提高效率
    *
    *3.多线程的应用场景?
        只要你想让多个事情同时运行就需要用到多线程
        比如: 软件中的耗时操作、所有的聊天软件、所有的服务器
    *
    ************************************************** *//*
    并发和并行
        并发:在同一时刻，有多个指令在单个CPU上交替执行
        并行:在同一时刻，有多个指令在多个CPU上同时执行

多线程的实现方式
    1、继承Thread类的方式进行实现
    2、实现Runnable接口的方式进行实现
    3、利用Callable接口和Future接口方式实现

多线程三种实现方式对比
                            优点                                              缺点
继承Thread类             编程比较简单，可以直接使用Thread类中的方法      可以扩展性较差 不能再继承其他的类
实现Runnable接口———————↘
实现Callable接口↘      → 扩展性强，实现该接口的同时还可以继承其他的类     编程相对复杂，不能直接使用Thread类中的方法
                有返回结果


 —————————————————————常见的成员方法——————————————————————————
        方法名称                            说明
string getName()                    返回此线程的名称

void setName(string name)           设置线程的名字(构造方法也可以设置名字 如果是自己写的 这个构造方法要继承Thread（自己写super）)
                                    细节:
                                        1、如果我们没有给线程设置名字，线程也是有默认的名字的
                                                格式: Thread-X (X序号，从e开始的)
                                        2、如果我们要给线程设置名字，可以用set方法进行设置，也可以构造方法设置

staticThread currentThread()        获取当前线程的对象
                                    细节:
                                        当JVM虚拟机启动之后，会自动的启动多条线程
                                        其中有一条线程就叫做main线程
                                        他的作用就是去调用main方法，并执行里面的代码
                                        在以前，我们写的所有的代码，其实都是运行在main线程当中
static void sleep(long time)        让线程休眠指定的时间，单位为毫秒
                                    细节:
                                         1、哪条线程执行到这个方法，那么哪条线程就会在这里停留对应的时间
                                         2、方法的参数:就表示睡眠的时间，单位毫秒
                                         3、当时间到了之后，线程会自动的醒来，继续执行下面的其他代码
setPriority(int newPriority)        设置线程的优先级
                                    注意：优先级高也不一定最快完成也是有小概率最后完成的

final int getPriority()             获取线程的优先级

final void setDaemon(boolean on)    设置为守护线程
                                    细节:
                                        当其他的非守护线程执行完毕之后，守护线程会陆续结束
                                    通俗易懂:
                                            当女神线程结束了，那么备胎也没有存在的必要了

public static void yield()          出让线程/礼让线程
                                    细节:
                                        “我”让出去 重新抢  有可能又是“我”抢到      主要目的是让线程比较均匀执行

public static void join()           插入线程/插队线程
                                    细节:
                                         顺序不能乱  要在start后面写
 ———————————————————————————————————————————————————————————
                  /
                /
              /
    |    |    |    |     |
    |    |    |    |     |
    |    |    |    |     |

抢占式调度(java)           非抢占式调度














    */
    static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        System.out.println("5秒后下一条");
        Thread.sleep(5000);
        System.out.println("睡了5000毫秒");                                 //结果是 都不动

        //————————————————————————————————————————————————————————————————

        Thread ikun = new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                /*if (i == 9) {
                    System.out.println("ikun要睡觉10秒  看看别人   动不动");   //结果是 动完了
                    try {
                        Thread.sleep(3000L);
                        System.out.println("99999999999999999999999999"+Thread.currentThread().getName());
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else*/
                    System.out.println(Thread.currentThread().getName() + i);
            }
        }, "ikun");

        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
            System.out.println("___——————___");
            if (i==55) {
                try {
                    System.out.println("555555555555555555555555555555555"+Thread.currentThread().getName());
                    Thread.sleep(5000L);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            }
        },"苏珊");

        ikun.start();
        thread.start();

        System.out.println("规律到让人有点无语");
    }
}
