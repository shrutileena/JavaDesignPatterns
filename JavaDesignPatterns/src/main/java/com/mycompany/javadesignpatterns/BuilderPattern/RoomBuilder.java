/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.BuilderPattern;

import java.awt.Color;
import java.awt.Dimension;


public class RoomBuilder {

    private Dimension dimension;
    private int ceilingHeight;
    private int floorNumber;
    private Color wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private RoomListBuilder roomListBuilder;

    public RoomBuilder() {
    }

//    public RoomBuilder(RoomListBuilder roomListBuilder) {
//        this.roomListBuilder = roomListBuilder;
//    }
    
    public RoomBuilder setDimension(Dimension dimension) {
        this.dimension = dimension;
        return this;
    }

    public RoomBuilder setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
        return this;
    }

    public RoomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public RoomBuilder setWallColor(Color wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public RoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public RoomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public Room createRoom() {
        return new Room(dimension, ceilingHeight, floorNumber, wallColor, numberOfWindows, numberOfDoors);
    }
    
    public RoomListBuilder addRoomToList(){
        Room room = createRoom();
        this.roomListBuilder.addRoom(room);
        return this.roomListBuilder;
    }
    
}
