package com.example.interpreter;

public class App {


    
    public static void main(String[] args) {
        var context = "hello world";
        var fullStopHandler = new FullStopHandler();
        var capitalLetterHandler = new CapitalLetterHandler(fullStopHandler);
        System.out.println(context);

        context = capitalLetterHandler.interpret(context);
        System.out.println(context);
    }

}
