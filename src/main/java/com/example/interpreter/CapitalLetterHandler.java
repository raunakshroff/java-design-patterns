package com.example.interpreter;

public class CapitalLetterHandler implements Expression {

  private final FullStopHandler fullStopHandler;

  public CapitalLetterHandler(FullStopHandler fullStopHandler) {
      this.fullStopHandler = fullStopHandler;
  }

  @Override
  public String interpret(String context) {
    context = context.substring(0, 1).toUpperCase()
            + context.substring(1);
      return fullStopHandler.interpret(context);
  }
  
}
