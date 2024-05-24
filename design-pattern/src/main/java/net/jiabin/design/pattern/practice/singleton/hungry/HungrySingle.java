package net.jiabin.design.pattern.practice.singleton.hungry;

public class HungrySingle {

    /**
     * 构造器私有 拒绝别人创建这个对象
     */
    private HungrySingle() {
    }

    private final static HungrySingle HUNGRY = new HungrySingle();

    public static HungrySingle getInstance(){
        return HUNGRY;
    }


}
