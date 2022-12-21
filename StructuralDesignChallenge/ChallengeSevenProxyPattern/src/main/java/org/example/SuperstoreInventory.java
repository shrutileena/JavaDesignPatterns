package org.example;

import java.util.ArrayList;
import java.util.List;

public class SuperstoreInventory implements Inventory{
    ArrayList<Item> inventory = new ArrayList<>();

    public SuperstoreInventory() {
        inventory.add(new Item("Bread",500,1));
        inventory.add(new Item("Milk",400,0.5));
        inventory.add(new Item("Eggs",300,0.7));
        inventory.add(new Item("Coffee",100,4));
        inventory.add(new Item("Ham",300,2));
        inventory.add(new Item("Orange Juice",400,0.2));
        inventory.add(new Item("Cereal",400,1));
        inventory.add(new Item("Butter",300,0.3));
        inventory.add(new Item("Pasta",300,1));
        inventory.add(new Item("Apples",200,0.2));
        inventory.add(new Item("Bananas",200,0.2));
        inventory.add(new Item("Onions",500,0.1));
    }

    @Override
    public ArrayList<Item> getInventory() {
        return inventory;
    }
}
