package net.jiabin.design.pattern.practice.state.codemethod2;

public class StateTestClient {


    public static void main(String[] args) {
        AbstractTemplate t = new ConcreteTemplate();
        // 调用模板方法
        t.templateMethod();
    }


}
