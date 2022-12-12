/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.javadesignpatterns.BuilderPattern;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author shrut
 */
public interface Builder {

    Builder setCeilingHeight(int ceilingHeight);

    Builder setDimension(Dimension dimension);

    Builder setFloorNumber(int floorNumber);

    Builder setNumberOfDoors(int numberOfDoors);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setWallColor(Color wallColor);
    
    
}
