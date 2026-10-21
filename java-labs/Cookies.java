import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class Cookies extends JPanel {
	
	public Cookies() {
		//Your custom initialization code here
	}

	@Override
	public void paintComponent(Graphics g) {
		/*var dx = 50;
		var dy = -100;*/
		
		// background
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 400, 400);
		
		// grass
		g.setColor(Color.GREEN);
		g.fillRect(0, 300, 400, 150);
		
		// sun
		g.setColor(Color.yellow);
		g.fillOval(25,25,50,50);
		
		// clouds
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(275,50,100,30);
		g.fillOval(220,50,100,30);
		g.fillOval(250,40,90,30);
		
		// stand bottom
		g.setColor(Color.GRAY);
		g.fillRect(100,230,200,90);
		
		// stand top
		g.setColor(Color.ORANGE);
		g.fillRect(100,100,200,80);
		
		// stand supports
		g.setColor(Color.RED);
		g.fillRect(120,180,10,50);
		g.fillRect(270,180,10,50);
		
		// lettering
		g.setColor(Color.BLACK);
		// G
		g.drawLine(140, 110, 140, 160); // left side
		g.drawLine(140, 110, 190, 110); // top
		g.drawLine(140, 160, 190, 160); // bottom
		g.drawLine(190, 140, 190, 160); // right lower side
		g.drawLine(170, 140, 190, 140); // middle bar

		// A
		g.drawLine(220, 160, 245, 110); // left diagonal
		g.drawLine(245, 110, 270, 160); // right diagonal
		g.drawLine(230, 140, 260, 140); // middle bar
		
		// text
		g.drawString("Fruit Punch: $2",170,175);
		
		// fruit punch
		g.setColor(Color.PINK);
		g.fillRect(200,200,10,20);
	}

	void main() {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new Cookies());
		window.setVisible(true);
	}
}