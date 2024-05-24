package net.jiabin.design.pattern.practice.state.codemethod1;

/**
 * @date 2020-02-24 17:34
 * @description 财务审批
 */
public class FinanceState extends State {
    @Override
    public void handle() {
        System.out.println("财务审批通过，执行转账");
    }
}
