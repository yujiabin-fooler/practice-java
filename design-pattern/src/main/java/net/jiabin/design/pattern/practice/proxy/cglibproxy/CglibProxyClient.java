package net.jiabin.design.pattern.practice.proxy.cglibproxy;

public class CglibProxyClient {

    public static void main(String[] args) {
        //目标对象
        Rent host = new Renters();
        //生成代理对象
        Renters proxy = (Renters) new CGLibProxyFactory(host).getProxyInstance();
        //执行代理对象的方法
        proxy.rent();
    }

}
