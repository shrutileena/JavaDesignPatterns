package org.example;

public abstract class Character {
    public void pickUpWeapon() {
    }

    public void defenseAction() {
    }

    public void moveToSafety() {
    }
    public void defendAgainstAttack() {
        pickUpWeapon();
        defenseAction();
        moveToSafety();
        System.out.println();
    }
}
