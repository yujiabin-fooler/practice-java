package net.jiabin.design.pattern.practice.factory.simplefactory;

/**
 * @author admin
 */
public class FoodFactory {


    public static Food makeFood(String name) {
        if ("noodle".equals(name)) {
            Food noodle = new LanZhouNoodle();
            noodle.addSpicy("more");
            return noodle;
        } else if ("chicken".equals(name)) {
            Food chicken = new HuangMenChicken();
            chicken.addCondiment("potato");
            return chicken;
        } else {
            return null;
        }
    }



}
