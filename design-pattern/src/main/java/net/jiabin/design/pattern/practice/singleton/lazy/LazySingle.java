package net.jiabin.design.pattern.practice.singleton.lazy;

public class LazySingle {

    private LazySingle(){

    }
    private static volatile LazySingle lazySingle;

    public static LazySingle getInstance(){
        if (lazySingle == null ) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }


}
