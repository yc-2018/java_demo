package org.demo.内部类;

public class 例子 {
    //需求:写一个avabean类描述汽车
    //属性:汽车的品牌，车龄，颜色，发动机的品牌，使用年限
    public class Car {
        String carName;
        int carAge;
        int carColor;
        public void show(){
            System.out.println("车类");
        }
        public Engine 发动机(){
            return new Engine();
        }

        class Engine {  // 发动机可以独立于汽车存在  但独立存在的他又没有意义  所以写成内部类
            String engineName;
            int engineAge;
            public void show(){
                System.out.println("发动机类");
            }
        }
    }
}
