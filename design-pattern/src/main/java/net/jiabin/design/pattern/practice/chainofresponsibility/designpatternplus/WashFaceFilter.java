package net.jiabin.design.pattern.practice.chainofresponsibility.designpatternplus;

public class WashFaceFilter implements StudyPrepareFilter {

    @Override
    public void doFilter(PrepareObjects prepareObjects, FilterChain filterChain) {
        if (prepareObjects.isWashFace()) {
            System.out.println("洗完脸");
        }

        filterChain.doFilter(prepareObjects, filterChain);
    }

}