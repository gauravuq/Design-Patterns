package com.gaurav.decoratordp.concretecomponents;

import com.gaurav.decoratordp.abstractcomponent.Beverage;

public class HouseBlend  extends Beverage {
    @Override
    public String description() {
        return "House_Blend";
    }

    @Override
    public Double cost() {
        return 2.60;
    }
}
