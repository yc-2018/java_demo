//仰晨study 创建时间2023/2/15 15:32 星期三
package org.demo进阶.单元测试;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.*;

public class JunitDemo3 {

    //在实际开发中，真正完整的单元测试该怎么写?
    //前提:
    //以后在工作的时候，测试代码不能污染原数据。《修改，篡改)

    // 1.利用Before去对数据做一个初始化的动作
    // 2.利用Test真正的去测试方法
    // 3.利用After去还原数据

    // 需求: 测试File类中的delete方法是否书写正确? ? ?

    @Before
    public void beforeMethod() throws IOException {
        //先备份

        FileInputStream fis = new FileInputStream("E:\\idea\\java20220916\\aaa\\a.txt");
        FileOutputStream fos = new FileOutputStream("E:\\idea\\java20220916\\aaa\\copy.txt");

        int ch;
        while ((ch = fis.read()) != -1)
            fos.write(ch);

        fos.close();
        fis.close();
    }

    // 问题: 咱们现在有没有污染原数据?
    // 有，当测试代码运行之后，a.txt被删除了啊?
    // 作为一个标准的测试人员，运行完单元测试之后
    // 1.得到结果
    // 2.a.txt还在
    @Test
    public void mothod() {
        File file = new File("E:\\idea\\java20220916\\aaa\\a.txt");
        boolean delete = file.delete();

        //检查a.txt是否存在
        boolean exists = file.exists();

        //只有同时满足了下面所有的断言，才表示delete方法编写正确
        Assert.assertTrue("delete方法出错啦", delete);
        Assert.assertFalse("delete方法出错啦", exists);
    }


    @After
    public void afterMethod() throws IOException {
        //还要对a.txt做一个还原
        File src = new File("E:\\idea\\java20220916\\aaa\\copy.txt");           //为什么我写绝对路径 看Demo4
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream("E:\\idea\\java20220916\\aaa\\a.txt");

        int ch;
        while ((ch = fis.read()) != -1)
            fos.write(ch);

        fos.close();
        fis.close();

        //备份数据要删除
        src.delete();
    }
}
