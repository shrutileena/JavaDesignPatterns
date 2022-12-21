package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NoRepeatedWords implements Expression{
    private EndsWithPeriod endsWithPeriod = new EndsWithPeriod();
    private List<String> words;
    @Override
    public String interpret(String context) {
        words = Arrays.asList(context.split(" "));
        int size = words.size()-1;
        StringBuilder newContext = new StringBuilder();

        for(int i=0 ; i<size; i++){
            String word = words.get(i);
            if(!word.equals(words.get(i+1))){
                newContext.append(word).append(" ");
            }
        }
        newContext.append(words.get(size));
        context=newContext.toString();
        return endsWithPeriod.interpret(context);
    }
}
