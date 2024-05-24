package net.jiabin.design.pattern.practice.command;

//频道切换命令ConcreteCommand
public class CommandChange implements Command {
    private TV myTv;

    private int channel;

    public CommandChange(TV tv, int channel) {
     myTv = tv;
     this.channel = channel;
    }

    public void execute() {
      myTv.changeChannel(channel);
    }
}
