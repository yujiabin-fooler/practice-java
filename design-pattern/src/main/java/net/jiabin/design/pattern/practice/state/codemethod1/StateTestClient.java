package net.jiabin.design.pattern.practice.state.codemethod1;

public class StateTestClient {


    public static void main(String args[]) {

        Context context = new Context();
        // 总裁审批通过请求
        context.request();

        // 主管审批通过请求
        context.request();

        // 财务审核通过请求
        context.request();

    }

}
