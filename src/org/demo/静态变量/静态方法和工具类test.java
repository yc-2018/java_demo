package org.demo.静态变量;

public class 静态方法和工具类test {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 66, 7,9};
        String printArr = 静态方法和工具类.printArr(arr);   //直接点 来调用
        System.out.println(printArr);                    //[1,2,3,4,66,7,9]

        double[] ave = {1.1, 2.2, 3.3, 4.4, 5.5};
        double ave1 = 静态方法和工具类.getAve(ave);
        System.out.println(ave1);                        //3.3
    }
}
