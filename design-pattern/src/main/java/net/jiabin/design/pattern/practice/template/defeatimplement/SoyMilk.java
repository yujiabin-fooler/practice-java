package net.jiabin.design.pattern.practice.template.defeatimplement;

public abstract class SoyMilk {
    protected String condiment;

    /**
     * 模板方法
     */
    public final void make() {
        select();
        addCondiments();
        soak();
        beat();
    }

    /**
     * 添加不同的配料
     */
    protected abstract void addCondiments();

    /**
     * 选材料
     */
    private void select() {
        System.out.println("第一步：选择新鲜黄豆 ");
    }

    /**
     * 浸泡
     */
    private void soak() {
        System.out.println("第三步：黄豆和" + condiment + "开始浸泡，需要3小时");
    }

    /**
     * 打碎
     */
    private void beat() {
        System.out.println("第四步：黄豆和" + condiment + "放到豆浆机中打碎");
    }


    /**
     * 设置原料
     * @param condiment
     */
    protected void setCondiment(String condiment) {
        this.condiment = condiment;
    }
}
