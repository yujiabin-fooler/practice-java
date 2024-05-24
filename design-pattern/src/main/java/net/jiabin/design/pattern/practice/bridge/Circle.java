package net.jiabin.design.pattern.practice.bridge;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    public void draw() {
        drawAPI.draw(radius, 0, 0);
    }
    
}