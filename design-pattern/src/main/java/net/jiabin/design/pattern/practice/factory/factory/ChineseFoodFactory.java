package net.jiabin.design.pattern.practice.factory.factory;

public class ChineseFoodFactory implements FoodFactory{
    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            return new ChineseFoodA();
        } else if ("B".equals(name)) {
            return new ChineseFoodB();
        } else {
            return null;
        }

    }
}
