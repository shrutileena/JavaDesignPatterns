package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(new BankAccount());
        customer.makePayment(10000);

//        Customer customer = new Customer();
//        customer.makePayment(Account.bankAccount, 10000);
    }
}