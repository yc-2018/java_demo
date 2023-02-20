package org.demo进阶.双列集合Map;

import java.util.TreeMap;

public class 练习3TreeMap统计个数 {
    public static void main(String[] args) {
        /*需求
        *字符串“aababcabcdabcde"
        *请统计字符串中每一个字符出现的次数，并按照以下格式输出
        *输出结果:
        *       a(5) b(4) c(3) d(2) e(1)
        * */


        String str = "aababcabcdabcde";

        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (tm.containsKey(c)) {
                tm.put(c, tm.get(c) + 1);
            }else {
                tm.put(c, 1);
            }
        }
        //按要求格式输出   a(5) b(4) c(3) d(2) e(1)
        tm.forEach((k, v) -> System.out.print(k+"("+v+") "));
        System.out.println();   //上面没换行  这里单纯换行

        //老师方法
        StringBuilder sb = new StringBuilder();
        tm.forEach((k, v) -> sb.append(k).append("(").append(v).append(") "));
        System.out.println(sb);
    }
}
