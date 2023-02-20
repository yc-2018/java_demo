package org.demo.字符串;

// 使用stringBuilder的场景:
// 1.字符串的拼接
// 2.字符串的反转
public class 字符串Builder类 {
    public static void main(String[] args) {
        /*
        *StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的
        *作用:提高字符串的操作效率
        * */

        StringBuilder sb = new StringBuilder("可写可不写");

        //添加元素
        sb.append("啥类型都行");
        sb.append(true);
        sb.append(123);
        sb.append('d');

        System.out.println(sb+"      类型为"+sb.getClass().toString());

        //元素翻转
        sb.reverse();
        System.out.println(sb);

        //获取长度
        System.out.println("字符串的长度为"+sb.length());
        System.out.println("字符串的容量为"+sb.capacity());

        //变回字符串
        String srt = sb.toString();
        System.out.println(srt+"      类型为"+srt.getClass().toString());

        //容量.默认是16 不够就会 *2+2德扩容(有问题的样子
        StringBuilder sb1 =new StringBuilder();
        System.out.println(sb1.capacity());




        // 打印
        // 普及:
        // 因为stringBuilder是Java已经写好的类
        // java在底层对他做了一些特殊处理。
        // 打印对象不是地址值而是属性值。
    }
}
