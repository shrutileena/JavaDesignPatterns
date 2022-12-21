package org.example;

import java.util.ArrayList;

public class PizzaMargerita implements Pizza{
    static ArrayList toppings = new ArrayList();
    static String name = "margerita";

    public PizzaMargerita() {
        toppings.add("tomato");
        toppings.add("cheese");
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
