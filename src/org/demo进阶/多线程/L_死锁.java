//仰晨study 创建时间2023/2/7 18:43 星期二
package org.demo进阶.多线程;

public class L_死锁 {//死锁不是知识点   而是错误   以后要避免这样的错误
    /*例子
    *有一对男女在吃饭   但是  只有一双筷子🥢
    *
    * 限制条件
    * ①每次需要拿起2根筷子才能吃饭
    * ②一次只能拿一只筷子
    * 3️⃣拿到一双筷子后可以吃一口 然后重新放下筷子 重新抢
    *
    * ————————理想情况：男/女的先拿到一根 然后又拿到另一根
    * ————————可能情况：男的拿到一根  女的拿到另一根  双方都在等待放下筷子   就出现了死锁
    *
    * 两根筷子就相当于两把不同的锁    所以以后要避免 锁的嵌套
    * */

    public static void main(String[] args) {
        My_Thread t1 = new My_Thread();
        My_Thread t2 = new My_Thread();

        t1.setName("线程A");
        t2.setName("线程B");

        t1.start();
        t2.start();
    }

}


class My_Thread extends Thread{
    static final Object objA = new Object();
    static final Object objB = new Object();

    @Override
    public void run() {
        //while (true) {
            if ("线程A".equals(getName())) {
                synchronized (objA) {
                    System.out.println("线程A拿到了A锁，准备拿B锁");
                    synchronized (objB) {
                        System.out.println("线程A拿到了B锁，顺利执行完一轮");
                    }
                }
            } else if ("线程B".equals(getName())) {
                synchronized (objB) {
                    System.out.println("线程B拿到了B锁，准备拿A锁");
                    synchronized (objA) {
                        System.out.println("线程B拿到了A锁，顺利执行完一轮");
                    }
                }
            }
        //}
    }
}