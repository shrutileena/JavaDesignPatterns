package org.example;

public class EndsWithPeriod implements Expression{
    @Override
    public String interpret(String context) {
        if(context.substring(context.length()-1) != "."){
            context = context + ".";
        }
        return context;
    }
}
