package org.demo.练习;
import java.util.Arrays;
/*
定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
要求1:属性有姓名、年龄、身高。
要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序
(姓名中不要有中文或特殊字符，会涉及到后面的知识)*/
public abstract class 按要求排序 {
    public static void main(String[] args) {
        //1.创建三个女朋友的对象
        GirlFriend gf1 = new GirlFriend("kunkun", 22, 165);
        GirlFriend gf2 = new GirlFriend("ikun", 22, 169);
        GirlFriend gf3 = new GirlFriend("susan", 26, 165);

        //2.定义数组存储女朋友的信息
        GirlFriend[] arr ={gf1,gf2,gf3};

        //3.利用Arrays中的sort方法进行排序
            //按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        Arrays.sort(arr, (o1, o2) -> {
            int temp = o1.getAge() - o2.getAge();
            temp = temp == 0 ? o1.getHeigth() - o2.getHeigth() : temp;
            //字符串1.compareTo(字符串2)  会返回字符串1的每个字符的ascll码 - 字符串2的每个字符的ascll码的差值(相同往后比，不同直接返回)
            temp = temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
            return temp;
        });

        System.out.println(Arrays.toString(arr));
    }




    static class  GirlFriend{
        private String name;
        private int age;
        private int heigth;

        public GirlFriend() {
        }

        public GirlFriend(String name, int age, int heigth) {
            this.name = name;
            this.age = age;
            this.heigth = heigth;
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

        /**
         * 获取
         * @return heigth
         */
        public int getHeigth() {
            return heigth;
        }

        /**
         * 设置
         * @param heigth
         */
        public void setHeigth(int heigth) {
            this.heigth = heigth;
        }

        public String toString() {
            return "GirlFriend{name = " + name + ", age = " + age + ", heigth = " + heigth + "}";
        }
    }
}
