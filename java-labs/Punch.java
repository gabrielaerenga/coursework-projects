import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Punch extends JPanel {

	//fields
	private LemonadeStand stand1;
	private LemonadeStand stand2;
	
	//constructor for stands
	public Punch() {
		stand1 = new LemonadeStand();

		stand2 = new LemonadeStand(330, 100);
		stand2.setSignColor(Color.GREEN);
		stand2.setTextColor(Color.WHITE);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		// background
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 800, 800);
		
		// grass
		g.setColor(Color.GREEN);
		g.fillRect(0, 300, 800, 500);
		
		// sun
		g.setColor(Color.yellow);
		g.fillOval(25,25,50,50);
		
		// clouds
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(275,50,100,30);
		g.fillOval(220,50,100,30);
		g.fillOval(250,40,90,30);
		
		//draw punch stands
		stand1.draw(g);
		stand2.draw(g);
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800,800);
		window.setContentPane(new Punch());
		window.setVisible(true);
	}
}