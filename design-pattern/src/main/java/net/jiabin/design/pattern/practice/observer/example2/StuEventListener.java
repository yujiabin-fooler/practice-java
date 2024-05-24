package net.jiabin.design.pattern.practice.observer.example2;

public class StuEventListener implements BellEventListener {

    @Override
    public void heardBell(RingEvent e) {
        if(e.isSound()){
            System.out.println("同学们，上课了！");
        }else{
            System.out.println("同学们，下课了！");
        }
    }

}

