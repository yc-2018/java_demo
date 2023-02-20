package org.demo.继承和重写;
/*
画图:     从下往上(抽取共性)
写代码:   从上往下

++子类中所有的构造方法默认先访问父类中的无参构造，再执行自己
++为什么?
+++++子类在初始化的时候，有可能会使用到父类中的数据，如果父类没有完成初始化，子类将无法使用父类的数据
+++++子类初始化之前，一定要调用父类构造方法先完成父类数据空间的初始化。
*/

public class 什么是继承 {
        /*
        1、什么是继承、继承的好处?
        继承是面向对象三大特征之一，可以让类跟类之间产生子父的关系
        可以把多个子类中重复的代码抽取到父类中，子类可以直接使用，减少代码几余，提高代码的复用性

        2、继承的格式?
        public class 子类 extends 父类 {}

        3、继承后子类的特点?
        子类可以得到父类的属性和行为，子类可以使用
        子类可以在父类的基础上新增其他功能，子类更强大
        */

//    子类到底能继承父类中的哪些内容?  只有父类中的虚方法才能被子类继承    # 虚方法表：非private 非static 非final
//    构造方法  public 不能   private 不能

//    成员变量  public 能    private 能       （能继承但不能直接用...）

//    成员方法  public 能    private 不能  虚方法表 能  否则不能

     /*
    *lava只支持单继承，不支持多继承，但支持多层继承
    *单继承:一个子类只能继承一个父类
     */



    /*四种动物分别有以下的行为:---------------------------------------------
    布偶猫:吃饭、喝水、抓老鼠
    中国狸花猫:吃饭、喝水、抓老鼠
    哈士奇:吃饭、喝水、看家、拆家
    泰迪:吃饭、喝水、看家、蹭一蹭
    ------------------------------------------------------------------*/
}
