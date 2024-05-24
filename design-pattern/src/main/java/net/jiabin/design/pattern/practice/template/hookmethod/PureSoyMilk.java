package net.jiabin.design.pattern.practice.template.hookmethod;

public class PureSoyMilk extends SoyMilk{
    @Override
    protected void addCondiments() {
    }

    @Override
    boolean customerWantCondiments() {
        return false;
    }
}
