package net.jiabin.jdk.practice.concurrent.flowcontrol.countdownlatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 描述:
 * 模拟100米跑步，5名选手都准备好了，只等裁判员一声令下，所有人同
 * 时开始跑步。
 * <p>
 * 等待最后一名运动员到达，宣布本场比赛结束。
 */
public class CountDownLatchDemo3 {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch begin = new CountDownLatch(1);
        CountDownLatch end = new CountDownLatch(5);

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 0; i < 5; i++) {
            final int no = i + 1;
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    System.out.println("No." + no + ",准备完毕等待发令枪");
                    try {
                        begin.await();
                        System.out.println("No." + no + "开始跑步了");
                        Thread.sleep((long) (Math.random() * 10000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } finally {
                        end.countDown();
                    }
                }
            };
            executorService.submit(runnable);
        }
        //裁判员检查发令枪
        Thread.sleep(5000);
        System.out.println("发令枪响，比赛开始！");
        begin.countDown();
        end.await();
        System.out.println("所有运动员都到达终点，比赛结束！");

    }
}