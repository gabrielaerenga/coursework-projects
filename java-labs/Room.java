import java.awt.*;

public class Room implements Drawable {
    
    //fields
    private Point pos;
    private Room eastExit;
    private Room northExit;
    private Room westExit;
    private Room southExit;
    public static final int SIZE = 50;
    
    //creates room at position
    //initialized all exits to null
    public Room(int x, int y) {
        pos = new Point(x, y);

        eastExit = null;
        northExit = null;
        westExit = null;
        southExit = null;
    }
    //2 way connections between rooms
    public void setEastExit(Room r) {
        eastExit = r;
        r.westExit = this;
    }
    public void setWestExit(Room r) {
        westExit = r;
        r.eastExit = this;
    }
    public void setNorthExit(Room r) {
        northExit = r;
        r.southExit = this;
    }
    public void setSouthExit(Room r) {
        southExit = r;
        r.northExit = this;
    }

    //draws the room walls
    //solid wall = no exit/null
    //broken wall = exit exists and drawn accordingly
    public void draw(Graphics g) {
        int x = pos.x;
        int y = pos.y;

        //north wall
        if (northExit == null) {
            g.drawLine(x, y, x + SIZE, y);
        } else {
            g.drawLine(x, y, x + 20, y);
            g.drawLine(x + 30, y, x + SIZE, y);
        }
        //south wall
        if (southExit == null) {
            g.drawLine(x, y + SIZE, x + SIZE, y + SIZE);
        } else {
            g.drawLine(x, y + SIZE, x + 20, y + SIZE);
            g.drawLine(x + 30, y + SIZE, x + SIZE, y + SIZE);
        }
        //west wall
        if (westExit == null) {
            g.drawLine(x, y, x, y + SIZE);
        } else {
            g.drawLine(x, y, x, y + 20);
            g.drawLine(x, y + 30, x, y + SIZE);
        }
        //east wall
        if (eastExit == null) {
            g.drawLine(x + SIZE, y, x + SIZE, y + SIZE);
        } else {
            g.drawLine(x + SIZE, y, x + SIZE, y + 20);
            g.drawLine(x + SIZE, y + 30, x + SIZE, y + SIZE);
        }

        //hallways
        if (eastExit != null) {
            g.drawLine(x + SIZE, y + 20, x + 60, y + 20);
            g.drawLine(x + SIZE, y + 30, x + 60, y + 30);
        }
        if (southExit != null) {
            g.drawLine(x + 20, y + SIZE, x + 20, y + 60);
            g.drawLine(x + 30, y + SIZE, x + 30, y + 60);
        }
    }

    //getter for room
    public Point getPosition() {
        return pos;
    }

    //checks for exits in currentRoom
    public boolean hasNorthExit() {
        //encapsulation
        return northExit != null;
    }
    public boolean hasSouthExit() {
        if (southExit == null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean hasEastExit() {
        if (eastExit == null) {
            return false;
        } else {
            return true;
        }
    }
    public boolean hasWestExit() {
        if (westExit == null) {
            return false;
        } else {
            return true;
        }
    }

    //getters for currentRoom location
    public Room getNorthExit() {
        return northExit;
    }
    public Room getSouthExit() {
        return southExit;
    }
    public Room getEastExit() {
        return eastExit;
    }
    public Room getWestExit() {
        return westExit;
    }
}
