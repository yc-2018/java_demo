package org.demo;

public class 什么是权限修饰符 {
    //权限修饰符的分类
    //有四种作用范围由小到大 ( private < 空着不写 < protected < public )
    //修饰符       同一 个类中      同一个包中其他类    不同包下的子类     不同包下的无关类
    //private          ✔
    //空着不写          ✔               ✔
    //protected        ✔               ✔              ✔
    //public           ✔               ✔              ✔                ✔


    //权限修饰符的使用规则
        //实际开发中，一般只用private和public
        //成员变量私有
        //方法公开

    //特例: 如果方法中的代码是抽取其他方法中共性代码  这个方法一般也私有
}
