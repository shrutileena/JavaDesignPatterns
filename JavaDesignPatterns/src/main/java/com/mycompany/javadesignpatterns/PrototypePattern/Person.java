/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.PrototypePattern;

/**
 *
 * @author shrut
 */
public class Person implements Cloneable{
    
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public Person clone(){
        try{
            return (Person) super.clone();
        } catch(CloneNotSupportedException ex){
            throw new AssertionError();
        }
    }
}
