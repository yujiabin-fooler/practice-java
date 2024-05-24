package net.jiabin.design.pattern.practice.composite.safeway;

//leaf
public class Goods implements  Articles{

    private String name;

    /**
     * 数量
     */
    private int quantity;

    /**
     * 单价
     */
    private float unitPrice;


    public Goods(String name, int quantity, float unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    @Override
    public float calculation() {
        return quantity*unitPrice;
    }

    @Override
    public void show() {
        System.out.println(name+"(数量："+quantity+"，单价："+unitPrice+"元)");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

}
