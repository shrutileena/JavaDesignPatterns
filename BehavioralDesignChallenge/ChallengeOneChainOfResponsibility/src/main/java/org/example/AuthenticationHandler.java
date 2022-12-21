package org.example;

public abstract class AuthenticationHandler {
    private AuthenticationHandler next;
    public AuthenticationHandler(AuthenticationHandler next) {
        this.next = next;
    }
    public void handleRequest(String requestType){
        if(next != null){
            next.handleRequest(requestType);
        } else {
            System.out.println("Request cannot be handled");
        }
    }
}
