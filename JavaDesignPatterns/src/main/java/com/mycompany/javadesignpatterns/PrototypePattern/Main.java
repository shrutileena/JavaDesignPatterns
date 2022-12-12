/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.PrototypePattern;

/**
 *
 * @author shrut
 */
public class Main {
    
    public static void main(String[] args) {
        
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);
        rabbit.setOwner("Shruti");
        Rabbit rabbitClone = rabbit.clone();
        
        System.out.println(rabbit.getAge());
        System.out.println(rabbitClone.getAge());
        System.out.println(rabbit.getOwner().getName());
        System.out.println(rabbitClone.getOwner().getName());
        
        
        // Problem with Cloneable Interface - we changed clone's name but actual object name is also changed
        // This happened because they still share the same Person object
        // Fix - Person should also implement Cloneable Interface and override clone()
        // clone() in Rabbit class should clone owner as well along with rabbit
        rabbitClone.getOwner().setName("Sally");
        System.out.println(rabbit.getOwner().getName());
        System.out.println(rabbitClone.getOwner().getName()); 
    }
}
