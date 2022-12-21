package org.example;

public class BasicAuthenticationHandler extends AuthenticationHandler{
    public BasicAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        super(authenticationHandler);
    }
    public void handleRequest(String requestType){
        if(requestType.equalsIgnoreCase("basic")){
            System.out.println("Handling basic authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }
}
