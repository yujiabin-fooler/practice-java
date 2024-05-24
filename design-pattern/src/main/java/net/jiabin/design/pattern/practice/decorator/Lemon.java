package net.jiabin.design.pattern.practice.decorator;

public class  Lemon extends Condiment {

    private Beverage beverage;

    // 这里很关键，需要传入具体的饮料，如需要传入没有被装饰的红茶或绿茶，
    // 当然也可以传入已经装饰好的芒果绿茶，这样可以做芒果柠檬绿茶
    public Lemon(Beverage bevarage) {
        this.beverage = bevarage;
    }

    public String getDescription() {
        // 装饰
        return beverage.getDescription() + ", 加柠檬";
    }

    public double cost() {
        // 装饰
        return beverage.cost() + 2; // 加柠檬需要 2 元
    }


}
