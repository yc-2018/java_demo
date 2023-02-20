package org.demo进阶.数据结构;/*介绍
红黑树是一种自平衡的二叉查找树，是计算机科学中用到的一种数据结构。
1972年出现，当时被称之为平衡二叉B树。后来，1978年被修改为如今的"红黑树"
它是一种特殊的二叉查找树，红黑树的每一个节点上都有存储位表示节点的颜色
每一个节点可以是红或者黑，红黑树不是高度平衡的，它的平衡是通过”红黑规则"进行实现的*/

/*平衡二叉树:                                    红黑树:

*高度平衡                                       是一个二叉查找树:
*当左右子树高度差超过1时，通过旋转保持平衡            但是不是高度平衡的
*                                              条件: 特有的红黑规则
* *///红黑树----默认颜色:添加节点默认是红色的(效率高)
public interface 红黑树 extends 二叉查找树{
    //简单规则--------------------------------------------------------
        // 1、每一个节点是红色的，或者是黑色的
        // 2、根节点必须是黑色
        // 3、叶节点是黑色的
        // 4、两个红色节点不能相连
        // 5、任意节点到所有后代叶节点的简单路径上，黑色节点数量相同;
    //------------------------------------------------------------
    /*添加节点的规则

    *根--------------------------直接变为黑色

         ————  父黑色-----------则不需要任何操作
        |
        |
        |                        __将“父”设为黑色，将“叔叔”设为黑色
    *非根                       /__将“祖父”设为“红色”
        |                     /
        |          /———叔叔红色
        |         /           \___如果祖父为根，再将根变回黑色
        |        /             \__如果祖父非根，将祖父设置为当前节点再进行其他判断
        |       /
         ———— 父红色———— 叔叔黑色（当前节点是父的右孩子）-------把父作为当前节点并左旋，再进行判断
               \
                \                                     ___将“父”设为“黑色
                 \                                  /
                  \———— 叔叔黑色（当前节点是父的左孩子）——————将“祖父”变为“红色“
                                                    \____
                                                         以祖父为支点进行右旋
    * */

    /*小结
    *    红黑树不是高度平衡的，它的平衡是通过"红黑规则"进行实现的
    *
    *   规则如下:
    *           1、每一个节点或是红色的，或者是黑色的
    *           2、根节点必须是黑色
    *           3、如果一个节点没有子节点或者父节点，则该节点相应的指针属性值为NL，这些Nil视为叶节点，每个叶节点(NiU)是黑色的
    *           4、不能出现两个红色节点相连的情况
    *           5、对每一个节点，从该节点到其所有后代叶节点的简单路径上，均包含相同数目的黑色节点
    *
    * 红黑树增删改查的性能都很好
    * */
}
