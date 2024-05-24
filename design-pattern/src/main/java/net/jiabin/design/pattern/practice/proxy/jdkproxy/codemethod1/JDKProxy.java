package net.jiabin.design.pattern.practice.proxy.jdkproxy.codemethod1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy implements InvocationHandler {


    /**
     * jdk动态代理，不需要实现接口，需要指定接口类型
     * 写法一，好理解，以租房为例的话，targetObject就是Rent接口
     */

        //需要代理的目标对象。
        //targetObject就是咱们的Rent接口
        public Object targetObject;
        //代理对象目标
        public void setTargetObject(Object targetObject) {
            this.targetObject = targetObject;
        }

        //生成得到代理类
        public Object getTargetObject(){
            /**
             * 返回代理对象
             * 参数一：指定当前目标对象使用的类加载器。
             * 参数二：目标对象实现的接口的类型。
             * 参数三：事件处理器。这里写的this是代表下边重写的invoke方法
             */
            return Proxy.newProxyInstance(
                    targetObject.getClass().getClassLoader(),
                    targetObject.getClass().getInterfaces(),
                    this);
        }

        /**
         * 实现InvocationHandler接口，就要重写invoke方法。
         * proxy，调用该方法的代理实例
         * method，要执行的目标对象的方法(利用反射的原理)
         * args，执行某方法需要的参数。
         */
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

            seeHouse();//看房
            //动态代理的本质，就是使用反射机制实现
            Object result = method.invoke(targetObject,args);
            hetong();//签合同
            fare();//收费
            return result;
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
