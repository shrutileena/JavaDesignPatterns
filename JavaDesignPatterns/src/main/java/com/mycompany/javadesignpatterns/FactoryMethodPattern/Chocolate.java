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
public class Chocolate extends Candy{

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList chocolatePackage = new ArrayList();
        for(int i=0; i<quantity; i++){
            chocolatePackage.add(new Chocolate());
        }
        return chocolatePackage;
    }
    
}
