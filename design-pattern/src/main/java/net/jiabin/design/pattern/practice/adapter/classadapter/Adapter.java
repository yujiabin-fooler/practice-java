package net.jiabin.design.pattern.practice.adapter.classadapter;

public class Adapter extends Adaptee implements Target{

    public void request() {
        super.specificRequest();
    }

    
}