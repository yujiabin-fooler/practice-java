package net.jiabin.design.pattern.practice.proxy.jdkproxy.codemethod2;

public class JdkProxyClient {

    public static void main(String[] args) {
        //目标对象
        Rent target = new Renters();

        //给目标对象创建代理对象
        Rent proxy = (Rent) new ProxyFactory(target).getProxyInstance();

        //执行方法
        proxy.rent();
    }

}
