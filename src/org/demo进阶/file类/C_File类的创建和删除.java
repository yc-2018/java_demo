package org.demo进阶.file类;

import java.io.File;
import java.io.IOException;

public abstract class C_File类的创建和删除 {
    /*  方法名称                          说明
public boolean createNewFile()      创建一个新的空的文件
public boolean mkdir()              创建单级文件夹
public boolean mkdirs()             创建多级文件夹

public boolean delete()             删除文件、空文件夹
                                    注意：delete方法默认只能删除文件和空文件夹，delete方法直接删除不走回收站
*/
    public static void main(String[] args) throws IOException {

        //创建一个新的空的文件
            //细节1: 如果当前路径表示的文件是不存在的，则创建成功，方法返回true
            //      如果当前路径表示的文件是存在的，则创建失败，方法返回false
            //细节2: 如果父级路径是不存在的，那么方法会有异常IOException
            //细节3: createNewFile方法创建的一定是文件，如果路径中不包含后缀名，则创建一个没有后缀的文件
        File file1 = new File("src\\org\\demo进阶\\文件\\创建的文件1.txt");
        boolean newFile = file1.createNewFile();
        System.out.println(newFile);


       //创建单级文件夹(少用
            //细节1: windows当中路径是唯一的，如果当前路径已经存在，则创建失败，返回false(  才发现文件和文件夹在同一个路径也不可以同名
            //细节2: mkdir方法只能创建单级文件来，无法创建多级文件夹。
        File file2 = new File("src\\org\\demo进阶\\文件\\创建的文件夹");
        boolean mkdir = file2.mkdir();
        System.out.println(mkdir);


        //创建多级文件夹（常用）
            //细节:既可以创建单级的，又可以创建多级的文件夹
        File file3 = new File("src\\org\\demo进阶\\文件\\创建文件夹\\创建的文件夹\\创建的文件夹");
        boolean mkdirs = file3.mkdirs();
        System.out.println(mkdirs);


        //删除文件、空文件夹
            //细节:
                //如果删除的是文件，则直接删除，不走回收站。
                //如果删除的是空文件来，则直接删除，不走回收站
                //如果删除的是有内容的文件夹，则删除失败
        File file4 = new File("src\\org\\demo进阶\\文件\\创建的文件1.txt");
        boolean delete = file4.delete();
        System.out.println(delete);

        File file5 = new File("src\\org\\demo进阶\\文件\\创建文件夹\\创建的文件夹\\创建的文件夹");
        System.out.println(file5.delete());

    }
}
