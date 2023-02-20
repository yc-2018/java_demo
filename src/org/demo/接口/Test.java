package org.demo.接口;

public class Test {
    public static void main(String[] args) {
        C乒乓球运动员 许昕 = new C乒乓球运动员("许昕",18);
        许昕.学英语();
        许昕.学习();
        C乒乓球教练 胖子 = new C乒乓球教练("胖子", 36);
        胖子.学英语();
        胖子.教();

        C篮球教练 小黑子 = new C篮球教练("小黑子", 99);
        小黑子.教();
        System.out.println(小黑子.getName()+小黑子.getAge());

        C篮球运动员 坤坤 = new C篮球运动员("坤坤", 108);
        坤坤.学习();

        System.out.println("-----------------------------");
        B说英语.接口静态方法();
        B说英语.接口静态方法();

        胖子.接口默认方法();
        许昕.接口默认方法();
    }
}
