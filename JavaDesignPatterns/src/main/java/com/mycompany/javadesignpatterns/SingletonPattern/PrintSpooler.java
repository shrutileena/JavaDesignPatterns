/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.SingletonPattern;

/**
 *
 * @author shrut
 */
public class PrintSpooler {
    
    // only one instance i.e., private
    // Can only be initialized using init private method
    // Can only be accessed using getInstance method
    private static final PrintSpooler spooler = new PrintSpooler();
    
    private static boolean initialized = false;
    
    // Constructor is also private
    private PrintSpooler(){}
    
    private void init(){
        
    }
    
    // synchronized is used when we want to prevent two resources using same instance at the same time
    // It will not allow second thread to access this method till first method is still has access to it
    // It will lock it until it had finished
    // synchronized prevents two threads entering a method at the same time
    public static synchronized PrintSpooler getInstance(){
        
        if(initialized) return spooler;
//        spooler = new PrintSpooler();
        spooler.init();
        initialized = true;
        return spooler;
    }
}
