package org.example;

public class Adder {
    private int result;
    Memento memento = new Memento(result);
    public void add(int newNumber){
        result += newNumber;
    }
    public int getResult(){
        return result;
    };
    public void save(){
        memento.setState(result);
    }
    public void undo(){
        result = memento.getState();
    }
}
