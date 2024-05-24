package net.jiabin.design.pattern.practice.chainofresponsibility.usedesignppattern;

public class HaveBreakfastFilter extends AbstractPrepareFilter {

    public HaveBreakfastFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PrepareObjects prepareObjects) {
        if (prepareObjects.isHaveBreakfast()) {
            System.out.println("吃早餐");
        }

    }

}
