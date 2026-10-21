import java.awt.*;
import javax.swing.*;

public abstract class Pokemon {
    private int hp;
    private Rectangle bounds;
    private String name;
    private ImageIcon picture;
    private int type;

    public static final int NORMAL = 0;
    public static final int FIRE = 1;
    public static final int WATER = 2;
    public static final int FLYING = 3;
    public static final int GRASS = 4;
    public static final int POISON = 5;
    public static final int ELECTRIC = 6;
    public static final int GROUND = 7;
    public static final int PSYCHIC = 8;
    public static final int ROCK = 9;
    public static final int ICE = 10;
    public static final int BUG = 11;
    public static final int DRAGON = 12;
    public static final int GHOST = 13;
    public static final int DARK = 14;
    public static final int STEEL = 15;
    public static final int FAIRY = 16;

    //initializer block
    {
        bounds = new Rectangle();
    }

    public Pokemon(String n) {
        this(n, 65);
    }

    public Pokemon(String nombre, int h) {
        hp = h;
        bounds = new Rectangle();
        name = nombre;
    }

    public void moveTo(int x, int y) {
        bounds.setLocation(x, y);
    }

    public void drag(int dx, int dy) {
        bounds.translate(dx, dy);
    }

    public void setPicture(String filename) {
        picture = new ImageIcon(filename);
        int w = picture.getIconWidth();
        int h = picture.getIconHeight();
        bounds.setSize(w, h);
    }

    public void battle(Pokemon Opponent) {
        //to do later
    }

    public void draw(Graphics g) {
        //if picture is real, call the method and draw
        if (picture != null) {
            picture.paintIcon(null, g, bounds.x, bounds.y);
        
        g.drawString(greeting(), bounds.x, bounds.y);
        }
    }

    public void talk() {
        IO.println(greeting());
    }

    public abstract String greeting();
    
    public boolean contains(int x, int y) {
        return bounds.contains(x, y);
        /*if (bounds.contains(x, y)) {
            return true;
        } else {
            return false;
        }*/
    }
}