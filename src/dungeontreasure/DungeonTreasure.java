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
        //playGame(playerName)
        Door door = new Door('s' , false);
        System.out.println(door.getDoor());
    }
    
}
