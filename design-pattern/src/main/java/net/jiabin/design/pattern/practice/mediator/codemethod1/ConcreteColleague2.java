package net.jiabin.design.pattern.practice.mediator.codemethod1;

class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("同事2得到消息：" + message);
    }

}
