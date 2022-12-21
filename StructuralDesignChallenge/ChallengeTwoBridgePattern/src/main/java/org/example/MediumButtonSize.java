package org.example;

public class MediumButtonSize implements ButtonSize{
    Button button;

    public MediumButtonSize(Button button) {
        this.button = button;
    }

    @Override
    public void draw() {
        System.out.println("Setting size to medium...");
        button.draw();
    }
}
