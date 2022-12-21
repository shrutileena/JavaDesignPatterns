package org.example;

public class Troll extends Character{
    public void pickUpWeapon() {
        System.out.println("Pick up club");
    }

    public void defenseAction() {
        System.out.println("Defend with club");
    }

    public void moveToSafety() {
        System.out.println("Return to the mountain");
    }

    //Removing this method also works
    public void defendAgainstAttack() {
        super.defendAgainstAttack();
    }
}
