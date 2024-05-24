package net.jiabin.design.pattern.practice.mediator.codemethod2;

public abstract class Country {

    protected UnitedNations mediator;

    public Country(UnitedNations mediator) {
        this.mediator = mediator;
    }

}
