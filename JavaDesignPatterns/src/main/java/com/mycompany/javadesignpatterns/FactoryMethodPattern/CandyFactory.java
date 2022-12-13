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
public class CandyFactory {
    
        public static Candy getCandy(String type){
        switch (type) {
            case "hard candy":
                return new HardCandy();
            case "chocolate":
                return new Chocolate();
            default:
                return null;
        }
    }
    
    public static ArrayList getCandyPackage(int quantity, String type){
        Candy candy = getCandy(type);
        ArrayList candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }
}
