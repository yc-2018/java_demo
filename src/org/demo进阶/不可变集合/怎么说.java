package org.demo进阶.不可变集合;//疑问final和这的区别

public interface 怎么说 {//Jdk8的时候才出现的
    //不可变集合:不可以被修改的集合

//    修改长底?✖
//    修改内突?✖

    /*创建不可变集合的应用场景
        如果某个数据不能被修改，把它防御性地拷贝到不可变集合中是个很好的实践
        或者当集合对象被不可信的库调用时，不可变形式是安全的。
    */
    //简单理解:不想让别人修改集合中的内容        （比如斗地主定义的规则 单张、对子、三条、三带二、炸弹，飞机带翅膀  等等   再比如一副牌就是54张不一样的）

//创建不可变集合的书写格式
    /*在List、Set、Map接口中，都存在静态的of方法，可以获取一个不可变的集合
    * 方法名称                                              说明
    static <E> List<E> of(E...elements)           创建一个具有指定元素的List集合对象
    static <E> Set<E> of(E...elements)            创建一个具有指定元素的Set集合对象
    static <K，V> Map<K，V> of(E...elements)       创建一个具有指定元素的Map集合对象     jdk10的时候Map.copyOf(hm);
    *
    * 注意:这个集合不能添加，不能删除，不能修改
    * */




    /*总结
    *1.不可变集合的特点?
    ***定义完成后不可以修改，或者添加、删除
    *
    *2.如何创建不可变集合?
    ***List、Set、Map接口中，都存在of方法可以创建不可变集合
    *
    *3.三种方式的细节
    ***List: 直接用
    ***Set: 元素不能重复
    ***Map: 元素不能重复、键值对数量最多是10个
    *       超过10个用ofEntries方法
    *
    * */
}
