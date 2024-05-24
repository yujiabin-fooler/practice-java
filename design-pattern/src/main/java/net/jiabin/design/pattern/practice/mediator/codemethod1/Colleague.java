package net.jiabin.design.pattern.practice.mediator.codemethod1;

/**
 * 抽象同事类
 *
 * @author liu yuning
 *
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMsg(String message);

    public abstract void notifyMsg(String message);

}

