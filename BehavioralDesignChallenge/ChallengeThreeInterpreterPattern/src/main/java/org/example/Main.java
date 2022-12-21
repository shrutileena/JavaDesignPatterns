package org.example;

public class Main {
    public static void main(String[] args) {
        String context = "this is is a sentence";

        FirstLetterIsUppercase firstLetterIsUppercase = new FirstLetterIsUppercase();
        System.out.println(firstLetterIsUppercase.interpret(context));
    }
}