//仰晨study 创建时间2023/2/15 15:57 星期三
package org.demo进阶.单元测试;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class JunitDemo4 {
    @Before
    public void BeforeTest() throws IOException {
        //默认情况下:
        //相对路径，是相对谁? 项目而言

        //细节;
        //单元测试的相对路径，是相对谁?当前模块!!!

        //在不同的情况下，相对路径有可能是不一样的。
        File file = new File("ikun.txt");
        file.createNewFile();
    }

    @Test
    public void test() {

    }

    @After
    public void after() {

    }
}
