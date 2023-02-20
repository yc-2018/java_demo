//仰晨study 创建时间2023/2/13 23:55 星期一
package org.demo进阶.枚举;

import java.util.Arrays;

public class 静态方法Demo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Orientation.values()));

        Orientation up = Orientation.valueOf("UP");
        System.out.println(up);
    }
}
