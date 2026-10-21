import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Maze extends JPanel implements KeyListener {
    
    //field
    //4x4 array to store all rooms in the maze
    private Room[][] rooms;
    private Nephi nephi;
    private Sword sword;
    private Laban laban;
    private Plates plates;
    private ArrayList<Drawable> drawables;

    //constructor
    //creates all rooms and connects them together
    public Maze() {

        //initialize arraylist
        drawables = new ArrayList<>();

        //calling keylistener
        addKeyListener(this);

        //set background color
        setBackground(Color.LIGHT_GRAY);

        //create the 4x4 array
        rooms = new Room[4][4];

        //create each room and place on screen
        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {
                
                int x = 50 + col * 60;
                int y = 50 + row * 60;

                rooms[row][col] = new Room(x, y);
                drawables.add(rooms[row][col]);
            }
        }

        //top row connections
        rooms[0][0].setSouthExit(rooms[1][0]);
        rooms[0][1].setSouthExit(rooms[1][1]);
        rooms[0][1].setEastExit(rooms[0][2]);
        rooms[0][2].setEastExit(rooms[0][3]);
        rooms[0][3].setSouthExit(rooms[1][3]);

        //2nd row connections
        rooms[1][0].setEastExit(rooms[1][1]);
        rooms[1][1].setEastExit(rooms[1][2]);
        rooms[1][2].setSouthExit(rooms[2][2]);
        rooms[1][3].setSouthExit(rooms[2][3]);

        //3rd row connections
        rooms[2][0].setSouthExit(rooms[3][0]);
        rooms[2][1].setEastExit(rooms[2][2]);
        rooms[2][2].setSouthExit(rooms[3][2]);
        rooms[2][1].setSouthExit(rooms[3][1]);

        //last row connections
        rooms[3][0].setEastExit(rooms[3][1]);
        rooms[3][1].setEastExit(rooms[3][2]);
        rooms[3][2].setEastExit(rooms[3][3]);   

        //setters and local var
        nephi = new Nephi();
        nephi.setCurrentRoom(rooms[0][0]);
        drawables.add(nephi);
        sword = new Sword();
        sword.setCurrentRoom(rooms[2][3]);
        drawables.add(sword);
        plates = new Plates();
        plates.setCurrentRoom(rooms[2][0]);
        drawables.add(plates);
        laban = new Laban();
        laban.setCurrentRoom(rooms[3][0]);
        drawables.add(laban);
    }

    //paints the maze on the panel
    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);

        //draw every room in the maze
        for (int row = 0; row <4; row++) {
            for (int col = 0; col < 4; col++) {
                rooms[row][col].draw(g);
            }
        }

        //loop
        for (Drawable d : drawables) {
            d.draw(g);
        }

        //recognise keyboard
        requestFocusInWindow();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Maze");
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new Maze ());
        frame.setVisible(true);
    }

    //keyevent methods
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        //player 1 controls
        if (key == KeyEvent.VK_UP) {
            nephi.moveNorth();
        }
        if (key == KeyEvent.VK_DOWN) {
            nephi.moveSouth();
        }
        if (key == KeyEvent.VK_LEFT) {
            nephi.moveWest();
        }
        if (key == KeyEvent.VK_RIGHT) {
            nephi.moveEast();
        }

        //player 2 controls
        if (key == KeyEvent.VK_W) {
            laban.moveNorth();
        }
        if (key == KeyEvent.VK_S) {
            laban.moveSouth();
        }
        if (key == KeyEvent.VK_A) {
            laban.moveWest();
        }
        if (key == KeyEvent.VK_D) {
            laban.moveEast();
        }

        //nephi picks up the sword in the maze
        if (nephi.getCurrentRoom() == sword.getCurrentRoom()) {
            nephi.pickUpSword();
            sword.setCurrentRoom(null);
        }

        if (nephi.getCurrentRoom() == plates.getCurrentRoom()) {
            JOptionPane.showMessageDialog(null, "congrats!");
            reset();
        }

        if (nephi.getCurrentRoom() == laban.getCurrentRoom()) {
            if (nephi.isArmed()) {
                laban.setCurrentRoom(null);
            } else {
                JOptionPane.showMessageDialog(null, "You died. Laban defeated you.");
                reset();
            }
        }
        repaint();
    }

    //reset game
    private void reset() {
        nephi.reset();
        nephi.setCurrentRoom(rooms[0][0]);
        sword.setCurrentRoom(rooms[2][3]);
        plates.setCurrentRoom(rooms[2][0]);
        laban.setCurrentRoom(rooms[3][0]);

    }
}


