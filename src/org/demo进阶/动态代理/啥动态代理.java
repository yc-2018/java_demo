//仰晨study 创建时间2023/2/12 4:50 星期日
package org.demo进阶.动态代理;

public interface 啥动态代理 {//特点:无侵入式的给代码增加额外的功能
    /*
    *程序为什么需要代理? 代理长什么样?
    *   对象如果嫌身上干的事太多的话
    *   可以通过代理来转移部分职责
    *
    *对象有什么方法想被代理，代理
    *就一定要有对应的方法
    ****接*口*********
    *
    *
    *
    *
    * 总结 *
    *1、为什么需要代理?
    *   调用者——>代理——>对象
    *
    *2、代理长什么样?
    *   代理里面就是对象要被代理的方法
    *
    *3、Java通过什么来保证代理的样子?
    *   通过接口保证，后面的对象和代理需要实现同一个接口
    *   接口中就是被代理的所有方法
    *****************************************************
    *
    *
    *如何为Java对象创建一个代理对象?
    *java.lang.reflect.Proxy类: 提供了为对象产生代理对象的方法:
    *
    *public static Object newProxyInstance(ClassLoader loader, Class<?>1 interfaces, InvocationHandler h)
    * 参数一:用于指定用哪个类加载器，去加载生成的代理类
    * 参数二: 指定接口，这些接口用于指定生成的代理长什么，也就是有哪些方法
    * 参数三:用来指定生成的代理对象要干什么事情
    * */
}
