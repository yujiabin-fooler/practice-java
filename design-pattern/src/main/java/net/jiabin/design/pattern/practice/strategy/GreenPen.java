package net.jiabin.design.pattern.practice.strategy;

public class GreenPen implements Strategy {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("用绿色笔画图，radius:" + radius + ", x:" + x + ", y:" + y);
    }

}
