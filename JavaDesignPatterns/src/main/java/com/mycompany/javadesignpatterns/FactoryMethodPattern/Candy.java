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
public abstract class Candy {
    
    abstract ArrayList<Candy> makeCandyPackage(int quantity);
}
