package org.demo进阶.IO流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class J_练习2_文件加密 {
    /*
    * 为了保证文件的安全性，就需要对原始文件进行加密存储，再使用的时候再对其进行解密处理
    * 加密原理:
    *         对原始文件中的每一个字节数据进行更改，然后将更改以后的数据存储到新的文件中。
    * 解密原理:
    *         读取加密之后的文件，按照加密的规则反向操作，变成原始文件。
    * */

    public static void main(String[] args) throws IOException {
        /*
        ^:异或
        两边相同: false
        两边不同: true

        设
        0: false
        1: true

        100:1100100
        10: 1010

        1100100
       ^0001010
       ————————
        1101110
       ^0001010
       ————————
        1100100 十进制: 100
        结论：异或两次同一个数 这个数还是原来的哪个数      那么 异或一次=加密   再异或一次=解密  （相当于异或的那个数是密码  加密要设置密码 解密要正确密码）
        */

        FileInputStream fis = new FileInputStream("aaa\\要加密图片.jpg");
        FileOutputStream fos = new FileOutputStream("aaa\\已加密图片.jpg");

        int b;
        while ((b = fis.read()) != -1)
            fos.write(b^52);

        fos.close();
        fis.close();

        //————————————————————————————————原封不动复制上面的————————————————————————————————————————

        FileInputStream fis1 = new FileInputStream("aaa\\已加密图片.jpg");
        FileOutputStream fos1 = new FileOutputStream("aaa\\已解密图片.jpg");

        int b1;
        while ((b1 = fis1.read()) != -1)
            fos1.write(b1^52);

        fos1.close();
        fis1.close();
    }
}
