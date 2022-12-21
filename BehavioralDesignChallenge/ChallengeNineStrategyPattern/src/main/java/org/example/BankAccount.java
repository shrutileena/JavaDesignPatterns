package org.example;

public class BankAccount implements Account{
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of Rupees "+amount+" made from bank account");
    }
}
