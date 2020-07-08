package com.gaurav.strategydp.varyingbehaviour.flybehaviours;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I cannot fly !!!");
    }
}
