package com.example.command;

public class SwitchOffLightOperation implements SwitchOperation {

  private final Light light;

  public SwitchOffLightOperation(Light light) {
      this.light = light;
  }

  @Override
  public void execute() {
      light.turnOffLight();
  }
}
