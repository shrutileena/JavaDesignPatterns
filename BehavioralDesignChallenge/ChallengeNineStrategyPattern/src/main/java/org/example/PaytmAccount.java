package org.example;

public class PaytmAccount implements Account{
    @Override
    public void makePayment(int amount) {
        System.out.println("Payment of Rupees "+amount+" made from Paytm account");
    }
}
