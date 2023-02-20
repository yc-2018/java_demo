//仰晨study 创建时间2023/2/15 16:48 星期三
package org.demo进阶.注解;

public interface 啥是注解 {/*
什么是注解
    ·Annotation表示注解。是JDK1.5的新特性
    ·注解的主要作用:对我们的程序进行标注。通过注解可以给类增加额外的信息。
    ·注解是给编译器或JVM看的，编译器或JVM可以根据注解来完成对应的功能。

    Java 语言中的类、构造器、方法、成员变量、参数等都可以被注解进行标注。

注解的作用
    对Java中类、方法、成员变量做标记，然后进行特殊处理。
    例如：JUnit框架中，标记了注解@Test的方法就可以被当成测试方法执行，而没有标记的就不能当成测试方法执行


Java中已经存在的注解 (掌握)
    @Override: 表示方法的重写
    @Deprecated: 表示修饰的方法已过时
    @SuppressWarnings("all"): 压制警告


自定义注解 (了解)
    使用自定义注解格式
    public @interface 注解名称 {
        public 属性类型 属性名() default 默认值 ;
    }
    属性类型支持：基本数据类型、String、Class、注解、枚举、以上的类型的一维数组

    自定义注解单独存在是没有什么意义的，一般会跟反射结合起来使用，会用发射去解析注解.
    针对于注解，只要掌握会使用别人已经写好的注解即可。
    关于注解的解析，一般是在框架的底层已经写好了

    使用自定义注解格式
    @注解名(属性名1=值1,属性名2=值2)


特殊属性 (掌握)
value :
    当注解中只有"一个属性”,并且属性名必须是"value”,使用注解时,可以省略value属性名   (实践证明 有其他值也可以，但是其他值必须有默认值)


元注解:注解注解的注解。(写在注解上面的注解
元注解有两个：
    @Target: 约束自定义注解只能在哪些地方使用 (约束自定义注解可以标记的范围
    @Retention：申明注解的生命周期          (约束自定义注解的存活范围

        @Target中可使用的值定义在ElementType枚举类中，常用值如下
             TYPE，类，接口
             FIELD, 成员变量
             METHOD, 成员方法
             PARAMETER, 方法参数
             CONSTRUCTOR, 构造器
             LOCAL_VARIABLE, 局部变量
        @Retention中可使用的值定义在RetentionPolicy枚举类中，常用值如下
            SOURCE： 注解只作用在源码阶段，生成的字节码文件中不存在
            CLASS：  注解作用在源码阶段，字节码文件阶段，运行阶段不存在，默认值.
            RUNTIME：注解作用在源码阶段，字节码文件阶段，运行阶段（开发常用）


注解的解析——————————————————————————————————————————————————————————————————————————
注解的操作中经常需要进行解析，注解的解析就是判断是否存在注解，存在注解就解析出内容。
与注解解析相关的接口
    Annotation: 注解的顶级接口，注解都是Annotation类型的对象
    AnnotatedElement:该接口定义了与注解解析相关的解析方法

                 方法	                                                         说明
Annotation[] getDeclaredAnnotations()	                            获得当前对象上使用的所有注解，返回注解数组。
T getDeclaredAnnotation(Class<T> annotationClass)	                根据注解类型获得对应注解对象
boolean isAnnotationPresent(Class<Annotation> annotationClass)	    判断当前对象是否使用了指定的注解，如果使用了则返回true，否则false

所有的类成分Class, Method , Field , Constructor，都实现了AnnotatedElement接口他们都拥有解析注解的能力：

解析注解的技巧
    ·注解在哪个成分上，我们就先拿哪个成分对象。
    ·比如注解作用成员方法，则要获得该成员方法对应的Method对象，再来拿上面的注解
    ·比如注解作用在类上，则要该类的Class对象，再来拿上面的注解
    ·比如注解作用在成员变量上，则要获得该成员变量对应的Field对象，再来拿上面的注解

注解解析的方式
                     方法
    Annotation[] getDeclaredAnnotations()
    T getDeclaredAnnotation(Class<T> annotationClass)
    boolean isAnnotationPresent(Class<Annotation> annotationClass)






*/

}

//chatGPT：
/**@SuppressWarnings()   举出可以填的所有值
1. "all"：忽略所有警告
2. "boxing"：忽略所有关于装箱和拆箱的警告
3. "cast"：忽略所有关于类型转换的警告
4. "deprecation"：忽略所有关于使用过时 API 的警告
5. "fallthrough"：忽略所有关于 switch 语句中的“fall-through”情况的警告
6. "finally"：忽略所有关于 finally 块不能正常完成的警告
7. "hiding"：忽略所有关于局部变量隐藏类成员的警告
8. "incomplete-switch"：忽略所有关于 switch 语句没有包含所有情况的警告
9. "nls"：忽略所有关于非本地化的警告
10. "null"：忽略所有关于空指针的警告
11. "rawtypes"：忽略所有关于使用原始类型的警告
12. "restriction"：忽略所有关于限制检查的警告
13. "serial"：忽略所有关于可序列化类缺少 serialVersionUID 定义的警告
14. "static-access"：忽略所有关于静态成员访问的警告
15. "synthetic-access"：忽略所有关于合成方法访问的警告
16. "unchecked"：忽略所有关于未检查的警告
17. "unqualified-field-access"：忽略所有关于字段访问没有使用完全限定名称的警告
18. "unused"：忽略所有关于未使用代码的警告
*/
/*javaBean的get set方法怎么用注解生成

使用Lombok注解，可以自动生成get set方法，只需要在类上添加@Data注解即可，如下：

@Data
public class User {
    private String name;
    private int age;
}

 */