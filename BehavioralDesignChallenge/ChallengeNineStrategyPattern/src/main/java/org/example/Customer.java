package org.example;

public class Customer {
    private Account account;

    public Customer(Account account) {
        this.account=account;
    }
//    public void makePayment(Account account, int amount){
//        account.makePayment(amount);
//    }
    public void makePayment(int amount) {
//        System.out.println("Payment of Rupees "+amount+" made from bank account");
        account.makePayment(amount);
    }

//    public void makePaytmPayment(int amount){
//        System.out.println("Payment of Rupees "+amount+" made from Paytm account");
//    }
}
