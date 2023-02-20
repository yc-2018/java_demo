package org.demo.常用API.时间相关;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 时间练习 {
    public static void main(String[] args) throws ParseException {
        /*活动时间为2023年11月11日 0:0:0--0：10：0
          小贾下单并付款的时间为: 2023年11月11日 0:01:0
          小皮下单并付款的时间为: 2023年11月11日 0:11:0
          用代码说明这两位同学有没有参加上秒杀活动?*/

        String 活动开始时间串 = "2023年11月11日 0:0:0";
        String 活动结束时间串 = "2023年11月11日 0:10:0";
        String 小贾下单时间串 = "2023年11月11日 0:01:0";
        String 小皮下单时间串 = "2023年11月11日 0:11:0";

        //解析上面三个时间 得到date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date 活动开始时间 = sdf.parse(活动开始时间串);
        Date 活动结束时间 = sdf.parse(活动结束时间串);
        Date 小贾下单时间 = sdf.parse(小贾下单时间串);
        Date 小皮下单时间 = sdf.parse(小皮下单时间串);

        //获取三个时间的毫秒值
        long 活动开始时间Time = 活动开始时间.getTime();
        long 活动结束时间Time = 活动结束时间.getTime();
        long 小贾下单时间Time = 小贾下单时间.getTime();
        long 小皮下单时间Time = 小皮下单时间.getTime();

        //判断
        if (小贾下单时间Time >= 活动开始时间Time && 小贾下单时间Time <= 活动结束时间Time) {
            System.out.println("小贾参加活动成功");
        }else {
            System.out.println("小贾参加活动失败");
        }
        //判断
        if (小皮下单时间Time >= 活动开始时间Time && 小皮下单时间Time <= 活动结束时间Time) {
            System.out.println("小皮参加活动成功");
        }else {
            System.out.println("小皮参加活动失败");
        }
    }
}
