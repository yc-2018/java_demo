package org.demo.接口;

public interface B说英语 {
    //public static final   默认没得改的
    int a =555;

    //public abstract多余的  新手写来看
    public abstract void 学英语();

    //JDK8
    public default void 接口默认方法(){//下面的 需要就重写  不需要就不用    不重写不会报错  方便后续添加方法  不然全部实现该接口的全部要添加新方法
        System.out.println("默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉default关键字");
    }
    public static void 接口静态方法(){
        System.out.println("静态方法只能通过接口名调用，不能通过实现类名或者对象名调用");
    }
}
