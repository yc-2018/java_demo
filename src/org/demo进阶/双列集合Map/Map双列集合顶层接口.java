package org.demo进阶.双列集合Map;//叫    键值对  or 键值对对象   or   Entry
/*双列集合的特点
*1)双列集合一次需要存一对数据，分别为键和值
*2)键不能重复，值可以重复
*3)键和值是一一对应的，每一个键只能找到自己对应的值
*4)键+值这个整体 我们称之为“键值对”或者“键值对对象”在Java中叫做“Entry对象”
* *********************************************************************************//*
                Map____________
              /     \           \
          HashMap  TreeMap      Hashtable(io相关)
           /                        \
    LinkedHashMap                 Properties(重点:有一些特有的方法，可以把集合中的数据，按照键值对的形式写到配置文件当中。
                                                 也可以把配置文件中的数据，读取到集合中来。后缀名: properties
                                             细节:虽然我们可以往Properties当中添加任意的数据类型，
                                                  但是一般只会往里面添加字符串类型的数据
                                                  properties.store(输出流,"相当于放到文件的注释") ;

                                                  properties.load(输入流);

************************************************************************************//*
Map的常见API
    Map是双列集合的顶层接口，它的功能是全部双列集合都可以继承使用的
        方法名称                                    说明
  V put(K key,V value)                          添加元素
  V remove(Object key)                          根据键删除键值对元素
  void clear()                                  移除所有的键值对元素
  boolean containsKey(object key)               判断集合是否包含指定的键
  boolean containsValue(object value)           判断集合是否包含指定的值
  boolean isEmpty()                             判断集合是否为空
  int size()                                    集合的长度，也就是集合中键值对的个数
***************************************************************************************/
import java.util.HashMap;
import java.util.Map;

public interface  Map双列集合顶层接口 {
    public static void main(String[] args) {
        //通过多态创建Map集合对象
        Map<String, String> m = new HashMap<>();

        //添加元素////////////////////////////////////////////////////////////////////////////////////
            // put方法的细节:
            // 添加/覆盖
            // 在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中,方法返回nu11
            // 在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        System.out.println(m.put("鸡", "只因"));   //null
                           m.put("树枝","素质");
                           m.put("荔枝","理智");
                           m.put("油饼","有病");
        System.out.println(m.put("鸡", "知音"));   //只因
        //打印集合
        System.out.println(m);//{鸡=只因, 树枝=素质, 荔枝=理智, 油饼=有病}

        System.out.println("----------删除元素------------------------");
        String result = m.remove("鸡");  //返回value
        System.out.println(result);
        //boolean remove = m.remove("油饼", "有病");//返回结果
        //System.out.println(remove);


        //System.out.println("-----------清空元素--------------------");
        //m.clear();
        //System.out.println(m);

        System.out.println("----判断是否包含-------------------------");
        //键
        boolean keyResult = m.containsKey("鸡");
        System.out.println(keyResult);

        //值
        System.out.println(m.containsValue("素质"));


        System.out.println("--------------集合是否为空-----------------");
        System.out.println(m.isEmpty());


        System.out.println("------------集合长度-----------------------");
        System.out.println(m.size());


        System.out.println(m);
    }
}
