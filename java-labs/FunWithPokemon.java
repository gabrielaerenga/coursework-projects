import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class FunWithPokemon extends JPanel implements MouseListener, MouseMotionListener {

    private Charmander marksCharmander;
    private Pichu tomsPichu;
    private Bulbasaur lester;
    private ArrayList<Pokemon> pokestop;
    private Pokemon selected;
    private Point previousXY;

    public FunWithPokemon() {
        addMouseListener(this);
        addMouseMotionListener(this);
        marksCharmander = new Charmander("Mark Nephi's All-Powerful Charmander");
        marksCharmander.moveTo(50,70);
        tomsPichu = new Pichu("Tom's adorable electric Pichu");
        tomsPichu.moveTo(300, 100);
        lester = new Bulbasaur();
        lester.moveTo(100, 400);
        pokestop = new ArrayList<>();
        pokestop.add(marksCharmander);
        pokestop.add(tomsPichu);
        pokestop.add(lester);
        lester.talk();
        /* if (lester instanceof Bulbasaur) {
            IO.println("Lester is the proud owner of a bulbasaur");
        }
        if (lester instanceof Pichu) {
            IO.println("Lester is the proud owner of a pichu");
        }
        if (lester instanceof Charmander) {
            IO.println("Lester is the proud owner of a charmander");
        } */
    }
    
    @Override
	public void paintComponent(Graphics g) {
        marksCharmander.draw(g);
        tomsPichu.draw(g);
        lester.draw(g);
	}

	void main() {
		var window = new JFrame();
		window.setSize(800,800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new FunWithPokemon());
		window.setVisible(true);
	}

    @Override
    public void mouseClicked(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
    @Override
    public void mousePressed(MouseEvent e) {
        //IO.println("You clicked the mouse in the window!");
        int x = e.getX();
        int y = e.getY();

        for (var p : pokestop) {
            if (p.contains(x, y)) {
                p.talk();
                selected = p;
                previousXY = new Point();
            }
        }

        /*if (marksCharmander.contains(x, y)) {
            IO.println("You clicked the Charmander!");
        } else if (tomsPichu.contains(x, y)) {
            IO.println("You clicked the Pichu!");
        } else if (lester.contains(x, y)) {
            IO.println("You clicked the Bulbasaur!");
        } else {
            IO.println("You missed!");
        }*/
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        //IO.println("You let go of the mouse button in this window!");
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        int dx = e.getX() - previousXY.x;
        int dy = e.getY() - previousXY.y;
        selected.drag(dx, dy);
        previousXY.setLocation(e.getX(), e.getY());
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent e) {}
}
