package net.jiabin.design.pattern.practice.command;


//关机命令ConcreteCommand
public class CommandOff implements Command {
    private TV myTv;

    public CommandOff(TV tv) {
      myTv = tv;
    }

    public void execute() {
    myTv.turnOff();
    }
}

