package org.example;

import java.util.ArrayList;

public class PizzaWithExtraCheese implements Pizza{
    static ArrayList toppings = new ArrayList();
    static String name = " with extra cheese";

    public PizzaWithExtraCheese(Pizza pizza) {
        toppings.addAll(pizza.getToppings());
        toppings.add("extra cheese");
        this.name = pizza.getName().concat(name);
    }

    @Override
    public ArrayList getToppings() {
        return toppings;
    }

    @Override
    public String getName() {
        return name;
    }
}
