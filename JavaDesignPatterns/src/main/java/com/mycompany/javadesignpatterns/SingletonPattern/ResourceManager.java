/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.SingletonPattern;

/**
 *
 * @author shrut
 */
public class ResourceManager {
    
    public static void main(String[] args) {
        
        // Below statement gives error as constructor is private
        // only one instance can be created
        // PrintSpooler spooler = new PrintSpooler();

        PrintSpooler spooler = PrintSpooler.getInstance();
    }
}
