package org.decoratorPattern.pizzaDecorator;

import org.decoratorPattern.Pizza;

public class MushroomTopping extends ToppingDecorator{
    private Pizza basePizza;

    public MushroomTopping(Pizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost() {
        return basePizza.getCost() + 1;
    }
}
