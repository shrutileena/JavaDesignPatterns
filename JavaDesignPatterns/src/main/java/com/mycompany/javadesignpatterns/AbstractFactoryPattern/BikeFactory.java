
package com.mycompany.javadesignpatterns.AbstractFactoryPattern;

/**
 *
 * @author bethan
 */
public abstract class BikeFactory {        
    
//    abstract Tire createTire();
//    
//    abstract Handlebar createHandlebar();        
    
    abstract BikePart create(String type);
}
