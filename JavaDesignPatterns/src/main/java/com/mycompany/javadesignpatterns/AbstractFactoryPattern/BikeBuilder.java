
package com.mycompany.javadesignpatterns.AbstractFactoryPattern;

/**
 *
 * @author bethan
 */
public class BikeBuilder {    

    public static void main(String[] args) {
        
        createBikeWithoutAbstractFactory();              
        
        createBikeWithAbstractFactory("mountain bike");
        
    }
    
    public static void createBikeWithoutAbstractFactory() {
        
        MountainBikeTire mountainBikeTireFront = new MountainBikeTire();
        MountainBikeTire mountainBikeTireBack = new MountainBikeTire();
        MountainBikeHandlebar mountainBikeHandlebar = new MountainBikeHandlebar();        
        mountainBikeTireFront.getDescription();
        mountainBikeTireBack.getDescription();
        mountainBikeHandlebar.getDescription();
        System.out.println();  
        
    }
    
    public static void createBikeWithAbstractFactory(String type) {
        
        BikeFactory bikeFactory = FactoryCreator.createFactory(type);        
//        Tire tireFront = bikeFactory.createTire();
//        Tire tireBack = bikeFactory.createTire();
//        Handlebar handlebar = bikeFactory.createHandlebar();
        Tire tireFront = (Tire) bikeFactory.create("tire");
        Tire tireBack = (Tire) bikeFactory.create("tire");
        Handlebar handlebar = (Handlebar) bikeFactory.create("handlebar");
        tireFront.getDescription();
        tireBack.getDescription();
        handlebar.getDescription();  
        System.out.println();
        
    }
    
}
