package net.jiabin.design.pattern.practice.adapter.objectadapter;

public class ConcreteTarget implements Target {

    public void request() {
        System.out.println("普通类 具有 普通功能...");
    }
    
}