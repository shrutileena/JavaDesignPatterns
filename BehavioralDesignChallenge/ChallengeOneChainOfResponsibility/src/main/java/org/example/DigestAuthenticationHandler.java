package org.example;

public class DigestAuthenticationHandler extends AuthenticationHandler{
    public DigestAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        super(authenticationHandler);
    }
    public void handleRequest(String requestType){
        if(requestType.equalsIgnoreCase("digest")){
            System.out.println("Handling digest authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }
}
