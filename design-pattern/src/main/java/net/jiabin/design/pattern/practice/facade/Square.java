package net.jiabin.design.pattern.practice.facade;

public class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }

}
