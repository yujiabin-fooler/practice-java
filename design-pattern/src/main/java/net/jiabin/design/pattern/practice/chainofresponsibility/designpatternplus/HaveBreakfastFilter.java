package net.jiabin.design.pattern.practice.chainofresponsibility.designpatternplus;

public class HaveBreakfastFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PrepareObjects prepareObjects, FilterChain filterChain) {
        if (prepareObjects.isHaveBreakfast()) {
            System.out.println("吃完早饭");
        }

        filterChain.doFilter(prepareObjects, filterChain);
    }

}