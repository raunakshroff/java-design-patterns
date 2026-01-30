package com.example.command;

public class SwitchOnLightOperation implements SwitchOperation {
  
  private Light light;

  public SwitchOnLightOperation(Light light) {
      this.light = light;
  }

  @Override
  public void execute() {
      light.turnOnLight();
  } 

}
