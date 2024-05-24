package net.jiabin.design.pattern.practice.template.hookmethod;

public class TemplateTestClient {

    public static void main(String[] args) {
        // 制作黑豆豆浆
        SoyMilk blackBeanSoyMilk = new BlackBeanSoyMilk();
        blackBeanSoyMilk.make();

        SoyMilk peanutSoyMilk = new PeanutSoyMilk();
        peanutSoyMilk.make();
        
        SoyMilk pureSoyMilk = new PureSoyMilk();
        pureSoyMilk.make();
    }



}
