package org.example;

public class SmallButtonSize implements ButtonSize{
    Button button;

    public SmallButtonSize(Button button) {
        this.button = button;
    }
    @Override
    public void draw() {
        System.out.println("Setting size to small...");
        button.draw();
    }
}
