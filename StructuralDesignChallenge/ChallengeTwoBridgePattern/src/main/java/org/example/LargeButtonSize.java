package org.example;

public class LargeButtonSize implements ButtonSize{

    Button button;
    public LargeButtonSize(Button button) {
        this.button = button;
    }
    @Override
    public void draw() {
        System.out.println("Setting size to large...");
        button.draw();
    }
}
