package org.demo.抽象类和抽象方法;

public class DDDtest {
    public static void main(String[] args) {
        CCC山羊 山羊 = new CCC山羊();
        山羊.setAge(5);
        山羊.setName("不喜洋洋");
        山羊.吃();
        山羊.喝水();
        System.out.println("------------------------");
        CCC山羊 悲羊羊 = new CCC山羊("悲羊羊", 55);
        悲羊羊.喝水();
        悲羊羊.吃();

        System.out.println("------------------------");


        CCC狗 小黑子 = new CCC狗("小黑子", 6);
        小黑子.吃();

        System.out.println("------------------------");

        CCC青蛙 青蛙 = new CCC青蛙();
        青蛙.吃();
        青蛙.喝水();
    }
}
