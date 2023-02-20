package org.demo.常用API;

public class 自幂数 {
    /*  举例1:三位数1^3+5^3+3^3=153
        举例2:四位数1^4+6^4+3^4+4^3=1634
  如果自幂数是一位数，也叫做: 独身数
            三位自幂数:水仙花数
            四位自幂数:四叶玫瑰数
            五位自幂数:五角星数
            六位自幂数:六合数
            七位自幂数:北斗七星数
            八位自幂数:八仙数
            九位自幂数:九九重阳数
            十位自幂数:十全十美数
    */
    public static void main(String[] args) {

        水仙花数();

//        四叶玫瑰数();

//        五角星数();
    }

    private static void 五角星数() {
        int count = 0;
        for (int number=10000;number<=99999;number++) {
            int ge = number % 10;
            int shi = number / 10 % 10;
            int bai = number / 100 % 10;
            int qian = number / 1000 % 10;
            int wan = number / 10000 % 10;
            if (Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5)+Math.pow(qian,5)+Math.pow(wan,5) == number) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println("总共有" + count);
    }

    private static void 四叶玫瑰数() {
        int count = 0;
        for (int number=1000;number<=9999;number++) {
            int ge = number % 10;
            int shi = number / 10 % 10;
            int bai = number / 100 % 10;
            int qian = number / 1000 % 10;
            if (Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4)+Math.pow(qian,4) == number) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println("总共有" + count);
    }


    public static void 水仙花数(){
        int count = 0;
        for (int number=100;number<=999;number++) {
            int ge = number % 10;
            int shi = number / 10 % 10;
            int bai = number / 100 % 10;
            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == number) {
                System.out.println(number);
                count++;
            }
        }
        System.out.println("总共有" + count);
    }
}
