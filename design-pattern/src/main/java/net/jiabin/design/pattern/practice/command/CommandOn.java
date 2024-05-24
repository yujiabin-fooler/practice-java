package net.jiabin.design.pattern.practice.command;


//开机命令ConcreteCommand
public class CommandOn implements Command {
    private TV myTv;

    public CommandOn(TV tv) {
     myTv = tv;
    }

    public void execute() {
    myTv.turnOn();
    }
}