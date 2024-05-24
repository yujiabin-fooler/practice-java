package net.jiabin.design.pattern.practice.observer.example2;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 目标类：事件源，铃
 */
class BellEventSource{
    private List<BellEventListener> listenter;
    public BellEventSource(){
        listenter = new ArrayList<>();
    }
    public void addPersonListener(BellEventListener ren){
        listenter.add(ren);
    }
    public void ring(boolean sound){
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);
    }
    protected void notifies(RingEvent e){
        BellEventListener ren = null;
        Iterator<BellEventListener> iterator = listenter.iterator();
        while(iterator.hasNext()){
            ren = iterator.next();
            ren.heardBell(e);
        }
    }
}



