package net.jiabin.jdk.practice.concurrent.thread;

/**
 * 输出当前线程名称
 *
 * @author wzy
 * @version 1.0
 * @date 2022/6/24 11:44 上午
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        System.out.println("current Thread name: " + Thread.currentThread().getName());
    }
}