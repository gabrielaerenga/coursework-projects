import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class AsteroidB612 extends JPanel {
	
	//ImageIcon sheep;
	String[] friends;
	private LittlePrince markham;
	private LittlePrince lester;
	
	public AsteroidB612() {
		markham = new LittlePrince();
		lester = new LittlePrince(100, 50);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		var w = getWidth();
		var h = getHeight();
		
		//draw background
		g.setColor(Color.BLACK);
		g.fillRect(0,0,w,h);
		
		//draw the asteroid
		g.setColor(Color.GRAY);
		g.fillOval(-200, 250, 800, 800);
		
		markham.draw(g);
		lester.draw(g);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new AsteroidB612());
		window.setVisible(true);
	}
}
