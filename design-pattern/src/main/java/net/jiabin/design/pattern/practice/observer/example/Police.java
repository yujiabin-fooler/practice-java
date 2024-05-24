package net.jiabin.design.pattern.practice.observer.example;

//警察
public class Police implements Watcher
{
    @Override
    public void update()
    {
        System.out.println("运输车有行动，警察护航");
    }
}
