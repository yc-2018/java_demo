//仰晨study 创建时间2023/2/15 14:43 星期三
package org.demo进阶.单元测试;

import org.junit.Test;

public class JunitDemo1 {
    //1.用鼠标点击@Test
    // 2.按快捷键 alt + 回车
    // 3.选择导入的jar包。 选择Junit4即可

    //如果无法导入
    //解决方案有两个:
    // 1.连一个外网。此时idea会自动的去下载Junit4的jar包
    // 2.如果连接外网还搞不定，那么就可以把今天资料文件夹中的两个jar包手动导入即可
    @Test
    public void method1() {
        int a = 6;
        int b = 0;
        int result = a/b;
        System.out.println(result);
    }

    @Test
    public void method2() {
        int a = 6;
        int b = 3;
        int result = a/b;
        System.out.println(result);
    }

    @Test
    public void method3() {
        int a = 6;
        int b = 6;
        int result = a/b;
        System.out.println(result);
    }

}
