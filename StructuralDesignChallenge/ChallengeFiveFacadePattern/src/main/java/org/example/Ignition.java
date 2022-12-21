package org.example;

public class Ignition {
    boolean isOn = false;
    public void turnOn(){
        System.out.println("Turning the Ignition on");
        isOn = true;
    }
    public void turnOff(){
        System.out.println("Turning the Ignition off");
        isOn = false;
    }
}
