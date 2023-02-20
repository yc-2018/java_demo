package org.demo.继承和重写;

public class XC子子类 extends XB子类的构造函数{
    private int cm;

    public XC子子类() {}

    public XC子子类(String name, int age, double kg, int cm) {
        super(name, age, kg);
        this.cm = cm;
    }



    /**
     * 获取
     * @return cm
     */
    public int getCm() {
        return cm;
    }

    /**
     * 设置
     * @param cm
     */
    public void setCm(int cm) {
        this.cm = cm;
    }

}
