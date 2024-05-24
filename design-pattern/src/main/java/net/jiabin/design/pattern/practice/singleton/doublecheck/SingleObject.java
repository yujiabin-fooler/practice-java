package net.jiabin.design.pattern.practice.singleton.doublecheck;

public class SingleObject {

    private SingleObject(){

    }
    private volatile static SingleObject lazySingle;

    //双重检查加锁
    public static SingleObject getInstance(){
        if (lazySingle == null ){
            synchronized (SingleObject.class){
                if (lazySingle == null ) {
                    lazySingle = new SingleObject();
                }
            }
        }
        return lazySingle;
    }


}
