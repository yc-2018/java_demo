package org.demo进阶.异常;

public interface 自定义异常 {
    /*  1.定义异常类
        2.写继承关系
        3.空参构造
        4.带参构造

        意义:就是为了让控制台的报错信息更加的见名之意
     */
}


class NameFormatException extends RuntimeException{
    //技巧:
    //NameFormat: 当前异常的名字，表示姓名格式化问题
    //Exception: 表示当前类是一个异常类

    // 运行时: RuntimeException 核心 就表示由于参数错误而导致的问题
    // 编译时: Exception 核心 提醒程序员检查本地信息

    //右键生成 直接重写前面2个方法就好了
    public NameFormatException() {
    }

    public NameFormatException(String message) {
        super(message);
    }
}

class AgeOutofBoundsException extends RuntimeException{
    public AgeOutofBoundsException() {
    }

    public AgeOutofBoundsException(String message) {
        super(message);
    }
}