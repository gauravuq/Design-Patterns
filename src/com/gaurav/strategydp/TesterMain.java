package com.gaurav.strategydp;

import com.gaurav.strategydp.ducks.DecoyDuck;
import com.gaurav.strategydp.ducks.Duck;
import com.gaurav.strategydp.ducks.RedHeadDuck;
import com.gaurav.strategydp.varyingbehaviour.flybehaviours.FlyBehaviour;
import com.gaurav.strategydp.varyingbehaviour.flybehaviours.FlyNoWay;
import com.gaurav.strategydp.varyingbehaviour.flybehaviours.FlyWithWings;
import com.gaurav.strategydp.varyingbehaviour.quackbehaviours.MuteQuack;
import com.gaurav.strategydp.varyingbehaviour.quackbehaviours.QuackBehaviour;
import com.gaurav.strategydp.varyingbehaviour.quackbehaviours.Squeak;

public class TesterMain {

    public static void main(String[] args) {
        FlyBehaviour flyBehaviour = new FlyWithWings();
        FlyBehaviour flyBehaviour1 = new FlyNoWay();

        QuackBehaviour quackBehaviour = new Squeak();
        QuackBehaviour quackBehaviour1 = new MuteQuack();

        Duck duckRedHead = new RedHeadDuck(flyBehaviour,quackBehaviour,"Duck Red Head");
        Duck duckDecoy = new DecoyDuck(flyBehaviour1,quackBehaviour1,"Duck Decoy");

        duckRedHead.performFly();
        duckRedHead.performQuack();
        duckRedHead.display();
        duckDecoy.performFly();
        duckDecoy.performQuack();
        duckDecoy.display();
    }
}
