//仰晨study 创建时间2023/2/12 0:28 星期日
package org.demo进阶.反射.练习1_到文件;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class 对象字段名和值保存到文件Demo {
    public static void main(String[] args) throws IllegalAccessException, IOException {
        /*
        对于任意一个对象，都可以把对象所有的字段名和值，保存到文件中去
        */
        Student s = new Student("苏珊", 23, '女', 165.7, "睡觉");
        Teacher t = new Teacher("只因", 10001);
        //String ikun = "ikun";

        saveObject(s);//或 s


    }

    private static void saveObject(Object obj) throws IOException, IllegalAccessException {
        //把对象里面所有的成员变量名和值保存到本地文件中
        BufferedWriter fw = new BufferedWriter(new FileWriter("aaa\\saveObj.txt"));

        //1.获取字节码文件的对象
        Class<?> clazz = obj.getClass();

        //3. 获取所有的成员变量
        Field[] fields = clazz.getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);

            String name = f.getName();

            Object value = f.get(obj);

            fw.write(name+"="+value);
            fw.newLine();

        }
        fw.close();
    }
}
