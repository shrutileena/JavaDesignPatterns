/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.BuilderPattern;

import java.util.ArrayList;

/**
 *
 * @author shrut
 */
public class RoomListBuilder {
    
    private ArrayList listOfRooms;
    
    public RoomListBuilder addList(){
        this.listOfRooms = new ArrayList();
        return this;
    }
    
    public RoomListBuilder addRoom(Room room){
        listOfRooms.add(room);
        return this;
    }
    
    public RoomBuilder addRoom(){
        return new RoomBuilder();
    }
    
    public ArrayList buildList(){
        return listOfRooms;
    }
}
