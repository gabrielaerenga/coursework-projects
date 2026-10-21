import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class MethodsLab extends JPanel {
	
	//field
	ArrayList<String> instructions;
	
	public MethodsLab() {
		//initialise ArrayList
		instructions = new ArrayList<String>();
		
		//get filename input from user
		String filename = JOptionPane.showInputDialog("Enter the filename:");
		
		try {
			//file variable f
			File f = new File(filename);
			
			//scanner to read files
			Scanner s = new Scanner(f);
			
			//read file into arrayList
			while (s.hasNextLine()) {
				instructions.add(s.nextLine());
			}
			
			//close scanner after reading file
			s.close();
			
			
		} catch (FileNotFoundException e) {
			//error handling
			IO.println("File not found: " + filename);
		}
	}
	
	//changes the drawing color
	public void changeColor(int red, int green, int blue, Graphics g) {
		g.setColor(new Color(red, green, blue));
	}
	
	//draws a triangle
	public void drawTriangle(int x1, int y1, int x2, int y2, int x3, int y3, Graphics g) {
		g.drawLine(x1, y1, x2, y2);
		g.drawLine(x2, y2, x3, y3);
		g.drawLine(x3, y3, x1, y1);
	}
	
	//draws a circle
	public void drawCircle(int xc, int yc, int r, Graphics g) {
		g.drawOval(xc - r, yc - r, r * 2, r * 2);
	}
	
	//reads a line in file and executes commands
	public void parseCommand(String command, Graphics g) {
		//array parts is assigned values after being split
		String[] parts = command.split(" ");
		
		//commands for circle
		if (parts[0].equals("CIRCLE")) {
			int xc = Integer.parseInt(parts[1]);
			int yc = Integer.parseInt(parts[2]);
			int r = Integer.parseInt(parts[3]);
			
			//calling drawCircle method
			drawCircle(xc, yc, r, g);
		}
		
		//commands for triangle
		else if (parts[0].equals("TRIANGLE")) {
			int x1 = Integer.parseInt(parts[1]);
			int y1 = Integer.parseInt(parts[2]);
			int x2 = Integer.parseInt(parts[3]);
			int y2 = Integer.parseInt(parts[4]);
			int x3 = Integer.parseInt(parts[5]);
			int y3 = Integer.parseInt(parts[6]);
			
			//calling drawTriangle method
			drawTriangle(x1, y1,x2, y2, x3, y3, g);
		}
		
		//commands for color
		else if (parts[0].equals("COLOR")) {
			int r = Integer.parseInt(parts[1]);
			int green = Integer.parseInt(parts[2]);
			int b = Integer.parseInt(parts[3]);
			
			//calling changeColor method
			changeColor(r, green, b, g);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//loop through instructions from file
		for (String command : instructions) {
			parseCommand(command, g);
		}
		
		/*//red circle
		changeColor(255, 0, 0, g);
		drawCircle(250, 150, 50, g);
		
		//green triangle
		changeColor(0, 255, 0, g);
		drawTriangle(80, 150, 170, 150, 125, 80, g);*/
		
	}


	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new MethodsLab());
		window.setVisible(true);
	}
}