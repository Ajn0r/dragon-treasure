/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontreasure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ronja
 */
public class Dungeon {
    private ArrayList<Room> rooms;
    private Room currentRoom;
    private String welcomeMsg;
    
    public Dungeon(ArrayList<Room> rooms, String welcomeMsg) {
        this.rooms = rooms;
        this.welcomeMsg = welcomeMsg;
    }

    public void playGame() {
        Scanner input = new Scanner(System.in);

        System.out.println(welcomeMsg);
        // Setting currentRoom to first room in cave
        currentRoom = rooms.get(0);
        for (Room room : rooms) {
            currentRoom = room;
            currentRoom.doNarrative();
            String choise = input.nextLine();
        }
    }
}
