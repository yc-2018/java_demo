//仰晨study 创建时间2023/2/14 22:09 星期二
package org.demo进阶.xml相关.XML解析技术;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Dom4jDemo1 {/*
Dom4j解析XML-得到Document对象
...................SAXReader类
    构造器/方法	                  说明
public SAXReader() 	        创建Dom4J的解析器对象
Document read(String url)	加载XML文件成为Document对象

...................Document类
        方法名	              说明
Element getRootElement() 	获得根元素对象



Dom4j解析XML的元素、属性、文本
            方法名	                                说明
    List<Element> elements()	            得到当前元素下所有子元素
    List<Element> elements(String name)	    得到当前元素下指定名字的子元素返回集合
    Element element(String name)	        得到当前元素下指定名字的子元素,如果有很多名字相同的返回第一个
    String getName()	                    得到元素名字
    String attributeValue(String name)	    通过属性名直接得到属性值
    String elementText(子元素名)	            得到指定名称的子元素的文本
    String getText()	                    得到文本
 */
    public static void main(String[] args) throws DocumentException {
        //1.创建解析器对象
        SAXReader saxReader = new SAXReader();
        //2.利用解析器去读取xm1文件，并返回文档对象
        File file = new File("src/org/demo进阶/xml相关/xml简单练习.xml");
        Document document = saxReader.read(file);

        //拿到了document表示我已经拿到了xm1文件的整体
        //下面一层一层的扒开获取里面的内容即可

        Element rootElement = document.getRootElement();



        List<Element> elements = rootElement.elements();

        //elements.forEach(System.out::println);

        for (Element element : elements) {

            System.out.println("当前在标签："+element.getName());
            Element name = element.element("name");
            Element age = element.element("age");

            System.out.println("他的子标签有"+name.getName()+"="+name.getText()+" 和 "+age.getName()+"="+age.getText());

            System.out.println("name的ID属性值："+name.attributeValue("id"));
        }

    }
}
