
package com.mycompany.javadesignpatterns.AbstractFactoryPattern;

/**
 *
 * @author bethan
 */
public class RoadBikeFactory extends BikeFactory {
    
//    @Override
//    public Tire createTire() {
//        return new RoadBikeTire();
//    }
//    
//    @Override
//    public Handlebar createHandlebar() {
//        return new RoadBikeHandlebar();
//    }
    
    @Override
    public BikePart create(String type) {
        if(type.equalsIgnoreCase("tire")){
            return new RoadBikeTire();
        } else if (type.equalsIgnoreCase("handlebar")){
            return new RoadBikeHandlebar();
        } else{
            return null;
        }
    }
}
