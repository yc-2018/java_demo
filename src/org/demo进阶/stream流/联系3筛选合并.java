package org.demo进阶.stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 联系3筛选合并 {
    /*现在有两个ArrayList集合，
    第一个集合中:存储6名男演员的名字和年龄    第二个集合中:存储6名女演员的名字和年龄。
    姓名和年龄中间用逗号隔开。比如: 张三,23

    要求完成如下的操作:
    1,男演员只要名字为3个字的前两人
    2,女演员只要姓杨的，并且不要第一个
    3,把过滤后的男演员姓名和女演员姓名合并到一起
    4,将上一步的演员信息封装成Actor对象
    5,将所有的演员对象都保存到List集合中
    备注:演员类Actor，属性只有一个: name，age

    男演员:"蔡坤坤,24","吴签,24","叶躺咸,23","刘不甜,22","谷嘉,39","肖梁梁,27"
    女演员:"赵小颖,35","杨颖,36","高元元,43","张天天,31","刘诗,35","杨小幂,33"


*/
    public static void main(String[] args) {
        ArrayList<String> girlList = new ArrayList<>();
        ArrayList<String> boyList = new ArrayList<>();

        Collections.addAll(boyList, "蔡坤坤,24", "吴签,24", "叶齁咸,23", "刘不甜,22", "谷嘉,39", "肖梁梁,27");
        Collections.addAll(girlList, "赵小颖,35", "杨颖,36", "高元元,43", "张天天,31", "刘诗,35", "杨小幂,33");

        Stream<String> girlLimit = girlList.stream()
                .filter(s -> s.startsWith("杨"))         //女演员只要姓杨的
                .skip(1);                             //并且不要第一个

        Stream<String> boyLimit = boyList.stream()
                .filter(s -> s.split(",")[0].length() == 3)     //男演员只要名字为3个字
                .limit(2);//的前两人


        List<Actor> list = Stream.concat(boyLimit, girlLimit) //把过滤后的男演员姓名和女演员姓名合并到一起
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))    //封装成Actor对象
                .collect(Collectors.toList());                                                         //保存到List集合中

        System.out.println(list);
    }
}

class Actor{
    private String name;
    private int age;


    public Actor() {
    }

    public Actor(String name, int age) {
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
    public void setName(String name) {
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
        this.age = age;
    }

    public String toString() {
        return "Actor{name = " + name + ", age = " + age + "}";
    }
}