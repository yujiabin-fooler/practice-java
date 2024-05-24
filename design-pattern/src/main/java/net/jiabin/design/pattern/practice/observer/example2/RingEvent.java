package net.jiabin.design.pattern.practice.observer.example2;

import java.util.EventObject;

public class RingEvent extends EventObject {
    /**
     * true表示上课铃声
     * false表示下课铃声
     */
    private boolean sound;
    public RingEvent(Object source, boolean sound) {
        super(source);
        this.sound = sound;
    }

    public boolean isSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}


