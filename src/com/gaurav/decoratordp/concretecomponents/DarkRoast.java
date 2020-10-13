package com.gaurav.decoratordp.concretecomponents;

import com.gaurav.decoratordp.abstractcomponent.Beverage;

public class DarkRoast extends Beverage {


    @Override
    public String description() {
        return "Dark-Roast";
    }

    @Override
    public Double cost() {
        return 3.00;
    }
}
