package org.demo;
//javap是jdk的官方反编译工具   在cmd中         java class文件.class    就能看到源代码
//插件PTG             1秒生成标准javabean
//插件any-rule       右键看正则例子 超多
        //面向对象驼峰命名

public class 快捷键 {
    //代码.sout    自动打印语句包裹
    //选择一坨代码 然后按 Ctrl+Alt+T 可以选择用循环 或判定 或 测试 或其他的对选择的代码包裹起来
    //Ctrl+F查找
    //Ctrl+R替换
    //alt+7  本java文件方法大纲        Ctrl+F12也是可以的
    //选中然后//ctrl + alt + M 自动抽取方法/////////////////////////////
    //选中然后//shift+F6重构名字///////////////////////////////
    // for循环IDEA快捷方法 ： 100.fori  就会生成  for (int i=1;i <= 100;i++) ｛｝   数组.fori  条件就会变成数组长度
//                鼠标中键按住不松可以竖向选中   或者按住alt也是可以的

//                get 和set 方法可以按alt+insert 设置

//                shift+F4可以调出一个新窗口写当前代码

//不知道括号能填什么  可以按Ctrl+p 会有提示

//    按Ctrl+Alt+V重新分配现有变量   就是先写等号右边  按了  就自动生成等号左边

//    双击选中 Ctrl+B  看底层源码

//    Ctrl+N查找类文件等

//    Alt+回车 智能提示改变代码  Ctrl+Q预览

//      Ctrl+F12 查看这个类的全部方法
//                  (蓝色C=类名
//                  (粉红色M=方法（和类名相同就是构造方法）
//                  (黄色f=属性
//                  (绿色I=接口
//                  (----有↑ 就表示父类或接口里面重写的方法）（→表示继承的方法）----

    //Ctrl+Shift+U变量名大小写转换
    public static void main(String[] args) {
        System.out.println("this的本质: 所在方法调用者的地址值" +
                "API(应用程序编程接口):应用程序编程接口简单理解:API就是别人已经写好的东西，我们不需要自己编写，直接使用即可"
                    /*      Ctrl + H看类的层次结构

                    影伴人久i:
                    在 new 关键字后面使用类型匹配补全 Ctrl+Shift+空格 ，可以实例化预期类型的对象
                    影伴人久i:
                    代码补全 Ctrl+空格 可以帮助快速补全代码语句。它会在您输入时运行，并提供当前文本光标位置处可用的建议列表:
                    影伴人久i:
                    按 F2 或 Shift+F2 可以分别跳转到当前文件中的下一个或上一个错误
                    影伴人久i:
                    要在编辑器中打开文件的特定行，请按 Ctrl+Shift+N (导航 | 文件 )，开始输入文件名，从建议列表中选择，然后输入 : ，后面跟随行号。
                    影伴人久i:
                    按两次 Shift 打开 随处搜索 弹出窗口。
                    影伴人久i:
                    在声明变量时，代码补全可以提供名称建议。例如，开始输入 private FileOutputStream 并按 Ctrl+空格。
                    影伴人久i:
                    如果不喜欢代码的颜色，请按 Ctrl+Shift+A ，输入 Jump ，然后点击 跳转到颜色和字体 。您将转到设置页面，从中可以修改文本光标处代码元素的颜色
                    影伴人久i:
                    要将两行合并为一行并移除不必要的空格，请按 Ctrl+Shift+J。
                    */
        );
    }
}

/**插件-----------------------------------
 *AceJump：抛弃鼠标必备的插件
 *
 * Easy Code：代码生成工具，可以生成 Controller和 Service，还有前端页面代码，
              使用教程：https://gitee.com/makejava/EasyCode/wikis/pages?sort_id=725164&doc_id=166248
 *
 *Translation：中译英插件，对于英语不太好的童鞋来说会比较实用(你不需要再打开一个英语词典软件)
 *
 *GitToolBox:一款git工具插件，它支持在项目上提示你还有多少文件没提交，远程还有多少文件没更新下来。还能在每一行代码上提示上次提交的时间。
 *
 *Search In Repository：直接在idea中搜索某个Maven依赖，再也不用打开浏览器去搜索某个Maven依赖的<dependcy>怎么写了
 *
 *Code Iris：可以将你项目的模块、包、类进行可视化
 *
 *Extra Icons：为IDEA添加额外的图标文件
 *
 *Easy JavaDoc：更便捷的为Java类、属性、函数添加中文注释
 *
 *eetCode Editor：LeetCode刷题插件
 *
 *
 *
 * */