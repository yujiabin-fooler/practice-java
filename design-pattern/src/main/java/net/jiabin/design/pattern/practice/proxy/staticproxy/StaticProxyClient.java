package net.jiabin.design.pattern.practice.proxy.staticproxy;


//租客。访问代理对象的人
public class StaticProxyClient {

    public static void main(String[] args) {
        Renters host = new Renters();
        //代理租客。可以加一些附属操作
        ProxyObject proxy = new ProxyObject(host);
        proxy.rent();
    }


}

