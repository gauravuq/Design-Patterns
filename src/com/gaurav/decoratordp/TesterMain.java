package com.gaurav.decoratordp;

import com.gaurav.decoratordp.abstractcomponent.Beverage;
import com.gaurav.decoratordp.concretecomponents.DarkRoast;
import com.gaurav.decoratordp.concretedecorators.Milk;
import com.gaurav.decoratordp.concretedecorators.Soy;

public class TesterMain {

    public static void main(String[] args) {

        Beverage bvrBeverage1 = new DarkRoast();
        bvrBeverage1 = new Milk(bvrBeverage1);
        bvrBeverage1 = new Soy(bvrBeverage1);

        System.out.println(bvrBeverage1.cost());
        System.out.println(bvrBeverage1.description());



    }

}
