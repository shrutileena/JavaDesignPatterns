/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.FactoryMethodPattern;

import java.util.ArrayList;

/**
 *
 * @author shrut
 */
public class CandyStore {

    private static final CandyFactory candyFactory = new CandyFactory();
    
    public static void main(String[] args) {
        
        candyFactory.getCandyPackage(1, "chocolate");
    }
}
