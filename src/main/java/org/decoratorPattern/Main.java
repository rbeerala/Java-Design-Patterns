package org.decoratorPattern;

import org.decoratorPattern.pizzaDecorator.ExtraCheeseTopping;
import org.decoratorPattern.pizzaDecorator.MushroomTopping;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new MushroomTopping(new ExtraCheeseTopping(new VegeDelight()));
        System.out.println(pizza.getCost());
    }
}
