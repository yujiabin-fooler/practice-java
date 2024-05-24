package net.jiabin.design.pattern.practice.visitor;

public interface GoodsItem {
    public double accept(ShoppingCartVisitor visitor);

    public ShoppingCartVisitor getSelfVisitor();
}
