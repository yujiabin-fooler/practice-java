package net.jiabin.design.pattern.practice.singleton.enumsingle;

public enum EnumSingle {

    INSTANCE;

    public EnumSingle getInstance(){
        return INSTANCE;
    }


}
