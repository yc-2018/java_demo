package org.demo.常用API;
/*顶级父类中只有无参构造方法
*
*public string toString()            返回对象的字符串表示形式--------一般会重写，打印对象时打印属性
*public boolean equals(object obi)   比较两个对象是否相等-----------比较对象时会重写，比较对象属性值是否相同
*protected Object clone(int a)       对象克隆---------------------默认浅克隆.如果需要深克隆需要重写方法或者使用第三方工具类
*
* */

public class ObjectDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        //细节:
        //System:类名
        //out: 静态变量
        //System.out:获取打印的对象
        //printIn():方法
        //参数:表示打印的内容
        //核心逻辑:
        // 当我们打印一个对象的时候，底层会调用对象的toString方法，把对象变成字符串。
        // 然后再打印在控制台上，打印完毕换行处理。

        //思考: 默认情况下，因为object类中的toString方法返回的是地址值
        // 所以，默认情况下，打印一个对象打印的就是地址值
        // 但是地址值对于我们是没什么意义的?
        //我想要看到对象内部的属性值?我们该怎么办?
        //处理方案: 重写父类object类中的tostring方法******
        Pojo pojo = new Pojo("仰晨", 23, '男', 2023010523);
        System.out.println(pojo);//默认地址值  重写了toString就用里面写的东西了
        System.out.println(pojo.toString());
        //toString方法的结论:
        //如果我们打印一个对象，想要看到属性值的话，那么就重写toString方法就可以了。
        //在重写的方法中，把对象的属性值进行拼接。


//        *********************************************
        Pojo pojo1 = new Pojo("仰晨", 18, '男', 2023010523);
        Pojo pojo2 = new Pojo("仰晨", 18, '男', 2023010523);

        System.out.println(pojo1.equals(pojo2));
        //结论:
        // 1.如果没有重写equals方法，那么默认使用object中的方法进行比较，比较的是地址值是否相等
        // 2.一般来讲地址值对于我们意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值了.


        System.out.println("---克隆默认是浅克隆，深克隆要重写方法或者用第三方api---");
//        **********************************************
           //Cloneable
          //如果一个接口里面没有抽象方法
         //表示当前的接口是一个标记性接口
        // 现在cloneable表示一旦了实现，那么当前类的对象就可以被克隆
       // 如果没有实现，当前类的对象就不能克降

        Pojo lo = new Pojo("yc",11,'n',662);
        Pojo kelo = (Pojo) lo.clone();
        lo.setAge(66);
        lo.setName("仰晨");
        System.out.println(lo);
        System.out.println(kelo);
        System.out.println("基本数据类型改变不会跟着变，字符串在串池的也不会，其他引用数据类型就会发生变化，因为复制的是地址值，而深克隆是把引用数据类型重新创建一个出来，地址值就不一样了  比如数组");

        //2.克降对象
             //细节:
            //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去。
           // 书写细节:
          // 1.重写object中的clone方法
         //  2.让javabean类实现cloneable接口
        //   3.创建原对象并调用clone就可以了。

        //浅克隆
       //不管对象内部的属性是基本数据类型还是引用数据类型，都完全拷贝过来
          // 深克隆
         // 基本数据类型拷贝过来
        // 字符串复用引用
       // 数据类型会重新创建新的
    }

}
