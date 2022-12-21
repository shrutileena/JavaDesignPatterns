package org.example;

public class Main {
    public static void main(String[] args) {
        order(new PizzaHawaiian());
        order(new PizzaWithExtraCheese(new PizzaMargerita()));
        order(new PizzaPepperoni());
    }
    public static void order(Pizza pizza){
        System.out.println("You have ordered a " + pizza.getName() +
                " pizza. The toppings are " + pizza.getToppings() + ".");
    }

}
