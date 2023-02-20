package org.demo进阶.泛型;

import java.util.ArrayList;
//希望: 本方法虽然不确定类型，但是以后我希望只能传递Ye Fu zi

//此时我们就可以使用泛型的通配符:
    //?也表示不确定的类型
    //他可以进行类型的限定
    //? extends E: 表示可以传递E或者E所有的子类类型
    //? super E:表示可以传递E或者E所有的父类类型

/*应用场景:
        1.如果我们在定义类、方法、接口的时候，如果类型不确定，就可以定义泛型类、泛型方法、泛型接口。
        2.如果类型不确定，但是能知道以后只能传递某个继承体系中的，就可以泛型的通配符
 泛型的通配符:
        关键点: 可以限定类型的范围。
*/

public class 泛型的通配符 {
    public static void main(String[] args) {
        //泛型不具备继承性，但是数据具备继承性
        ArrayList<Ye> list1 = new ArrayList<>();
        ArrayList<Fu> list2 = new ArrayList<>();
        ArrayList<Zi> list3 = new ArrayList<>();
        ArrayList<Ikun> list4 = new ArrayList<>();
        Ikun ikun = new Ikun();

        method(list1);
        method(list2);
        method(list3);
      //method(list4);  //Ikun就被限制了

        list1.add(new Fu());    //但是数据具备继承性
        list1.add(new Zi());
        list1.add(new Ye());
      //list1.add(new Ikun());
    }

  //private static void method(ArrayList<Ye> list) {    }                //只有Ye类能用该方法 他可不管你的父子
  //private static <E> void method(ArrayList<E> list) {    }            //所有类都能用 连Ikun类都能用 没有限制
    private static void method(ArrayList<? extends Ye> list) {    }    //只要是Ye类或者Ye类的子类才能用此方法
  //private static void method(ArrayList<? super Ye> list) {    }     //只要是Ye类或者Ye类的父类才能用此方法
}
/*不想写 练习-----------------------------
*定义一个继承结构:动物
*              /   \
*           /         \
*       猫             狗
*      / \            / \
*  波斯猫 狸花猫     泰迪   哈士奇
*
* 属性:名字，年龄
* 行为:吃东西
* 波斯猫方法体打印:一只叫做XXX的，X岁的波斯猫，正在吃小饼干
* 狸花猫方法体打印: 一只叫做XXX的，X岁的狸花猫，正在吃鱼
* 泰迪方法体打印:一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭哈
* 士奇方法体打印: 一只叫做XXX的,X岁的哈士奇，正在吃骨头，边吃边拆家
*
*测试类中定义一个方法用于饲养动物
*public static void keepPet(ArrayList<???> list){
*   遍历集合，调用动物的eat方法
*}
*
* 要求1: 该方法能养所有品种的猫，但是不能养狗
* 要求2: 该方法能养所有品种的狗，但是不能养猫
* 要求3: 该方法能养所有的动物，但是不能传递其他类型
 * */



class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}

class Ikun{static {System.out.println("你干嘛，哎呦");} }