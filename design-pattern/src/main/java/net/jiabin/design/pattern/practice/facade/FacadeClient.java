package net.jiabin.design.pattern.practice.facade;

public class FacadeClient {

//    public static void main(String[] args) {
//        // 画一个圆形
//        Shape circle = new Circle();
//        circle.draw();
//
//        // 画一个长方形
//        Shape rectangle = new Rectangle();
//        rectangle.draw();
//    }

    public static void main(String[] args) {

        ShapeMakerFacade shapeMaker = new ShapeMakerFacade();

        // 客户端调用现在更加清晰了
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();

    }


}
