package net.jiabin.jdk.practice.concurrent.imooccache;

import net.jiabin.jdk.practice.concurrent.imooccache.compute.Computable;
import net.jiabin.jdk.practice.concurrent.imooccache.compute.ExpensiveFunction;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 直接替换成线程安全的容器ConcurrentHashMap
 *
 * @author wzy
 * @version 1.0
 * @date 2022/7/2 9:23 上午
 */
public class ImoocCache5<A, V> implements Computable<A, V> {

    private final Map<A, V> cache = new ConcurrentHashMap<>();

    private final Computable<A, V> c;

    public ImoocCache5(Computable<A, V> c) {
        this.c = c;
    }

    @Override
    public V compute(A arg) throws Exception {
        System.out.println("进入缓存机制");
        V result = cache.get(arg);

        if (result == null) {
            result = c.compute(arg);
            cache.put(arg, result);
        }

        return result;
    }

    public static void main(String[] args) throws Exception {
        ImoocCache5<String, Integer> cache = new ImoocCache5<>(new ExpensiveFunction());

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Integer result = cache.compute("666");
                    System.out.println("第一次的结果：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Integer result = cache.compute("667");
                    System.out.println("第二次的结果：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Integer result = cache.compute("666");
                    System.out.println("第三次的结果：" + result);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}