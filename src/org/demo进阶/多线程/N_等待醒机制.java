//仰晨study 创建时间2023/2/8 2:33 星期三
package org.demo进阶.多线程;

import java.util.concurrent.ArrayBlockingQueue;

public class N_等待醒机制 {//阻塞队列方式实现—更像流水线—————————————————————————————————————————
    /*
    *   take                         put
    * 吃货 ---面-----面-----面--面-------厨师
    *
    *put数据时: 放不进去，会等着，也叫做阻塞。
    *take数据时: 取出第一个数据，取不到会等着，也叫做阻塞。

阻塞队列的继承结构             _______
                    Iterable        \
                    Collection —————— \
                    Queue      ———————— \
                    BlockingQueue   --------------------------------接口

            ArrayBlockingQueue          LinkedBlockingQueue         实现类
                底层是数组，有界                底层是链表，无界
                                              但不是真正的无界
                                              最大为int的最大值


    * */
    public static void main(String[] args) {
        /*
        * 需求:利用阻寒队列完成生产者和消费者《等待唤醒机制) 的代码
        *细节:
        *    生产者和消费者必须使用同一个阻塞队列
        * */



        //1.创建阻塞队列的对象
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

        //2.创建线程的对象，并把阻塞队列传递过去----一定是要同一个队列
        Cook c = new Cook(queue);
        Foodie f = new Foodie(queue);

        //3.开启线程
        c.start();
        f.start();
        //——————————————————无限循环 要自己点停————————————————
        //因为 锁在queue.方法的里面  所以打印语句是在锁外面的所以打印不正常  但不影响数据的正确性
    }

}

class Cook extends Thread {
    ArrayBlockingQueue<String> queue;

    public Cook(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        //不断的把面条放到阻塞队列当中
        while (true) {
            try {
                queue.put("面条");
                System.out.println("厨师放了一碗面条🍜");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


class Foodie extends Thread {
    ArrayBlockingQueue<String> queue;

    public Foodie(ArrayBlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            //不断从阻塞队列中获取面条
            try {
                String food = queue.take();
                System.out.println(food);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}