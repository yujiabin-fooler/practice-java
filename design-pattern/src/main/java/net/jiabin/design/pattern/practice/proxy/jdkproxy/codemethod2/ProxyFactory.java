package net.jiabin.design.pattern.practice.proxy.jdkproxy.codemethod2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 创建动态代理对象
 * 动态代理不需要实现接口,但是需要指定接口类型
 */
public class ProxyFactory {

    //目标对象
    private Object target;
    public ProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象生成代理对象
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        seeHouse();
                        //执行目标对象方法
                        Object returnValue = method.invoke(target, args);
                        hetong();
                        fare();
                        return returnValue;
                    }
                }
        );
    }

    public void seeHouse(){
        System.out.println("中介带你看房子");
    }
    public void hetong(){
        System.out.println("签订租赁合同");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}

