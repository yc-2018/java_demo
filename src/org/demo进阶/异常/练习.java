package org.demo进阶.异常;

import java.util.Scanner;

public class 练习 {
    /*键盘录入数据
     *需求:
        键盘录入自己心仪的女朋友姓名和年龄
        姓名的长度在2~10之间
        年龄的范围为18-40岁
        超出这个范围是异常数据不能赋值，需要重新录入,一直录到正确为止。
     *提示:
        需要考虑用户在键盘录入时的所有情况。
        比如:录入年龄时超出范围，录入年龄时录入了abc等情况
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        GirlFriend gf = new GirlFriend();

        //还没学自定义报错   分开来循环就不用  错一个重新录2个了  学了但不想重新写 就写个思路 同一个while if（name!=null）跳过输入name;   好像和自定义报错没什么关联...
        //录名字
        while (true) {
            try {
                System.out.println("请输入你女朋友的名字");
                String name = sc.nextLine();
                gf.setName(name);
                break;
            } catch (NameFormatException e) {
                e.printStackTrace();
                //System.err.println("姓名的长度有误 请重新输入");
            }
        }

        //录年龄
        while (true) {
            try {
                System.out.println("请输入你女朋友的年龄");
                int age = Integer.parseInt(sc.nextLine());
                gf.setAge(age);
                break;//如果所有的数据都是正确的，那么跳出循环
            } catch (NumberFormatException e) {
                System.err.println("年龄格式输入有误 请重新输入");
                //continue;
            } catch (AgeOutofBoundsException e) {
                e.printStackTrace();
                System.err.println("年龄的范围有误 请重新输入");
                //continue;
            }
        }

        System.out.printf("我女朋友叫 %s 今年%d岁%n",gf.getName(),gf.getAge());
    }
}

class GirlFriend {
    private String name;
    private int age;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    //throws NameFormatException可以省略不写
    public void setName (String name) throws NameFormatException{
        if (name.length()<2||name.length()>10) throw new NameFormatException(name+" 格式有误，长度要求在2到10之间");
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        if (age<18||age>40) throw new AgeOutofBoundsException(age+" 不在规定的范围内");
        this.age = age;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + "}";
    }
}