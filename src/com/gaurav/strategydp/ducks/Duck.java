package com.gaurav.strategydp.ducks;

import com.gaurav.strategydp.varyingbehaviour.flybehaviours.FlyBehaviour;
import com.gaurav.strategydp.varyingbehaviour.quackbehaviours.QuackBehaviour;

public abstract class Duck {


    protected FlyBehaviour flyBehaviour;  // has a
    protected QuackBehaviour quackBehaviour; // has a
    protected String name;

    public void swim() {
        System.out.println("All ducks perform swim");
    }

    public abstract void display() ;

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }


}
