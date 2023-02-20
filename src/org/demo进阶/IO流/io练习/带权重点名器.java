//仰晨study 创建时间2023/2/5 5:10 星期日
package org.demo进阶.IO流.io练习;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class 带权重点名器 {
    /*TxT文件中事先准备好一些学生信息，每个学生的信息独占一行
      要求1:每次被点到的学生，再次被点到的概率在原先的基础上降低一半。
      举例:80个学生，点名5次，每次都点到小A，概率变化情况如下:
第一次每人概率:1.25%。
第二次小A概率:0.625%。     其他学生概率:1.2579%
第三次小A概率:0.3125%。    其他学生概率:1.261867%
第四次小A概率:0.15625%。   其他学生概率:1.2638449%
第五次小A概率:0.078125%。  其他学生概率:1.26483386%

提示:本题的核心就是带权重的随机

个人权重➗总权重 ＝ 每个人的权重占比*/
        public static void main(String[] args) throws IOException {
            //1.把文件中所有的学生信息读取到内存中
            ArrayList<Student> list = new ArrayList<>();
            BufferedReader br = new BufferedReader(new FileReader("aaa\\nameList.txt"));
            String line;
            while((line = br.readLine()) != null){
                String[] arr = line.split("-");
                Student stu = new Student(arr[0],arr[1],Integer.parseInt(arr[2]),Double.parseDouble(arr[3]));
                list.add(stu);
            }
            br.close();

            //2.计算权重的总和
            double weight = 0;
            for (Student stu : list) {
                weight = weight + stu.getWeight();
            }
            System.out.println("权重的总和"+weight);//----------------------

            //3.计算每一个人的实际占比
            //第一次[0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1]
            double[] arr = new double[list.size()];
            for (int index = 0; index < list.size(); index++) {
                arr[index] = list.get(index).getWeight() / weight;
            }
            System.out.println("每一个人的实际占比"+Arrays.toString(arr)
                    +"全部加起来是接近1的："
                    +(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]+arr[7]+arr[8]+arr[9]));//----------------


            //4.计算每一个人的权重占比范围
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i] + arr[i - 1];
            }
            System.out.println("每一个人的权重占比范围"+Arrays.toString(arr));//----------------


            //5.随机抽取
            //获取一个0.0~1.0之间的随机数
            double number = Math.random();
            //判断number在arr中的位置
            //二分查找法
            //方法回返回： - 插入点 - 1
            //获取number这个数据在数组当中的插入点位置
            int result = -Arrays.binarySearch(arr, number) - 1;
            Student stu = list.get(result);
            System.out.println(stu);

            //6.修改当前学生的权重
            double w = stu.getWeight() / 2;
            stu.setWeight(w);

            //7.把集合中的数据再次写到文件中
            BufferedWriter bw = new BufferedWriter(new FileWriter("aaa\\nameList.txt"));
            for (Student s : list) {
                bw.write(s.toString());
                bw.newLine();
            }
            bw.close();
        }
}
