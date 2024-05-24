package net.jiabin.design.pattern.practice.chainofresponsibility.usedesignppattern;

public class WashHairFilter extends AbstractPrepareFilter {

    public WashHairFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PrepareObjects prepareObjects) {
        if (prepareObjects.isWashHair()) {
            System.out.println("洗头");
        }

    }

}
