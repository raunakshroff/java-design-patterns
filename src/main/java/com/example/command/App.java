package com.example.command;

public class App {

    public static void main(String[] args) {

        SwitchOperationExecutor executor = new SwitchOperationExecutor();
        Light light = new Light();

        light.isOn();

        executor.executeOperation(new SwitchOnLightOperation(light));

        light.isOn();

        executor.executeOperation(new SwitchOffLightOperation(light));

        light.isOn();
    }

}
