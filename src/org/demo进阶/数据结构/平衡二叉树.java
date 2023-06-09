package org.demo进阶.数据结构;

public interface 平衡二叉树 extends 二叉查找树 {  //二叉查找树有的规则他都有
    //规则:任意节点左右子树高度差不超过1


    /*超过1就会触发旋转机制
    *   规则1: 左旋
    *   规则2: 右旋
    *   触发时机:当添加一个节点之后，该树不再是一颗平衡二叉树
    *
    *       确定支点:从添加的节点开始，不断的往父节点找不平衡的节点
    *           左旋步骤：
    *               以不平衡的点作为支点
    *               将根节点的右侧往左拉
    *               原先的右子节点变成新的父节点，并把多余的左子节点出让，给已经降级的根节点当右子节点
    *           右旋步骤：
    *               以不平衡的点作为支点
    *               将根节点的左侧往右拉
    *               原先的左子节点变成新的父节点，并把多余的右子节点出让，给已经降级的根节点当左子节点
    * */
    /*需要旋转的四种情况
    *   左左      一次右旋
    *   左右      先局部左旋，再整体右旋            左右:当根节点左子树的右子树有节点插入，导致二叉树不平衡
    *   右右      一次左旋
    *   右左      先局部右旋，再整体左旋
    * * * * * * * * * */
    /*小结
            在平衡二又树中，如何添加节点?          按二叉查找树
            在平衡二又树中，如果查找单个节点?       按二叉查找树   小左大右
            为什么要旋转?                        保持平衡      防止极端情况 像一个但链表 就查找就会很慢
            旋转的触发时机?                      任意节点左右子树高度差超过1
            左左是什么意思?如何旋转?              当根节点左子树的左子树有节点插入，导致二叉树不平衡；一次右旋
            左右是什么意思?如何旋转?
            右右是什么意思?如何旋转?
            右左是什么意思?如何旋转?




    */
}


interface 二叉查找树 {
    //二叉查找树，又称二叉排序树或者二叉搜索树

    /*特点
    每一个节点上最多有两个子节点
    任意节点左子树上的值都小于当前节点
    任意节点右子树上的值都大于当前节点
    */

    /* 添加节点 规则:
    *小的存左边
    *大的存右边
    *一样的不存
    * */
}