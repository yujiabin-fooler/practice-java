package net.jiabin.design.pattern.practice.chainofresponsibility.nodesignpattern;

public class Study {

    public void study(PrepareObjects prepareObjects) {
        if (prepareObjects.isWashHair()) {
            System.out.println("洗脸");
        }
        if (prepareObjects.isWashHair()) {
            System.out.println("洗头");
        }
        if (prepareObjects.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }

        System.out.println("我可以去上学了！");
    }

}