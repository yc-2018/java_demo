package org.demo进阶.泛型;/*
泛型:是JDK5中引入的特性，可以在编译阶段约束操作的数据类型，并进行检查。
泛型的格式:<数据类型>
注意:泛型只能支持引用数据类型。*/

//结论:
//如果我们没有给集合指定类型，默认认为所有的数据类型都是object类型
//此时可以往集合添加任意的数据类型。
//带来一个坏处:我们在获取数据的时候，无法使用他的特有行为。

//此时推出了泛型，可以在添加数据的时候就把类型进行统一。
//而且我们在获取数据的时候，也省的强转了，非常的方便。


//泛型的好处
    //统一数据类型
    //把运行时期的问题提前到了编译期间，避免了强制类型转换可能出现的异常，因为在编译阶段类型就能确定下来。

//扩展知识点: Java中的泛型是伪泛型   Java文件————>泛型的擦除————>class文件

public interface 泛型概述 {
    //泛型的细节
        //泛型中不能写基本数据类型
        //指定泛型的具体类型后，传递数据时，可以传入该类类型或者其子类类型
        //如果不写泛型，类型默认是Object

    /*  泛型可以在很多地方进行定义                                                       创建该类对象时，E就确定类型
    类后面          泛型类        修饰符 class 类名<类型>{}                      举例 public class ArrayList <E> {}
    方法上面        泛型方法       修饰符 <类型> 返回值类型 方法名(<类型> 类型名){}       public <T> void show(T t){}
    接口后面        泛型接口       修饰符 interface 接口名<类型>{}                     public interface List<E> {}
                    重点: 如何使用一个带泛型的接口
                            方式1:实现类给出具体类型
                            方式2:实现类延续泛型，创建对象时再确定

    此处E可以理解为变量，但是不是用来记录数据的，而是记录数据的类型，可以写成:T、E、K、V等
*/
}
/*泛型的继承和通配符
    泛型不具备继承性，但是数据具备继承性
    泛型的通配符:?
    ? extend E
    ? super E

    使用场景
        定义类、方法、接口的时候，如果类型不确定，就可以定义泛型
        如果类型不确定，但是能知道是哪个继承体系中的，可以使用泛型的通配符
*/