//仰晨study 创建时间2023/2/13 14:37 星期一
package org.demo进阶.log日志;

public interface 啥日志 {/*
用来记录程序运行过程中的信息，并可以进行永久存储。
好比生活中的日记可以记录你生活的点点滴滴。


输出语句的弊端
`信息展示在控制台
`不能方便的将其记录到其他的位置(文件，数据库)
`想取消记录的信息需要修改代码才可以完成

日志技术应该具备哪些特点和优势
可以将系统执行的信息，方便地记录到指定的位置(控制台、文件中、数据库中)。
可以随时以开关的形式控制是日志的记录和取消，无需侵入到源代码中去进行修改。


输出语句存在的问题，日志技术应该具备哪些特点和优势?
             ---输出语句---                     ---日志技术---
输出位置        输出到控制台                       可以将日志信息写入到文件或者数据库中
取消日志        需要修改代码，灵活性比较差           不需要修改代码，灵活性比较好
多线程          性能较差                          性能较好


日志规范接口
Commons Logging
简称: JCL

Simple Logging Facade for Java
简称:slf4j

日志规范:一些接口，提供给日志的实现框架设计的标准



//作用: 把一些信息永久的保存到本地文件
//方法起的见名知意:
//infoToFile
//以前: 有一个程序员，偷懒info2File
//这种习惯就保留下来了
//To : 2
//For: 4
//读: 2 To  4 For


总结
日志的规范是什么，常见的有几种形式
    日志规范大多是一些接口，提供给实现框架去设计的0
    常见的规范是:
    Commons Logging
    Simple Logging Facade for Java
日志的实现框架有哪些常见的?
    Log4J
    Logback(我们重点学习的，其他的都大同小异)



________________

Logback日志框架
Logback是基于slf4j的日志规范实现的框架，性能比之前使用的log4j要好。
官方网站:
https://logback.qos.ch/index.html

Logback主要分为三个技术模块:
logback-core: 该模块为其他两个模块提供基础代码，必须有
logback-classic: 完整实现了slf4j API的模块。
logback-access 模块与 Tomcat和Jetty等 Servlet 容器集成，以提供 HTTP 访问日志功能

总结
使用Logback需要使用哪几个模块，各自的作用是什么
slf4j-api:日志规范
logback-core:基础模块
logback-classic:功能模块，它完整实现了slf4j API

------------------------------
Logback快速入门
需求:导入Logback日志技术到项目中，用于纪录系统的日志信息分析:
1、在项目下新建文件夹lib，导入Logback的相关jar包到该文件夹下，并添加到项目依赖库中去。
2、将Logback的核心配置文件logback.xml直接拷贝到src目录下 (必须是src下)。
3、在代码中获取日志的对象
    public static final Logger LOGGER= LoggerFactory.getLogger("类对象");
4、使用日志对象的方法记录系统的日志信息。


————————————————————————————————————————
日志级别
级别程度依次是:TRACE< DEBUG<INFO<WARN<ERROR;默认级别是debug(忽略大小写)，对应其方法。

作用: 用于控制系统中哪些日志级别是可以输出的，只输出级别不低于设定级别的日志信息,
ALL 和OFF分别是打开全部日志信息，及关闭全部日志信息。

具体在<root level=“INFO”>标签的level属性中设置日志级别---不写默认就是debug  ----或者写ALL 或 OFF
    <root level=“INFO">
        <appender-ref ref="CONSOLE"/>
        <appender-ref ref="FILE"/>
    </root>


Logback日志系统的特性都是通过核心配置文件logback.xml控制的。
Logback日志输出位置、格式设置:
·通过logback.xml中的<append>标签可以设置输出位置和日志信息的详细格式
·通常可以设置2个日志输出位置:一个是控制台、一个是系统文件中
    输出到控制台的配置标志
    <appender name="CONSOLE” class="ch.qos.logback.core.ConsoleAppender">
    输出到系统文件的配置标志
    <appender name="FILE”class="ch.qos.logback.core.rolling.RollingFileAppender">
*/

}
