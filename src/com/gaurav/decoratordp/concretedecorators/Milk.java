package com.gaurav.decoratordp.concretedecorators;


import com.gaurav.decoratordp.abstractcomponent.Beverage;

public class Milk extends Beverage {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public String description() {
        return this.beverage.description()+ ":Milk";
    }

    @Override
    public Double cost() {
        return  this.beverage.cost()+ 0.35;
    }
}
