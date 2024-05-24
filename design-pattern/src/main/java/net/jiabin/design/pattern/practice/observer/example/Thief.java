package net.jiabin.design.pattern.practice.observer.example;

//小偷
public class Thief implements Watcher
{
    @Override
    public void update()
    {
        System.out.println("运输车有行动，强盗准备动手");
    }
}
