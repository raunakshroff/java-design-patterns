package com.example.facade;

public class App {

    public static void main(String[] args) {

        ClientFacade clientFacade = new ClientFacade();
        clientFacade.startCommunication();

    }

}
