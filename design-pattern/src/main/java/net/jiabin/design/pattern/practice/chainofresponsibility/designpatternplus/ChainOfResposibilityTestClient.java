package net.jiabin.design.pattern.practice.chainofresponsibility.designpatternplus;

public class ChainOfResposibilityTestClient {

    public static void main(String[] args) {

        PrepareObjects prepareObjects = new PrepareObjects();
        prepareObjects.setWashFace(true);
        prepareObjects.setWashHair(false);
        prepareObjects.setHaveBreakfast(true);

        Study study = new Study();

        StudyPrepareFilter washFaceFilter = new WashFaceFilter();
        StudyPrepareFilter washHairFilter = new WashHairFilter();
        StudyPrepareFilter haveBreakfastFilter = new HaveBreakfastFilter();

        FilterChain filterChain = new FilterChain(study);
        filterChain.addFilter(washFaceFilter);
        filterChain.addFilter(washHairFilter);
        filterChain.addFilter(haveBreakfastFilter);

        filterChain.doFilter(prepareObjects, filterChain);

    }
}
