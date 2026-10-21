import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class MyArtwork extends JPanel {
	
	int dy; //field
	ImageIcon sheep;
	String[] friends;
	
	public MyArtwork() {
		String data = "Andrew,Eve,Maddox,Lester,Markham,Mekel,Balaji";
		friends = data.split(",");
		friends[2] = "Alyssa";
		/*for (int i=0; i<friends.length; i++) {
			IO.println(i + " " + friends[i] + "'s favourite class is CS202");
		}
		for (var f: friends) {
			IO.println(f + "'s favourite class is CS202!");
		}
		for (int i=0; i<5; i++) {
			IO.println(i + " Go Seasiders!");
		}*/
		
		int i=10;
		/*while (i<5) {
			IO.println(i + " Go Seasiders!);
			i++;
		}*/
		do {
			IO.println(i + " Go Seasiders!");
			i++;
		} while (i<5);
	}

	@Override //good for debugging
	public void paintComponent(Graphics g) {
		
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new MyArtwork());
		window.setVisible(true);
	}
}