package org.example;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler{
    public ClientCertificateAuthenticationHandler(AuthenticationHandler authenticationHandler) {
        super(authenticationHandler);
    }

    public void handleRequest(String requestType){
        if(requestType.equalsIgnoreCase("client certificate")){
            System.out.println("Handling client certificate authentication request");
        } else {
            super.handleRequest(requestType);
        }
    }
}
