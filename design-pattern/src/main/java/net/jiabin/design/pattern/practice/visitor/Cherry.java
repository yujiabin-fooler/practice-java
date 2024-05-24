package net.jiabin.design.pattern.practice.visitor;

public class Cherry implements GoodsItem {

    private double price;

    private int weight;

    public double getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public Cherry(double price, int weight) {
        this.price = price;
        this.weight = weight;
    }

    @Override
    public double accept(ShoppingCartVisitor visitor) {
        return visitor.visitor(this);
    }

    @Override
    public ShoppingCartVisitor getSelfVisitor() {
        return new CherryVisitor();
    }
}