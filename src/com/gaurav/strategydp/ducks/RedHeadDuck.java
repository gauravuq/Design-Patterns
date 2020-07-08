package com.gaurav.strategydp.ducks;

import com.gaurav.strategydp.varyingbehaviour.flybehaviours.FlyBehaviour;
import com.gaurav.strategydp.varyingbehaviour.quackbehaviours.QuackBehaviour;

public class RedHeadDuck  extends Duck{

    public RedHeadDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, String name) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.name= name;
    }

    @Override
    public void display() {
        System.out.println("I am a Red Head Duck");
    }
}
