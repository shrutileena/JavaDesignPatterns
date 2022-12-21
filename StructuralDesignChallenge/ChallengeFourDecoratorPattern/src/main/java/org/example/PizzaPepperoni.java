package org.example;

import java.util.ArrayList;

public class PizzaPepperoni implements Pizza{
    static ArrayList toppings = new ArrayList();
    static String name = "Pepperoni";

    public PizzaPepperoni() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("pepperoni");
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
