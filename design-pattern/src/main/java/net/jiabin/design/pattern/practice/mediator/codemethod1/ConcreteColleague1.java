package net.jiabin.design.pattern.practice.mediator.codemethod1;

class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMsg(String message) {
        mediator.send(message, this);
    }

    @Override
    public void notifyMsg(String message) {
        System.out.println("同事1得到消息：" + message);
    }

}