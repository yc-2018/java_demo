package org.demo.多态;

public class ACtest {
    public static void main(String[] args) {
        AB学生 stu = new AB学生();
        stu.setAge(20);
        stu.setName("小黑子同学");

        AB管理员 admin = new AB管理员();
        admin.setAge(55);
        admin.setName("广利源");

        AB老师 tc = new AB老师();
        tc.setAge(35);
        tc.setName("川建国");

        //同一个方法输出不一样的东东
        testShow(stu);          //学生的信息为:小黑子同学20
        testShow(admin);        //-+管理员的信息为:广利源55
        testShow(tc);           //*老师的信息为:川建国35
    }

    public static void testShow(AA人 ren){
        ren.show();
    }
}
