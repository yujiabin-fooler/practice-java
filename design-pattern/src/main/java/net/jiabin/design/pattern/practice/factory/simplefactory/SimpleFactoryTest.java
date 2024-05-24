package net.jiabin.design.pattern.practice.factory.simplefactory;

public class SimpleFactoryTest {


    public static void main(String[] args) {
        Food food = FoodFactory.makeFood("noodle");
        System.out.println(food);
    }

}
