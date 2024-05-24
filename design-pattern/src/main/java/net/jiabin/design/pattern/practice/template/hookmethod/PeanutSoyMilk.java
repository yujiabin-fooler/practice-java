package net.jiabin.design.pattern.practice.template.hookmethod;


public class PeanutSoyMilk extends SoyMilk {
    @Override
    protected void addCondiments() {
        System.out.println("第二步：加入上好的花生");
        setCondiment("花生");
    }
}
