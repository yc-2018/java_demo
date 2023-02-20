package org.demo进阶.异常;

public class 异常的处理方式 {
    /*有3种**********************************************
     *  1.JVM默认的处理方式
     *      把异常信息以红色字体打印在控制台，并结束程序
     *
     *  2.自己处理（捕获: try...catch）
     *      一般用在调用处，能让代码继续往下运行
     *
     *  3.抛出异常（throw throws）
     *      在方法中，出现异常了。
     *      方法就没有继续运行下去的意义了，采取抛出处理，
     *      让该方法结束运行并告诉调用者出现了问题
     **************************************************/

    /*Throwable 的成员方法
            方法名称                    说明
    public string getMessage()       返回此 throwable 的详细消息字符串
    public string toString()         返回此可抛出的简短描述
    public void printStackTrace()    把异常的错误信息输出在控制台 (以后最常用)
                                        在底层是利用system.err.printIn进行输出
                                        把异常的错误信息以红色字体输出在控制台
                                        细节:仅仅是打印信息，不会停止程序运行
    */
    public static void main(String[] args) {
        //正常的 输出语句
        System.out.println(123);
        //错误的 输出语句 (而是用来打印错误信息)
        System.err.println("涉及多线程 所以红色打印结果可能在前也可能在后");

        int[] arr = {1, 2, 3, 4};

        System.out.println("\n——————测试——getMessage()");
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
        System.out.println("\n——————测试——toString() ");
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            String s = e.toString();
            System.out.println(s);
        }
        System.out.println("\n——————测试——printStackTrace()");
        try {
            System.out.println(arr[6]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        System.out.println("\n这个东西e.printStackTrace(); 虽然看到红色但是还是可以执行下面的代码的");
    }
}

//——————————————————————————————————————————————————————————————————————————————————————————————————————————
class JVM默认的处理方式{
    public static void main(String[] args) {
        // JVM默认的处理方式
        // 把异常的名称，异常原因及异常出现的位置等信息输出在了控制台
        // 程序停止执行，下面的代码不会再执行了
        System.out.println("ikun");
        System.out.println(2 / 0);        //算术异常 ArithmeticException
        System.out.println("苏珊");
        System.out.println("荔枝");
    }
}


//——————————————————————————————————————————————————————————————————————————————————————————————————————————
class 自己处理{
    public static void main(String[] args) {
        //自己处理 (捕获异常 )
        /*格式:
            try{
                可能出现异常的代码;
            }catch(异常类名 变量名) {
                异常的处理代码;
                }

          目的:当代码出现异常时，可以让程序继续往下执行*/

        int[] arr = {1, 2, 4, 5, 3};
        String s=null;
        try {
            System.out.println(2 / 0);                       // 拿着这个对系到catch的小括号中对比，看括号中的变量是否可以接收这个对象
            System.out.println(arr[10]);                    //这里出现了异常，程序就会在这里创建一个ArrayIndexOutOfBoundsException对象
            System.out.println(s.equals("ikun"));          //如果能被接收，就表示该异常就被捕获(抓住) ，执行catch里面对应的代码
                                                          //new ArrayIndexOutOfBoundsException();
                                                         //当catch里面所有的代码执行完毕，继续执行try...catch体系下面的其他代码
        } catch (ArrayIndexOutOfBoundsException e) {    //如果出现了ArrayIndexOutOfBoundsException我该如何处理
            System.err.println("索引越界");
        } catch (ArithmeticException e) {
            System.err.println("除数为0");
        } catch (NullPointerException e) {
            System.err.println("空指针异常");
        } catch (ArrayStoreException | ClassCastException e){
            System.out.println("JDK7之后 中间用|进行隔开  表示A异常B异常采取同种方案");
        } catch (Exception e) {
            System.err.println("上面的异常都不是 才会被触发");
        }

        System.out.println("看看我执行了吗");
    }
    /*自己处理 (灵魂四问)
        灵魂一问:如果try中没有遇到问题，怎么执行?
                答：会把try里面所有的代码全部执行完毕，不会执行catch里面的代码

        灵魂二问: 如果try中可能会遇到多个问题，怎么执行?
                答：会写多个catch与之对应，父类异常需要写在下面
                   了解性:
                        在JDK7之后，我们可以在catch中同时捕获多个异常，中间用|进行隔开
                        表示如果出现了A异常或者B异常的话，采取同一种处理方案

        灵魂三问:如果try中遇到的问题没有被捕获，怎么执行?
                答：相当于try...catch白写了当前异常会交给虚拟机处理

        灵魂四问: 如果try中遇到了问题，那么try下面的其他代码还会执行吗?
                答：不会执行了。try中遇到问题，直接跳转到对应的catch如果没有对应的catch与之匹配，则交给虎拟机处理
        */
}


//——————————————————————————————————————————————————————————————————————————————————————————————————————————
class 抛出异常{
/*
* throws  注意:写在方法定义处，表示声明一个异常    告诉调用者，使用本方法可能会有哪些异常
               编译时异常: 必须要写
               运行时异常: 可以不写

* throw   注意:写在方法内，结束方法   手动抛出异常对象，交给调用者   方法中下面的代码不再执行了
*
* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    public static void main(String[] args) {
        //需求:
        //定义一个方法求数组的最大值
        int[] arr = {};

        int max= 0;
        try {                                           //一般结合 捕获异常 来用
            max = getMax(arr);
        } catch (NullPointerException e) {
            System.out.println("空指针异常 数组为null");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界异常 数组长度为0");
        }
        System.out.println(max);
    }

    private static int getMax(int[] arr) /*throws NullPointerException,ArrayIndexOutOfBoundsException*/ {
        //手动创建一个异常对象，并把这个异常交给方法的调用者处理
        //此时方法就会结束，下面的代码不会再执行了
        if (arr==null) throw new NullPointerException();
        if (arr.length==0)throw new ArrayIndexOutOfBoundsException();

        System.out.println("————看看我开始执行了吗————");
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (max<arr[i])
                max=arr[i];
        return  max;
    }
}