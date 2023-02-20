package org.demo进阶.双列集合Map;/*需求
某个班级80名学生，现在需要组成秋游活动，
班长提供了四个景点依次是 (A、B、C、D),每个学生只能选择一个景点，
请统计出最终哪个景点想去的人数最多。*/

import java.util.*;

public class 练习2统计投票 {
    public static void main(String[] args) {
        //1.需要先让同学们投票
        // 定义一个数组，存储4个景点
        String[] arr = {"A", "B", "C", "D"};


        //利用随机数模拟80个同学的投票，并把投票的结果存储起来
        ArrayList<String> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 80; i++) {
            list.add(arr[random.nextInt(arr.length)]);
        }

        System.out.println(list);


        //2.如果要统计的东西比较多，不方便使用计数器思想
        // 我们可以定义map集合，利用集合进行统计。
        HashMap<String, Integer> hm = new HashMap<>();
        for (String s : list) {
            if (hm.containsKey(s)) {
                hm.put(s,hm.get(s)+1);      //存在    在原来的基础上加1
            }else
                hm.put(s, 1);               //不存在  统计到了  就是1
        }
        System.out.println(hm);

        //3.求最大值+//4.判断哪个景点的次数跟最大值一样，如果一样，打印出来
        int max = 0;                                                //定义好最大值
        ArrayList<String> result = new ArrayList<>();               //记录结果的数组  这样结果票数有相同也不怕
        Set<Map.Entry<String, Integer>> entries = hm.entrySet();    //创建一个迭代器
        for (Map.Entry<String, Integer> entry : entries) {          //循环迭代器
            int count = entry.getValue();                           //记录迭代的投票数
            if (count > max) {                                      //如果投票数大于最大值
                max=count;                                          //把投票数赋值给最大值
                result.clear();                                     //把本来集合记录的最大值s 清空
                result.add(entry.getKey());                         //把最大值的键 放到集合
            } else if (count == max) {                              //最大值和迭代投票数相同的话
                result.add(entry.getKey());                         //把最大值的键 添加到集合
            }
        }
        System.out.println("最终"+result+"景点想去的人数最多");                                 //打印集合的结果
    }
}
