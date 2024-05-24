package net.jiabin.design.pattern.practice.observer.example2;

public class ObserverTestClient {

    public static void main(String[] args){

        BellEventSource bell = new BellEventSource();
        bell.addPersonListener(new TeachEventListener());
        bell.addPersonListener(new StuEventListener());

        bell.ring(true);
        System.out.println("------------------------");

        bell.ring(false);
    }



}
