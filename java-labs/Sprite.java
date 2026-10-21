import java.awt.*;
import javax.swing.*;

public abstract class Sprite implements Drawable {
    
    //fields
    protected Room currentRoom;
    protected ImageIcon image;

    public Sprite() {
        
        //setting to null for checks
        currentRoom = null;
        image = null;
    }

    public void setCurrentRoom(Room r) {
        currentRoom = r;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void draw(Graphics g) {
        if (currentRoom != null && image != null) {
            
            //get room position
            Point p = currentRoom.getPosition();

            //get image size
            int width = image.getIconWidth();
            int height = image.getIconHeight();

            //center image inside 50x50 room
            int drawX = p.x + (50 - width) / 2;
            int drawY = p.y + (50 - height) / 2;

            //draw it
            image.paintIcon(null, g, drawX, drawY);
        }
    }

    //checks if currentRoom exits exist and updates new currentRoom location
    public void moveNorth() {
        if (currentRoom != null && currentRoom.hasNorthExit()) {
            currentRoom = currentRoom.getNorthExit();
        }
    }
    public void moveSouth() {
        if (currentRoom != null && currentRoom.hasSouthExit()) {
            currentRoom = currentRoom.getSouthExit();
        }
    }
    public void moveEast() {
        if (currentRoom != null && currentRoom.hasEastExit()) {
            currentRoom = currentRoom.getEastExit();
        }
    }
    public void moveWest() {
        if (currentRoom != null && currentRoom.hasWestExit()) {
            currentRoom = currentRoom.getWestExit();
        }
    }
}
