//仰晨study 创建时间2023/2/14 23:43 星期二
package org.demo进阶.xml相关.XML解析技术;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dom4jDemo2 {
    /*
    * 导入xml
    * 封装成对象
    * 模拟登录功能
    * */
    public static void main(String[] args) throws DocumentException {
        //1.创建解析器对象
        SAXReader saxReader = new SAXReader();
        ArrayList<User> users = new ArrayList<User>();
        //2.利用解析器去读取xm1文件，并返回文档对象
        File file = new File("src/org/demo进阶/xml相关/XML解析技术/users.xml");
        Document document = saxReader.read(file);

        //拿到了document表示我已经拿到了xm1文件的整体

        Element rootElement = document.getRootElement();

        List<Element> elements = rootElement.elements();
        for (Element element : elements) {
            String id = element.attributeValue("id");
            String name = element.element("name").getText();
            String password = element.element("password").getText();
            String phoneid = element.element("phoneid").getText();
            boolean admin = Boolean.parseBoolean(element.element("admin").getText());

            User user = new User(id, name, password, phoneid, admin);
            users.add(user);
        }
        System.out.println(users);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String n = sc.nextLine();
        System.out.println("请输入密码");
        String pwd = sc.nextLine();

        int index = getIndex(users,n);
        if (index < 0) {
            System.out.println("账号不存在");
        }else {
            if (users.get(index).getPassword().equals(pwd)) {
                System.out.println("登录成功");
            }else
                System.out.println("密码有误");
        }

    }

    private static int getIndex(ArrayList<User> users, String n) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getName().equals(n)) {
                return i;
            }
        }
        return -1;
    }
}
