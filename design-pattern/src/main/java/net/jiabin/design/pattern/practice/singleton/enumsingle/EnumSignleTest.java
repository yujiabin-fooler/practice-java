package net.jiabin.design.pattern.practice.singleton.enumsingle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class EnumSignleTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

            EnumSingle instance1 = EnumSingle.INSTANCE;
            Constructor<EnumSingle> declaredConstructor = EnumSingle.class.getDeclaredConstructor(
                    String.class, int.class);
            declaredConstructor.setAccessible(true);
            EnumSingle instance2 = declaredConstructor.newInstance();

            System.out.println(instance1);
            System.out.println(instance2);



    }
}
