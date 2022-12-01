/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dungeontreasure;

import java.util.ArrayList;
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
        ArrayList<Room> rooms = new ArrayList<>();
        
        //Getting the username
        System.out.println("Welcome to Dragon Treasure, enter your username and press enter to start a new game");
        Player playerName = new Player(input.nextLine());
        //playGame(playerName)
        setupGame(rooms);
        Dungeon dungeon = new Dungeon(rooms, "Oh no! The entrance collapsed behind you " + playerName.getName());
        dungeon.playGame();
        System.out.println("Pjuh, looks like you made it out alive!");

    }
    public static void setupGame(ArrayList<Room> rooms) {
        // Creating all doors
        Door sö = new Door('s' , false);
        Door norr = new Door('n' , false);
        Door öst = new Door('ö' , false);
        Door väst = new Door('v' , false);
        Door utgång = new Door('u', false);
        
        Door[] sv = {sö, väst};
        Door[] nv = {norr, väst};
        Door[] sn = {sö, norr};
        Door[] ös = {sö, öst};
        Door[] vö = {väst, öst};
        Door[] nö = {norr, öst};
        Door[] nsö = {sö, öst, norr};
        Door[] söv = {sö, väst, öst};
        Door[] ut = {utgång, väst, norr};
        
        
        //Creating all rooms
        rooms.add(new Room("Du är i rum 1", sn));
        rooms.add(new Room("Du är i rum 2", ös));
        rooms.add(new Room("Du är i rum 3", vö));
        rooms.add(new Room("Du är i rum 4", söv));
        rooms.add(new Room("Du är i rum 5", sv));
        rooms.add(new Room("Du är i rum 6", nv));
        rooms.add(new Room("Du är i rum 7", nsö));
        rooms.add(new Room("Du är i rum 8", ut));
        rooms.add(new Room("Du är i rum 9", vö));
        rooms.add(new Room("Du är i rum 10", nö));
        


    }
}
