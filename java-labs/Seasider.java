import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.Graphics;

public class Seasider extends JPanel {
	
	@Override
	public void paintComponent(Graphics g) {
		g.drawString("A: Knock, knock", 20, 20);
		g.drawString("B: Who's there?", 20, 40);
		g.drawString("A: Europe", 20, 60);
		g.drawString("B: Europe who?", 20, 80);
		g.drawString("A: No i'm not!", 20, 100);
	}

	
	void main() {
		var window = new JFrame();
		window.setSize(200,200);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setContentPane(new Seasider());
		window.setVisible(true);
	}
	
}