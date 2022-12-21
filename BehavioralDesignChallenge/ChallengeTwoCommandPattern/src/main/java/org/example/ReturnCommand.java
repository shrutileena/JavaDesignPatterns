package org.example;

public class ReturnCommand implements Command{
    private Jacket jacket;

    public ReturnCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.returnOrder();
    }
}
