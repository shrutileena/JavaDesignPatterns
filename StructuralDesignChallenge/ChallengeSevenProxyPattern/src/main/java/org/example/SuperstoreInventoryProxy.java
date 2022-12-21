package org.example;

import java.util.ArrayList;

public class SuperstoreInventoryProxy implements Inventory{
    private Inventory inventory;
    @Override
    public ArrayList<Item> getInventory() {
        if(inventory==null){
            inventory = new SuperstoreInventory(); // Using proxy class will create the long list of items only
            // when we call getInventory method
        }
        return inventory.getInventory();
    }
}
