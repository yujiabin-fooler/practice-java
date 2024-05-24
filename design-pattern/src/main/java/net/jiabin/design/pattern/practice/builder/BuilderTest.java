package net.jiabin.design.pattern.practice.builder;

public class BuilderTest {

    public static void main(String[] args) {
        User d = User.builder()
                .name("foo")
                .password("pAss12345")
                .age(25)
                .build();
    }
}
