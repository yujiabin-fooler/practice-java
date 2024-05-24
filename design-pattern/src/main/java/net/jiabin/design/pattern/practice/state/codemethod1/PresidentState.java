package net.jiabin.design.pattern.practice.state.codemethod1;

/**
 * @date 2020-02-24 17:35
 * @description 总裁审批
 */
public class PresidentState extends State {
    @Override
    public void handle() {
        System.out.println("总裁审批通过，下一个主管审批");
        context.changeState(new SupervisorState());
    }
}
