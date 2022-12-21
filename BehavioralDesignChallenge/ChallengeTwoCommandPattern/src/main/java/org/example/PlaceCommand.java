package org.example;

public class PlaceCommand implements Command{
    private Jacket jacket;

    public PlaceCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.placeOrder();
    }
}
