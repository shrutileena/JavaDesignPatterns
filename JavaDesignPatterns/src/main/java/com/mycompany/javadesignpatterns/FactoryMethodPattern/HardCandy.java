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
public class HardCandy extends Candy{

    @Override
    ArrayList<Candy> makeCandyPackage(int quantity) {
        ArrayList hardCandyPackage = new ArrayList();
        for(int i=0; i<quantity; i++){
            hardCandyPackage.add(new HardCandy());
        }
        System.out.println(quantity+" package of hard candy package.");
        return hardCandyPackage;
    }
    
}
