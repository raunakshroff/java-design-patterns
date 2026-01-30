package com.example.interpreter;

public class FullStopHandler implements Expression {

    @Override
    public String interpret(String context) {
      if(!context.endsWith(".")) 
        return context + ".";
      else
        return context;
    }
  
}
