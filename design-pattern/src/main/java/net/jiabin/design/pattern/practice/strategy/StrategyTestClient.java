package net.jiabin.design.pattern.practice.strategy;

public class StrategyTestClient {


    public static void main(String[] args) {
        Context context = new Context(new BluePen()); // 使用绿色笔来画
        context.executeDraw(10, 0, 0);
    }

    
}
