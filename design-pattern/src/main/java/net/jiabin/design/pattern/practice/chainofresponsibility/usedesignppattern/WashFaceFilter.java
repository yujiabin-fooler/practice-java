package net.jiabin.design.pattern.practice.chainofresponsibility.usedesignppattern;

public class WashFaceFilter extends AbstractPrepareFilter {

    public WashFaceFilter(AbstractPrepareFilter nextPrepareFilter) {
        super(nextPrepareFilter);
    }

    @Override
    public void prepare(PrepareObjects prepareObjects) {
        if (prepareObjects.isWashFace()) {
            System.out.println("洗脸");
        }

    }

}
