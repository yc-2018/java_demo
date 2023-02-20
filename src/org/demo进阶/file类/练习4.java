package org.demo进阶.file类;

import java.io.File;

public abstract class 练习4 {
    public static void main(String[] args) {
        //需求:
        //删除一个多级文件夹

        File src = new File("E:\\Users\\Dell\\Desktop\\新建文件夹");

        delete(src);
    }

    private static void delete(File src) {
        File[] files = src.listFiles();

        for (File f : files) {
            if (f.isFile())
                System.out.println(f.getName()+"  删除结果："+f.delete());
            else{
                delete(f);
                System.out.println(f.getName()+"   这个文件夹里面已经删光光了  轮到他了："+f.delete());
            }
        }
        System.out.println("目标文件夹删除结果为："+src.delete());

    }

}
