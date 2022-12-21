package org.example;

public class Canvas {

    public static void main(String[] args) {
        LargeButtonSize largeCheckboxButton = new LargeButtonSize(new CheckboxButton());
        largeCheckboxButton.draw();

        SmallButtonSize smallRadioButton = new SmallButtonSize(new RadioButton());
        smallRadioButton.draw();

        MediumButtonSize mediumDropdownButton = new MediumButtonSize(new DropdownButton());
        mediumDropdownButton.draw();
    }
}
