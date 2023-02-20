//仰晨study 创建时间2023/2/11 2:49 星期六
package org.demo进阶.test;

import java.util.UUID;

public class Uuid {
    public static void main(String[] args) {
        String str = UUID.randomUUID().toString().replace("-", "");
        System.out.println(str);

        System.out.println(UUID.randomUUID());

        
    }
}
