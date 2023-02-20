package org.demo进阶.file类;

import java.io.File;

public abstract class 练习2 {
    public static void main(String[] args) {
        //需求:
        //定义一个方法找某一个文件夹中，是否有以avi结尾的电影。
        // (暂时不需要考虑子文件夹)

        File file = new File("C:\\Users\\Administrator\\Videos");
        File[] arr = file.listFiles();

        boolean b = haveAVI(arr);
        System.out.println(b);
    }


    // 作用: 用来找某一个文件夹中，是否有以avi结尾的电影
    // 形参:要查找的文件夹
    // 返回值: 查找的结果 存在true 不存在false
    private static boolean haveAVI(File[] arr) {
        if (arr==null)return false;

        for (File f : arr)                                         //f: 依次表示文件夹里面每一个文件或者文件夹的路径
            if (f.isFile() && f.getName().endsWith(".avi"))
                return true;

        return false;
    }
}
