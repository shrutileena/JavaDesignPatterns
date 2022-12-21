package org.example;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new SuperstoreInventoryProxy();
        Store store = new Store("Healthy Wholefoods", "India", inventory);

        store.printName();
        store.printLocation();
        store.printInventory();
    }
}
