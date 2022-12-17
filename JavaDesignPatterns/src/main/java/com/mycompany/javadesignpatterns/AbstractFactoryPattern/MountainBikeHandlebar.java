
package com.mycompany.javadesignpatterns.AbstractFactoryPattern;

/**
 *
 * @author shrut
 */
public class MountainBikeHandlebar extends Handlebar {
    
    private static String type = "FLAT";
    
    @Override
    public void getDescription() {
        System.out.println("Mountain bike handlebar. Type: " + type);
    }
    
}
