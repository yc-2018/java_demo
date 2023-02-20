//仰晨study 创建时间2023/2/8 1:45 星期三
package org.demo进阶.多线程;

public class M_等待醒机制 {//生产者和消费者方式
    /*理解
               吃货————————————————桌子————————————————厨师
            消费者（消费数据）                         生产者（生产数据）
        1、判断桌子上是否有食物                      1、判断桌子上是否有食物
        2、如果没有就等待                           2、有: 等待
        3、如果有就开吃                             3、没有: 制作食物
        4、吃完之后，唤醒厨师继续做                   4、把食物放在桌子上
                                                  5、叫醒等待的消费者开吃

生产者和消费者 (常见方法)————————————————————————————————————————————————
        方法名称                说明
void wait()             当前线程等待，直到被其他线程唤醒
void notify()           随机唤醒单个线程
void notifyAll()        唤醒所有线程（听说一般都用这个 是唤醒跟调用者这把锁绑定的所有线程）
*/
    public static void main(String[] args) {
        //需求:完成生产者和消费者 (等待唤醒机制) 的代码
        //实现线程轮流交替执行的效果

        消费者 foodie = new 消费者();
        厨师 cook = new 厨师();

        foodie.setName("只因—美食家");
        cook.setName("ikun-厨师");

        foodie.start();
        cook.start();

    }
}

class 桌子{//Desk
    //作用:控制生产者和消费者的执行

    //是否有面条 0: 没有面条 1: 有面条      # 用boolean也行 但int还能有扩展性
    public static int FoodFlag = 0;

    //总个数
    public static int count =10;

    //锁对象
    public static final Object lock = new Object();

}

class 消费者 extends Thread {//Foodie
/*1.循环
* 2.同步代码块
* 3.判断共享数据是否到了末尾(到了末尾)
* 4.判断共享数据是否到了末尾(没有到末尾，执行核心逻辑)
* */
    @Override
    public void run() {
        while (true) {
            synchronized (桌子.lock) {
                if (桌子.count == 0) {
                    break;
                }else {
                             //先判断桌子上是否有面条
                    //如果没有，就等待         //如果有，就开吃
                                            //把吃的总数-1
                                            //吃完之后，唤醒厨师继续做
                                            //修改桌子的状态

                    if (桌子.FoodFlag == 0) {
                        try {
                            桌子.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        桌子.count--;
                        System.out.println("吃货在吃面条，还能再吃"+ 桌子.count +"碗!!!");
                        桌子.lock.notifyAll();//唤群跟这把锁绑定的所有线程
                        桌子.FoodFlag=0;
                    }

                }
            }
        }
    }
}

class 厨师 extends Thread{//cook
    /*1.循环
     * 2.同步代码块
     * 3.判断共享数据是否到了末尾(到了末尾)
     * 4.判断共享数据是否到了末尾(没有到末尾，执行核心逻辑)
     * */
    @Override
    public void run() {
        while (true) {
            synchronized (桌子.lock) {
                if (桌子.count == 0) {
                    break;
                }else {
                    //判断桌子上是否有食物
                    if (桌子.FoodFlag == 1) {
                        //如果有，就等待
                        try {
                            桌子.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else {
                        //如果没有，就制作食物
                        System.out.println("厨师做了一碗面条");
                        //修改桌子上的食物状态
                        桌子.FoodFlag=1;
                        //叫醒等待的消费者开吃
                        桌子.lock.notifyAll();

                    }
                }
            }
        }

    }
}