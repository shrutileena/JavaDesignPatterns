package org.example;

public class FictionBook implements Book {
    String name;
    boolean checkedOut;
    boolean isAPlay;

    public FictionBook(String name, boolean isAPlay) {
        this.name = name;
        this.isAPlay = isAPlay;
        this.checkedOut = false;
    }
    public void checkout(){
        if(!checkedOut){
            System.out.println("Checking out " + name + "\n");
            checkedOut = true;
        } else {
            System.out.println(name + " already checked out\n");
        }
    }
    public void returnBook(){
        if(checkedOut){
            System.out.println("Returning " + name + "\n");
            checkedOut = false;
        } else {
            System.out.println(name + " is not checked out\n");
        }
    }
}
