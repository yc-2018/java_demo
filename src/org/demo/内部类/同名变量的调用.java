package org.demo.内部类;

public class 同名变量的调用 {
    private int a = 10;

    class nei{
        private int a = 20;

        public void show(){
            int a =30;
            System.out.println(a); //30
            System.out.println(this.a); //20
            System.out.println(同名变量的调用.this.a); //10

        }
    }
}
