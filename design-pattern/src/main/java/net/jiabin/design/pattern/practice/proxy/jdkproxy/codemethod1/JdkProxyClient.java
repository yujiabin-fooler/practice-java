package net.jiabin.design.pattern.practice.proxy.jdkproxy.codemethod1;

public class JdkProxyClient {


    public static void main(String[] args) {
        //真实角色
        Renters renters = new Renters();

        //代理角色,现在没有
        JDKProxy jdkProxy = new JDKProxy();

        //通过调用程序处理角色来处理我们要用调用的接口对象
        jdkProxy.setTargetObject(renters);//把要代理的对象传过去

        Rent proxy = (Rent) jdkProxy.getTargetObject();
        proxy.rent();

    }



}
