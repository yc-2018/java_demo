package org.demo.内部类;

public class Test {
    public static void main(String[] args) {
        例子.Car car = new 例子().new Car();
        car.carName="小电驴";
        car.carColor=66666;
        car.show();

        例子.Car.Engine 发动机 = car.发动机();
        发动机.show();
        发动机.engineAge=66;
        发动机.engineName="牛马牌";
        System.out.println(发动机.engineAge+发动机.engineName);

    }
}
