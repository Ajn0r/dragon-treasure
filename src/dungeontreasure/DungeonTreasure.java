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
        
        //Getting the username
        System.out.println("Welcome to Dragon Treasure, enter your username and press enter to start a new game");
        Player playerName = new Player(input.nextLine());
        //playGame(playerName)
        setupGame();

    }
    public static void setupGame() {
        // Creating all doors
        Door sö = new Door('s' , false);
        Door norr = new Door('n' , false);
        Door öst = new Door('ö' , false);
        Door väst = new Door('v' , false);
        
        Door[] sv = {sö, väst};
        Door[] sn = {sö, norr};
        Door[] ös = {sö, öst};
         
        ArrayList<Room> rooms = new ArrayList<>();
        Room room1 = new Room("Du går in i grottan och dörren kollapsar bakom dig", sn);
        rooms.add(room1);
        Room room2 = new Room("Du är i ett annat rum", ös);
        rooms.add(room2);
        room1.doNarrative();
    }
}
