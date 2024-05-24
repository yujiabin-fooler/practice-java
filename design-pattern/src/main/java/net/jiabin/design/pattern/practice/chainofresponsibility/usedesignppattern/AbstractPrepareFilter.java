package net.jiabin.design.pattern.practice.chainofresponsibility.usedesignppattern;

public abstract class AbstractPrepareFilter {

    private AbstractPrepareFilter nextPrepareFilter;

    public AbstractPrepareFilter(AbstractPrepareFilter nextPrepareFilter) {
        this.nextPrepareFilter = nextPrepareFilter;
    }

    public void doFilter(PrepareObjects prepareObjects, Study study) {
        prepare(prepareObjects);

        if (nextPrepareFilter == null) {
            study.study();
        } else {
            nextPrepareFilter.doFilter(prepareObjects, study);
        }
    }

    public abstract void prepare(PrepareObjects prepareObjects);

}
