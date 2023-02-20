package org.demo;

import java.util.Scanner;

public class classa {
    public static void main(String[] args){
        System.out.println("IDEA设置背景图片：文件→设置→外观与行为→外观→背景图片");
        System.out.println("----------------------------");
        System.out.println("你好"+"  必须双引号哦");
        System.out.println("快捷键写psvm 就=public static void main(String[] args) \nsout 就是打印语句了");
        System.out.println("项目→模块→包(com.xxx.xx)→类");
        System.out.println("换行打印");
        System.out.print("不换行打印");
        System.out.printf("按格式%s","输出");

        //创建Scanner对象，接受从控制台输入
        Scanner ipt = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String a = ipt.next();//接受String类型
        System.out.println("请输入整数：");
        int nb = ipt.nextInt();//接受整数类型
        System.out.println("字符串是："+a+"  整数是："+nb);
//  获取个、十、百 位
        int ge = nb%10;
        int shi =nb/10%10;
        int bai = nb/100%10;
//      int 千 = nb/1000%10;
        System.out.println("个位是："+ge);
        System.out.println("十位是："+shi);
        System.out.println("百位是："+bai);
        System.out.println("-------------------------------");

//  隐式转换
        //byte--short--int--long--float--double（最叼）
        //byte类型的取值-128到127
        //byte、short和char 计算的时候会变成int类型再进行计算
//  强制转换
        byte aa = 10;
        byte bb = 20;
        byte cc = (byte) (aa +bb);
        System.out.println("强制转换相加："+cc);       //强制转换相加：30

//  +运算符
        System.out.println(2+3+"----diaomao");       //5----diaomao
        System.out.println("diaomao----"+2+3);      //diaomao----23
        System.out.println(99+1+"ikun"+99+1);       //100ikun991
        //字符
        System.out.println(1+'a');                  //98

//  自增运算符++ --
        int dd = 30;
        System.out.println(++dd);        //31
        int ee=dd++;
        System.out.println(ee);         //31
        System.out.println(dd);         //32
        System.out.println(--ee);      //30
        
//  += -=  *= /= %= 细节  底层都隐藏了一个强制类型转换
        short s = 1;
        s+=1;
        //等同于s = (short)(s+1);
        
// 关系运算符==  > >= < <= != 的结果都是boolean类型，要么是true，要么是false
//千万不要把“==”误写成“=”      
//      逻辑运算符  &  |  ！   （单个的？6）    逻辑与|  逻辑与&   左移<<  右移>>   无符号右移>>>
         
        System.out.println(true&true);//true
        System.out.println(true&false);//false
        System.out.println(false&false);//false
        
        System.out.println(true|true);//true
        System.out.println(true|false);//true
        System.out.println(false|false);//false
        
        System.out.println(true^true);//false
        System.out.println(true^false);//true
        System.out.println(false^false);//false
        //短路与&&   短路或||    单个是不会短路的， 结果是一样的，但是这个效率会高很多
        
//三元运算符
        int x = 1;
        int b = 2;
        System.out.println(x==b?"正确返回这":"错误返回这");
        
        
        
//JDK12 之后switch的新写法↓
        int aaa=1;
        switch (aaa){
                case 1:
                        System.out.println("这个是老写发");
                        break;
                case 2:
                        System.out.println("这个是老写法拉");
                        break;    
                default:
                        System.out.println("这个是JDK12 之前的写法");
                        break; 
        }
        //新写发//JDK12之前的应该会报错
//         switch (aaa){
//                 case 1 -> {System.out.println("这是新写发，JDK12之后才支持");}
//                 case 2 -> System.out.println("一条语句是可以省略大括号");
//                 default -> System.out.println("这种写发就不用写break了");
//         }
        
// for循环IDEA快捷方法 ： 100.fori  就会生成  for (int i=1;i <= 100;i++) ｛｝

        
        
        
        
    }
}

