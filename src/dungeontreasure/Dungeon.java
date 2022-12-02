/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontreasure;

import java.util.Scanner;

/**
 *
 * @author Ronja
 */
public class Dungeon {
    private Room[][] rooms;
    private Room currentRoom;
    private String welcomeMsg;
    private String playerName;
    
    public Dungeon(Room[][] rooms, Room currentRoom, String welcomeMsg, String playerName) {
        this.rooms = rooms;
        this.currentRoom = currentRoom;
        this.welcomeMsg = welcomeMsg;
        this.playerName = playerName;
    }

    public void playGame() {
        Scanner input = new Scanner(System.in);

        System.out.println(welcomeMsg);
        // Setting currentRoom to first room in cave
        // for (Room room : rooms) {
        //    currentRoom = room;
        //    currentRoom.doNarrative();
        //    String choise = input.nextLine();
        // }
    }
}
