package com.example.command;

public class SwitchOffLightOperation implements SwitchOperation {

  private Light light;

  public SwitchOffLightOperation(Light light) {
      this.light = light;
  }

  @Override
  public void execute() {
      light.turnOffLight();
  }
}
