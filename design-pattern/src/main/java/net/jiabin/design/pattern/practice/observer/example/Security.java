package net.jiabin.design.pattern.practice.observer.example;

//具体的观察者
//      保镖
public class Security implements Watcher
{
    @Override
    public void update()
    {
        System.out.println("运输车有行动，保安贴身保护");
    }
}
