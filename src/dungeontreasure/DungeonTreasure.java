/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dungeontreasure;

import java.util.Scanner;

/**
 *
 * @author Ronja
 */
public class DungeonTreasure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Getting the username
        System.out.println("Welcome to Dragon Treasure, enter your username and press enter to start a new game");
        Player playerName = new Player(input.nextLine());
    }
    public static void setupGame() {
        // Creating doors array
        Door north = new Door('n', false);
        Door south = new Door('s', false);
        Door east = new Door('e', false);
        Door west = new Door('v', false);

        // Creating the rooms array
        Room[][] rooms = new Room[2][4];
        
        //First room 
        // * - -
        // - - -
        Door[] entranceRoom = new Door[2];
        entranceRoom[0] = north;
        entranceRoom[1] = south;
        rooms[0][0] = new Room("Your in the first room", entranceRoom);
        
        //Second room
        // - * -
        // - - -
        Door[] secondRoom = new Door[3];
        secondRoom[0] = west;
        secondRoom[1] = south;
        secondRoom[2] = east;
        rooms[1][0] = new Room("You are in the secondroom", secondRoom);
        
        // Third room
        // - - *
        // - - -
        Door[] thirdRoom = new Door[2];
        thirdRoom[0] = west;
        thirdRoom[1] = south;
        rooms[2][0] = new Room("You are in the third room", thirdRoom);
        
        // Fourth room
        // - - -
        // * - -
        Door[] forthRoom = new Door[2];
        forthRoom[0] = north;
        forthRoom[1] = east;
        rooms[0][1] = new Room("You are in the fourth room", forthRoom);

        // Fifth room
        // - - -
        // - * -
        Door[] fifthRoom = new Door[3];
        fifthRoom[0] = west;
        fifthRoom[1] = north;
        fifthRoom[2] = east;
        rooms[0][2] = new Room("You are in the fifth room", fifthRoom);

        // Sixth room
        // - - -
        // - - *
        // Creating doors for room 6
        Door[] sixthRoom = new Door[2];
        sixthRoom[0] = west;
        sixthRoom[1] = north;
        // Creating room 6 in array place 0,3
        rooms[0][3] = new Room("You are in the sixth room", sixthRoom);

        Dungeon dungeon = new Dungeon(null, null)

    }
}
