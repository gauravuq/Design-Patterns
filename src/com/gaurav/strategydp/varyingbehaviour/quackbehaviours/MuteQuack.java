package com.gaurav.strategydp.varyingbehaviour.quackbehaviours;

public class MuteQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I cannot Quack !!!!!");
    }
}
