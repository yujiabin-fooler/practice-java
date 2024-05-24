package net.jiabin.design.pattern.practice.chainofresponsibility.usedesignppattern;

public class ChainOfResponsibilityTestClient {

    public static void main(String[] args) {


        PrepareObjects prepareObjects = new PrepareObjects();
        prepareObjects.setWashFace(true);
        prepareObjects.setWashHair(false);
        prepareObjects.setHaveBreakfast(true);

        Study study = new Study();

        AbstractPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter(null);
        AbstractPrepareFilter washFaceFilter = new WashFaceFilter(haveBreakfastFilter);
        AbstractPrepareFilter washHairFilter = new WashHairFilter(washFaceFilter);

        washHairFilter.doFilter(prepareObjects, study);

    }
}
