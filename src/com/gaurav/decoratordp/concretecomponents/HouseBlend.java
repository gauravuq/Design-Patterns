package com.gaurav.decoratordp.concretecomponents;

import com.gaurav.decoratordp.abstractcomponent.Beverage;

public class HouseBlend  extends Beverage {
    @Override
    public String description() {
        return "House-Blend";
    }

    @Override
    public Double cost() {
        return 4.00;
    }
}
