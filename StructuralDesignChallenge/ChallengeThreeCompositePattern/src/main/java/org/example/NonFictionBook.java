package org.example;

public class NonFictionBook implements Book {
    String name;
    boolean checkedOut;

    public NonFictionBook(String name) {
        this.name = name;
        this.checkedOut = false;
    }
    public void checkout(){
        if(!checkedOut){
            System.out.println("Checking out " + name + "\n");
            checkedOut = true;
        } else {
            System.out.println(name + " is already checked out\n");
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
