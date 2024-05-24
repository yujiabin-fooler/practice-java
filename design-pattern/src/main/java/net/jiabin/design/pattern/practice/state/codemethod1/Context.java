package net.jiabin.design.pattern.practice.state.codemethod1;

/**
 * @author 天启
 * @date 2020-02-24 17:33
 * @description 报销审批状态上下文
 */
public class Context {
    private State state;

    public Context() {
        this.state = new PresidentState();
        state.setContext(this);
    }

    public void changeState(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    /**
     * 审批通过请求
     */
    public void request() {
        this.state.handle();
    }
}
