//仰晨study 创建时间2023/2/11 16:13 星期六
package org.demo进阶.反射;

public interface 啥反射 {/*
什么是反射?
    反射允许对成员变量，成员方法和构造方法的信息进行编程访问

             类
        获取class对象                       解剖

        字段(成员变量)     ————获取修饰符、获取名字、获取类型、赋值/获取值
          构造方法        ————获取修饰符、获取名字、获取形参、创建对象
          成员方法        ————获取修饰符、获取名字、获取形参、获取返回值、抛出的异常、获取注解、运行方法

在java中万物皆对象  所以上面的也有对应的对象
获取class对象       Class
构造方法            Constructor
字段(成员变量)       Field
成员方法            Method

——————————————————————————反射都能拿到  不管你是public还是private

                            ——————IDEA的代码提示功能用的就是反射

————————————————————————————————————————————————————————————————————————————————————————————————————
获取class对象的三种方式
    1、class.forName("全类名");         //源代码阶段     --最为常用的
    2、类名.class                      //加载阶段       --一般更多的是当做参数进行传递
    3、对象.getClass();               //运行阶段        --当我们已经有了这个类的对象时，才可以使用。


反射的作用
1、获取一个类里面所有的信息，获取到了之后，再执行其他的业务逻辑
2、结合配置文件，动态的创建对象并调用方法


    java.lang.reflect.Modifier 常量字段值
 public static final int ABSTRACT       1024
 public static final int FINAL          16
 public static final int INTERFACE      512
 public static final int NATIVE         256
 public static final int PRIVATE        2
 public static final int PROTECTED      4
 public static final int PUBLIC         1
 public static final int STATIC         8
 public static final int STRICT         2048
 public static final int SYNCHRONIZED   32
 public static final int TRANSIENT      128
 public static final int VOLATILE       64

————————————————总结——————————————————————————
1.反射的作用
 ·获取任意一个类中的所有信息
 ·结合配置文件动态创建对象

2.获得class字节码文件对象的三种方式
 ·class.forName("全类名");
 ·类名.class
 ·对象.getClass();

3.如何获取构造方法、成员方法、成员变量
    get: 获取                     set:设置
    Constructor: 构造方法          Parameter:参数
    Field: 成员变量                Modifiers: 修饰符
    Method: 方法                  Declared: 私有的
*/

}
