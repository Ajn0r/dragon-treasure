/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dungeontreasure;

/**
 *
 * @author Ronja
 */
public class Door {
    private char position;
    private boolean locked;
    
    public Door(char position, boolean locked) {
        this.position = position;
        this.locked = locked;
    }
    
    public void setDoor(char position, boolean locked) {
        this.position = position;
        this.locked = locked;
    }
    
    public boolean isLocked() {
        return locked;
    }
    
    public String getDoor() {
        if (locked) {
            return "There is a door to the " + position + "but's it's locked"; 
        }
        else 
            return "You can go " + position;
    }
}
