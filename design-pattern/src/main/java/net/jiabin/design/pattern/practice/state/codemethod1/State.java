package net.jiabin.design.pattern.practice.state.codemethod1;

/**
 * @date 2020-02-24 17:33
 * @description 抽象状态类
 */
public abstract class State {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 处理方法
     */
    public abstract void handle();
}
