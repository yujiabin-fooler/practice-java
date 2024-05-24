package net.jiabin.design.pattern.practice.chainofresponsibility.designpatternplus;

public class WashHairFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PrepareObjects prepareObjects, FilterChain filterChain) {
        if (prepareObjects.isWashHair()) {
            System.out.println("洗完头发");
        }

        filterChain.doFilter(prepareObjects, filterChain);
    }

}
