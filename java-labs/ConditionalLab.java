import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class ConditionalLab extends JPanel {
	
	//field variables
	String gender;
	int dy;
	ImageIcon primary;
	ImageIcon builder;
	ImageIcon messengers;
	ImageIcon gatherer;
	ImageIcon rs;
	ImageIcon deacon;
	ImageIcon teacher;
	ImageIcon priest;
	ImageIcon elder;
	
	public ConditionalLab() {
		//input box
		gender = JOptionPane.showInputDialog("m or f?");
		String age = JOptionPane.showInputDialog("What age will you be at the end of the year?");
		
		//converts string to int
		dy = Integer.parseInt(age);
		
		// load images
		primary = new ImageIcon ("primary.jpg");
		builder = new ImageIcon ("builder.png");
		messengers = new ImageIcon ("messengers.png");
		gatherer = new ImageIcon ("gatherer.png");
		rs = new ImageIcon ("rs.jpg");
		deacon = new ImageIcon ("deacon.jpg");
		teacher = new ImageIcon ("teacher.jpg");
		priest = new ImageIcon ("priest.jpg");
		elder = new ImageIcon ("elder.jpg");
		
	}

	@Override //good for debugging
	public void paintComponent(Graphics g) {
		var w = getWidth();
		var h = getHeight();
		
		// background color
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, w, h);
		
		// color for text
		g.setColor(Color.WHITE);
		
		//female block
		if (gender.equalsIgnoreCase("f")) {
			if (dy < 0) {
				g.drawString("Are you sure you typed that in correctly?",150,25);
			} else if (dy < 12) {
				g.drawString("You go to the Primary!",150,25);
				primary.paintIcon(null, g,150,150);
			} else if (dy < 14) {
				g.drawString("You are a Builder of Faith.",150,25);
				builder.paintIcon(null, g,150,150);
			} else if (dy < 16) {
				g.drawString("You are a Messenger of Hope.",150,25);
				messengers.paintIcon(null,g,150,150);
			} else if (dy < 18) {
				g.drawString("You are a Gatherer of Light.",150,25);
				gatherer.paintIcon(null,g,150,150);
			} else if (dy <= 119) {
				g.drawString("You are a member of the Relief Society.",150,25);
				rs.paintIcon(null,g,150,150);
			} else {
				g.drawString("Are you sure you typed that correctly?",150,25);
			}
			
		// male block
		} else if (gender.equalsIgnoreCase("m")) {
			if (dy < 0) {
			g.drawString("Are you sure you typed that in correctly?",150,25);
			} else if (dy < 12) {
				g.drawString("You go to the Primary!",150,25);
				primary.paintIcon(null, g,150,150);
			} else if (dy < 14) {
				g.drawString("You belong to the Deacons quorum.",150,25);
				deacon.paintIcon(null, g,150,150);
			} else if (dy < 16) {
				g.drawString("You belong to the Teachers quorum.",150,25);
				teacher.paintIcon(null,g,150,150);
			} else if (dy < 18) {
				g.drawString("You belong to the Priests quorum.",150,25);
				priest.paintIcon(null,g,150,150);
			} else if (dy <= 119) {
				g.drawString("You belong to the Elders quorum.",150,25);
				elder.paintIcon(null,g,150,150);
			} else {
				g.drawString("Are you sure you typed that correctly?",150,25);
			}
		} else {
			g.drawString("Are you sure you typed that correctly?",150,25);
		}
		
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new ConditionalLab());
		window.setVisible(true);
	}
}