package net.jiabin.design.pattern.practice.bridge;

public class BridgeClient {

    public static void main(String[] args) {

        Shape greenCircle = new Circle(10, new GreenPen());
        Shape redRectangle = new Rectangle(4, 8, new RedPen());
        greenCircle.draw();
        redRectangle.draw();

    }

}
