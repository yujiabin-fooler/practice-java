package net.jiabin.design.pattern.practice.singleton.innerclass;

public class SingletonObject {


    private SingletonObject(){

    }
    public static SingletonObject getInstance(){
        return InnerClass.HOLDER;
    }

    public static class InnerClass{
        private static final SingletonObject HOLDER = new SingletonObject();
    }


}
