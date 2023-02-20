package org.demo.常用API.正则;

import java.util.Arrays;
import java.util.regex.Pattern;

public class 正则5替换和切练习 {
    public static void main(String[] args) {
        /*  如果方法里面有string regex 就表示该方法支持正则  否则正则在其他方法就是单纯的字符串
            public string[] matches(string regex)
            public string replaceAll(string regex,string newStr)
            public string[] split(string regex)
         */
        String s ="小坤坤dqw1e3fqwf1qwfwg12312小妹妹dqwe4fqwf3qwfwg12312小明明212x小吊毛";

        //替换方法
        String result1 = s.replaceAll("[\\w&&[^_]]+", "vs");
        System.out.println(result1);
        // 细节:
        // 方法在底层跟之前一样也会创建文本解析器的对象
        // 然后从头开始去读取字符串中的内容，只要有满足的，那么就用第二个参数去替换。

        //替换方法
        String[] split = s.split("\\w");
        System.out.println(Arrays.toString(split)); //有猫饼----[小坤坤, , , , , , , , , , , , , , , , , , , , , 小妹妹, , , , , , , , , , , , , , , , , , , , 小明明, , , , 小吊毛]
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

    }
}
