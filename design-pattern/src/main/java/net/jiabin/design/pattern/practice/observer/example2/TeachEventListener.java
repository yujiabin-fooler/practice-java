package net.jiabin.design.pattern.practice.observer.example2;

public class TeachEventListener implements BellEventListener {
    @Override
    public void heardBell(RingEvent e) {
        if(e.isSound()){
            System.out.println("老师上课了！");
        }else{
            System.out.println("老师下课了！");
        }
    }
}
