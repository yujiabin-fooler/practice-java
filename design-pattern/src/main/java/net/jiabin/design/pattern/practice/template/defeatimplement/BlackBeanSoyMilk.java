package net.jiabin.design.pattern.practice.template.defeatimplement;

public class BlackBeanSoyMilk extends SoyMilk{
    @Override
    protected void addCondiments() {
        System.out.println("第二步：加入上好的黑豆");
        setCondiment("黑豆");
    }
}