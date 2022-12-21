package org.example;

public class CarFacade {
    Ignition ignition = new Ignition();
    Handbrake handbrake = new Handbrake();
    Clutch clutch = new Clutch();
    GearStick gearStick = new GearStick();
    Accelerator accelerator = new Accelerator();
    public void runCar(){
        ignition.turnOn();
        clutch.press();
        gearStick.changeGear(1);
        accelerator.press();
        clutch.lift();
        handbrake.pushDown();
        accelerator.press();
        clutch.press();
    }
}
