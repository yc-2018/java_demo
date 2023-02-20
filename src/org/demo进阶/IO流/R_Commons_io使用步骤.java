//仰晨study 创建时间2023/2/4 4:40 星期六
package org.demo进阶.IO流;

public interface  R_Commons_io使用步骤 {
    /*
    在项目中创建一个文件夹: lib
    将jar包复制粘贴到lib文件夹
    右键点击jar包，选择 Add as Library -> 点击OK
    在类中导包使用
*/
}
/*Commons-io 常见方法
FileUtils类(文件/文件夹相关 )                                             说明
static void copyFile(File srcFile， File destFile)                    复制文件
static void copyDirectory(File srcDir，File destDir)                  复制文件夹
static void copyDirectoryToDirectory(File srcDir，File destDir)       复制文件夹
static void deleteDirectory(File directory)                           删除文件夹
static void cleanDirectory(File directory)                            清空文件夹
static String readFileToString(File file， Charset encoding)          读取文件中的数据变成成字符串
static void write(File file， CharSequence data，String encoding)     写出数据

loUtils类(流相关相关)                                                   说明
public static int copy(InputStream input,OutputStream output)       复制文件
public static int copyLarge(Reader input,Writer output)             复制大文件
public static String readLines(Reader input)                        读取数据
public static void write(String data,OutputStream output)           写出数据
*/

/*                Commons有很多工具类
StringUtils 字符串工具类      ClassUtils 反射工具类
NumberUtils 数字工具类        SystemUtils 系统工具类
ArrayUtils 数组工具类         MapUtils 集合工具类
RandomUtils 随机数工具类       Beanutils bean工具类
DateUtils 日期工具类          等等..
stopwatch 秒表工具类          I0 I0工具类
*/