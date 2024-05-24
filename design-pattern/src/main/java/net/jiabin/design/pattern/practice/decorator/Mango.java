package net.jiabin.design.pattern.practice.decorator;

public class Mango extends Condiment {
    private Beverage beverage;
    public Mango(Beverage bevarage) {
        this.beverage = bevarage;
    }
    public String getDescription() {
        return beverage.getDescription() + ", 加芒果";
    }
    public double cost() {
        return beverage.cost() + 3; // 加芒果需要 3 元
    }
}
