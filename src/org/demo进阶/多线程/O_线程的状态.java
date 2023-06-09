//仰晨study 创建时间2023/2/8 3:08 星期三
package org.demo进阶.多线程;

public interface  O_线程的状态 {/*多线程的6种状态

                            __获得到锁____没有执行资格____无法获取锁
                            |            没有执行权          |
                            |           ****阻塞****        |
                            |                              |
                            |                              |
                            |                              |
                            _notify()____没有执行资格____wait()
                            |            没有执行权          |
                            |           ****等待****        |
                            |                              |
                            |                              |
                            _到时间了____没有执行资格____sleep(10)
                            |            没有执行权          |
                            |          ***计时等待***        |
                            |                              |
                            |                              |       run()
                            ↓    其他线程抢走CPU的执行权      |       执行完毕
                       有执行资格<—————————————————————  有执行资格————————————>线程死亡
创建线程对象——————————>  没有执行权——————————————————————> 有执行权               变成垃圾
           start()                  抢到CPU的执行权

    新建                就绪                              运行                   死亡
                    不停的抢CPU                    （这个状态java是没有定义的）
                                                   因为运行是线程就交给CPU了
                                                   就像你丢了一台手机
                                                   那你还管他是没电了 还是进水了

————————————————线程的状态————————————————
新建状态 (NEW)              创建线程对象
就绪状态(RUNNABLE)          start方法
阻塞状态(BLOCKED)           无法获得锁对象
等待状态(WAITING)           wait方法
计时等待 (TIMED WAITING)    sleep方法
结束状态(TERMINATED)        全部代码运行完毕
——————————————————————————————————————————
*/
}
