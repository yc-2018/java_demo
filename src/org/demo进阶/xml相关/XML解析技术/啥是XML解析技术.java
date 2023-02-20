//仰晨study 创建时间2023/2/14 21:10 星期二
package org.demo进阶.xml相关.XML解析技术;

public interface 啥是XML解析技术 {/*
XML的数据的作用是什么，最终需要怎么处理？
    ·存储数据、做配置信息、进行数据传输。
    ·最终需要被程序进行读取，解析里面的信息。

什么是XML解析
    ·使用程序读取XML中的数据
两种解析方式
·SAX解析
·DOM解析

SAX和DOM的优缺点
    SAX:不会把整体的xml文件都加载到内存，而是从上往下逐行进行扫描
        缺点:只能读取，不能添加，不能删除。
        优点:因为他是逐行扫描不需要把整体的xml文件都加载到内存，所以他可以解析比较大的xml文件。     (基本不用，xml基本很小

    DOM:会把整体的xml文件都加载到内存
    会把这个整体在内存中形成一个树形结构，我们可以通过这个树形结构去解析xml文件。
        优点:可以读取，可以添加，可以删除，可以做任何事情。
        缺点:需要xml文件全部加载到内存，所以不能解析非常大的xml文件

Dom常见 的 解析工具

名称	            说明
JAXP	SUN公司提供的一套XML的解析的API
JDOM	JDOM是一个开源项目，它基于树型结构，利用纯JAVA的技术对XML文档实现解析、生成、序列化以及多种操作。
dom4j	是JDOM的升级品，用来读写XML文件的。具有性能优异、功能强大和极其易使用的特点，
        它的性能超过sun公司官方的dom 技术，同时它也是一个开放源代码的软件，Hibernate(对象关系映射（ORM）框架)也用它来读写配置文件。
jsoup	功能强大DOM方式的XML解析开发包，尤其对HTML解析更加方便


———————————————————————————————————————————
<?xml version="1.0" encoding="UTF-8" ?>         Document
<students>                                          ↓
    <!--第一个学生信息-->                         students
    <student id="1">                           ↙       ↘
        <name>张三</name>                student           student
        <age>23</age>                 ↙   ↓   ↘           ↙   ↓   ↘
    </student>                       id name  age        id name  age
    <!--第二个学生信息-->               ↓   ↓     ↓         ↓   ↓     ↓
    <student id="2">                  1  张三   23        1  李四   24
        <name>李四</name>
        <age>24</age>
    </student>
</students>
                        Dom解析的文档对象模型是怎么样的

                        Document对象：整个xml文档
                        Element对象：标签----------\
                        Attribute对象：属性-------Node对象
                        Text对象：文本内容----------/

                        Dom解析常用技术框架
                            ·Dom4J

————————————————————————————————————————————————————————————————————————————————



*/

}
