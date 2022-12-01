/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontreasure;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ronja
 */
public class Room {
    private String roomDesc;
    private Door[] doors;
    
    public Room(String roomDesc, Door[] doors) {
        this.roomDesc = roomDesc;
        this.doors = doors;
    }

    public void doNarrative() {
        System.out.println(roomDesc);
        for (Door door : doors) {
            System.out.println(door.getDoor());
        }
    }

}
