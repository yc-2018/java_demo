//仰晨study 创建时间2023/2/16 14:27 星期四
package org.demo进阶.test;

import static org.demo进阶.test.测试一道选择题.Root.chmod;

public class 测试一道选择题 {
    private int pid;



    public 测试一道选择题(int pid) {
        this.pid = pid;
    }

    /**
     * 获取
     * @return pid
     */
    public int getPid() {
        return pid;
    }

    /**
     * 设置
     * @param pid
     */
    public void setPid(int pid) {
        this.pid = pid;
    }

    public class Root {
        static 测试一道选择题 chmod(测试一道选择题 测试) {
            System.out.println(测试);//@568db2f2
            测试 = new 测试一道选择题(1);    //这里地址发送改变  和原来的地址相互区别了
            System.out.println(测试);//@5fd0d5ae
            return 测试;
        }
    }

    public static void main(String[] args) {
        测试一道选择题 sudo = new 测试一道选择题(0);
        System.out.println(sudo);//@568db2f2
        System.out.println(sudo.getPid());
        测试一道选择题 sudo2 = chmod(sudo);
        System.out.println("地址发生改变？"+sudo);
        System.out.println(sudo.getPid());
        System.out.println(sudo2.getPid());
        sudo= chmod(sudo2);
        System.out.println(sudo.getPid());
        System.out.println(sudo2.getPid());
    }

}
