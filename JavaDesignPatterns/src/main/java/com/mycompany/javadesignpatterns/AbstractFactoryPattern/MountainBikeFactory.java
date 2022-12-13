
package com.mycompany.javadesignpatterns.AbstractFactoryPattern;

/**
 *
 * @author bethan
 */
public class MountainBikeFactory extends BikeFactory {
    
//    @Override
//    public Tire createTire() {
//        return new MountainBikeTire();
//    }
//    
//    @Override
//    public Handlebar createHandlebar() {
//        return new MountainBikeHandlebar();
//    }
    
    @Override
    public BikePart create(String type) {
        if(type.equalsIgnoreCase("tire")){
            return new MountainBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")){
            return new MountainBikeHandlebar();
        } else{
            return null;
        }
    }
    
}
