//仰晨study 创建时间2023/2/15 3:21 星期三
package org.demo进阶.xml相关.XML检索技术;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class XPathDemo {
    public static void main(String[] args) throws DocumentException {
        //需要创建解析器对象
        SAXReader saxReader = new SAXReader();
        //利用解析器，去读取本地的xm1文件
        Document document = saxReader.read(new File("src/org/demo进阶/xml相关/XML检索技术/Demo数据.xml"));

        //获取到一个文档对象
        //然后就可以利用xpath方式来进行快速检索
        //两个方法:
        //1.检索单个 document.selectSingleNode("路径”)
        //2.检索多个 document.selectNodes("路径")

        System.out.println("——————————————拿一个 多个默认第一个——————————————绝对路径");
        Node node = document.selectSingleNode("/书架/书"); //拿一个 多个默认第一个   没有就返回null
        System.out.println(node.getName());

        System.out.println("\n——————————————符合都拿——————————————绝对路径");
        List<Node> nodes = document.selectNodes("/书架/书/书名");

        nodes.stream().map(Node::getText).forEach(System.out::println);



        System.out.println("\n——————————————拿一个 多个默认第一个——————————————相对路径");
        // 利用相对路径进行检索
        // 参照物: 自己本身
        Node node1 = document.selectSingleNode("./书架/书"); //拿一个 多个默认第一个   没有就返回null
        System.out.println(node1.getName());
        //符合都拿 略


        System.out.println("\n——————————————全局找书名——————————————");
        List<Node> arr = document.selectNodes("//书名");
        arr.stream().map(Node::getText).forEach(System.out::println);

        System.out.println("\n——————————————全局找书下面的书名——————————————");
        List<Node> arr1 = document.selectNodes("//书/书名");
        arr1.stream().map(Node::getText).forEach(System.out::println);
        //总结:
        //路径里面如果只有一个/表示，单级的路径
        //路径里面如果有//表示，单级的可以，多级的也可以

        System.out.println("\n——————————————全局找属性名——————————————");
        List<Node> findID = document.selectNodes("//@id");
        findID.stream().map(Node::getText).forEach(System.out::println);

        System.out.println("\n——————————————全局找包涵某属性名的标签——————————————");
        List<Node> findTag = document.selectNodes("//书名[@id]");
        findTag.stream().map(Node::getText).forEach(System.out::println);

        System.out.println("\n——————————————全局找包涵某属性名且值也一样的标签——————————————");
        List<Node> isIDTag = document.selectNodes("//书名[@id='4']");
        isIDTag.stream().map(Node::getText).forEach(System.out::println);
    }
}
