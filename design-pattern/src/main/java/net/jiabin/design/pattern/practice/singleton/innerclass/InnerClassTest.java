package net.jiabin.design.pattern.practice.singleton.innerclass;

public class InnerClassTest {


    public static void main(String[] args) {
        SingletonObject object1 = SingletonObject.getInstance();
        SingletonObject object2 = SingletonObject.getInstance();
        System.out.println(object1);
        System.out.println(object2);

    }
}
