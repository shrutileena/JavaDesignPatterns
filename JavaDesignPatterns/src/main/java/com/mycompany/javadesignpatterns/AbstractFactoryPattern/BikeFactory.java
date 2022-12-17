
package com.mycompany.javadesignpatterns.AbstractFactoryPattern;

/**
 *
 * @author shrut
 */
public abstract class BikeFactory {        
    
//    abstract Tire createTire();
//    
//    abstract Handlebar createHandlebar();        
    
    abstract BikePart create(String type);
}
