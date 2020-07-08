package com.gaurav.strategydp.ducks;

import com.gaurav.strategydp.varyingbehaviour.flybehaviours.FlyBehaviour;
import com.gaurav.strategydp.varyingbehaviour.quackbehaviours.QuackBehaviour;

public class DecoyDuck extends Duck{

    public DecoyDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour, String name) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
        this.name= name;
    }

    @Override
    public void display() {
        System.out.println("I am a Decoy Duck");
    }
}
