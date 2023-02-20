//仰晨study 创建时间2023/2/13 18:37 星期一
package org.demo进阶.log日志;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public abstract class LogDemo {

    /*在代码中获取日志的对象
    public static final Logger LOGGER= LoggerFactory.getLogge"类对象");
    */

    public static final Logger LOGGER = LoggerFactory.getLogger(LogDemo.class);

    public static void main(String[] args) {
        int a = new Random().nextInt(66);
        LOGGER.info("创建了一个a对象");
        int b =0;
        LOGGER.debug("创建了一个被除数对象");

        try {
            int i = a / b;
            LOGGER.info("两个数正常相除  被除数为"+a+"除数为"+b);
        } catch (Exception e) {
            LOGGER.error("相除 出错了  被除数为"+a+"除数为"+b);
        }


    }
}
