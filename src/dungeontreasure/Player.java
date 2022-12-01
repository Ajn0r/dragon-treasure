/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontreasure;

/**
 *
 * @author Ronja
 */
public class Player {
    // Spelarens namn
    private String name;
    
    //Konstruktor som initierar variabeln namn
    public Player(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
