/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javadesignpatterns.BuilderPattern;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;

/**
 *
 * @author shrut
 */
public class Architect {
    
    public static void main(String[] args) {
        
        Room room1 =  new RoomBuilder().setFloorNumber(1).createRoom();
        Room room2 = new RoomBuilder().setFloorNumber(2).createRoom();
//        RoomListBuilder rooms = new RoomListBuilder();
//        
//        Room room1 = new RoomBuilder(rooms).setFloorNumber(1).createRoom();
//        Room room2 = new RoomBuilder(rooms).setFloorNumber(2).createRoom();
//        
//        House house = new House(rooms);

        ArrayList<Room> rooms = new RoomListBuilder().addList()
                .addRoom().setFloorNumber(1).addRoomToList()
                .addRoom().setFloorNumber(2).addRoomToList()
                .buildList();

//        ArrayList<Room> rooms = new RoomListBuilder().addList()
//                .addRoom(room1)
//                .addRoom(room2)
//                .buildList();
    }
}
