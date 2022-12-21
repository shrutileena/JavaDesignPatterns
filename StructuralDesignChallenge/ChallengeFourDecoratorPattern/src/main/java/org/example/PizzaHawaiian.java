package org.example;

import java.util.ArrayList;

public class PizzaHawaiian implements Pizza{
    static ArrayList toppings = new ArrayList();
    static String name = "hawaiian";

    public PizzaHawaiian() {
        toppings.add("cheese");
        toppings.add("tomato");
        toppings.add("ham");
        toppings.add("pineapple");
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
