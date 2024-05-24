package net.jiabin.design.pattern.practice.singleton.doublecheck;

public class DoubleCheckTest {

    public static void main(String[] args) {

        SingleObject object1 = SingleObject.getInstance();
        SingleObject object2 = SingleObject.getInstance();
        System.out.println(object1);
        System.out.println(object2);

    }
}
