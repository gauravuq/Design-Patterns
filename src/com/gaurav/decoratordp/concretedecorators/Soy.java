package com.gaurav.decoratordp.concretedecorators;

import com.gaurav.decoratordp.abstractcomponent.Beverage;

public class Soy extends Beverage {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String description() {
        return this.beverage.description()+ ":Soy";
    }

    @Override
    public Double cost() {
        return  this.beverage.cost()+ 0.55;
    }
}
