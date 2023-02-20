package org.demo进阶;
//JDK5
//可变参数
//方法形参的个数是可以发生变化的，0 1 2 3 ...
//格式:属性类型...名字
//int...args

public class 可变参数 {
    public static void main(String[] args) {
        /*练习
        * 假如需要定义一个方法求和，该方法可以灵活的完成如下需求:
        * 计算2个整数的和
        * 计算3个整数的和
        * 计算4个整数的和
        * 计算n个整数的和
        * */

        int sum = getSum(2,3,4,5,6,7,8,9,66);
        //底层:
        //可变参数底层就是一个数组
        //只不过不需要我们自己创建了，Java会帮我们创建好

        System.out.println(sum);
    }
    //可变参数的小细节:
    //1.在方法的形参中最多只能写一个可变参数
    //可变参数，理解为一个大胖子，有多少吃多少
    //2.在方法的形参当中，如果出了可变参数以外，还有其他的形参，那么可变参数要写在最后

    private static int getSum(int...ints) {
        int sun = 0;
        for (int anInt : ints) {
            sun += anInt;
        }
        return sun;
    }
}

/*总结
1.可变参数本质上就是一个数组
2.作用: 在形参中接收多个数据
3格式:数据类型...参数名称
    举例:int...a
4.注意事项:
    形参列表中可变参数只能有一个
    可变参数必须放在形参列表的最后面
*/