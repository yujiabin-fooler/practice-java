package net.jiabin.design.pattern.practice.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib子类代理工厂:内存中动态构建一个子类对象
 */
public class CGLibProxyFactory implements MethodInterceptor {

    //目标对象
    private Object target;
    public CGLibProxyFactory(Object target) {
        this.target = target;
    }

    //给目标对象创建一个代理对象
    public Object getProxyInstance(){
        //1、工具类
        Enhancer en = new Enhancer();
        //2、设置父类
        en.setSuperclass(target.getClass());
        //3、设置回调函数
        en.setCallback(this);
        //4、创建子类(代理对象)
        return en.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        seeHouse();//看房

        //执行目标对象的方法
        Object returnValue = method.invoke(target, args);

        hetong();//签合同
        fare();//收费
        return returnValue;
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

