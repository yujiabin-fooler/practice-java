package net.jiabin.design.pattern.practice.visitor;

public class Milk implements GoodsItem {

    private String brand;
    private double price;
    private int number;

    public int getNumber() {
        return number;
    }

    public Milk(String brand, double price, int number) {
        this.brand = brand;
        this.price = price;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visitor(this);
    }

    @Override
    public ShoppingCartVisitor getSelfVisitor() {
        return new MilkVisitor();
    }
}
