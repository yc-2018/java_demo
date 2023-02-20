package org.demo进阶.file类;

import java.io.File;
import java.util.HashMap;

public abstract class 练习6 {
    public static void main(String[] args) {
        //需求:
        //统计一个文件夹中每种文件的个数并打印。 (考虑子文件夹)
        //打印格式如下:
        //          txt:3个
        //          doc:4个
        //          jpg:6个

        File src = new File("src\\org\\");

        HashMap<String, Integer> count = getCount(src);

        count.forEach((k, v) -> System.out.println(k+":"+v+"个"));
    }

    private static HashMap<String, Integer> getCount(File src) {
        HashMap<String, Integer> hm = new HashMap<>();
        return getCount(src, hm);
    }

    private static HashMap<String, Integer> getCount(File src, HashMap<String, Integer> hm) {
        File[] files = src.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                String[] arr = f.getName().split("\\.");
                if (arr.length>=2) {                            //文件没有后缀名就不统计   写就多一个else算了
                    String endName = arr[arr.length - 1];
                    if (hm.containsKey(endName))              //看看在map集合中是否已经存在
                        hm.put(endName, hm.get(endName) + 1);
                    else
                        hm.put(endName, 1);
                }
            }else
                getCount(f, hm); //老师在这里把返回值整合 非常麻烦   因为他的map就在本方法里面  每次递归都会产生一个新的map
                                 //我直接多写一个方法 new的map 地址就一个 就不要整合了 外面就用一个参数的方法，一个参数的方法再去调用本方法（2个常数）
        }
        return hm;
    }
}
