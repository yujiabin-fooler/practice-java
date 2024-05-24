package net.jiabin.design.pattern.practice.observer.example2;

import java.util.EventListener;

public interface BellEventListener  extends EventListener {
    void heardBell(RingEvent e);
}