package org.decoratorPattern.pizzaDecorator;

import org.decoratorPattern.Pizza;

public class ExtraCheeseTopping extends ToppingDecorator{
    Pizza basePizza;
    public ExtraCheeseTopping(Pizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 3;
    }
}
