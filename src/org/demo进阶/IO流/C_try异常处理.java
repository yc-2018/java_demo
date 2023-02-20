package org.demo进阶.IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public abstract  class C_try异常处理 {//了解就好
    //接口: AutoCloseable
    //      特点:特定的情况下可以自动释放资源
    /*
    *————————基本做法————————————————————JDK7方案————————————————————————————————JDK9方案————————————————————
    *try{                           try(创建流对象1;创建流对象2){             创建流对象1;
    *    可能出现异常的代码;              可能出现异常的代码;                    创建流对象2;
    * }catch(异常类名 变量名){        }catch(异常类名 变量名){                 try(流1; 流2){
    *    异常的处理代码;                    异常的处理代码;                        可能出现异常的代码
    * }finally{                     }                                      }catch(异常类名 变量名){
    *    执行所有资源释放操作}                                                       异常的处理代码;
    *                                                                      }
    *——————手动释放资源————————————————————资源用完最终自动释放———————————————资源用完最终自动释放————————————————
    *JDK7:IO流中捕获异常的写法
    *    try后面的小括号中写创建对象的代码.
    *    注意: 只有实现了Autocloseable接口的类，才能在小括号中创建对象。
    *
    *
    *
    *
    * */
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("—————————————先看自己写关闭有多麻烦———————————————");

        //被finally控制的语句一定会执行，除非JVM退出
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("ikun.ji");
            fos = new FileOutputStream("a.DiaoMao");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("-----jdk7--___——————-");

        try(FileInputStream fis1 = new FileInputStream("ikun.ji");
            FileOutputStream fos1 = new FileOutputStream("a.DiaoMao");) {
            System.out.println(fis1.read());
            fos.write(257);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("——————————————JDK9——————————————————————————在外面写 还是要抛出异常");
        FileInputStream fis2 = new FileInputStream("ikun.ji");
        FileOutputStream fos2 = new FileOutputStream("a.DiaoMao");
        try(fis2;fos2) {
            System.out.println(fis2.read());
            fos.write(257);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
