import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

public class ArraysLab extends JPanel {
	
	//field arrays for huge files
	int[][] allx = new int[2000][];
	int[][] ally = new int[2000][];
	int[] sizes = new int[2000];
	
	int shapeCount = 0;
	
	public ArraysLab() {
		//ask user for filename input and store that in f
		String filename = JOptionPane.showInputDialog("Enter the filename:");
		File f = new File(filename);
		
		try {
			//scanner to read the file
			Scanner s = new Scanner(f);
			
			/*//read width and height
			int width = s.nextInt();
			int height = s.nextInt();*/
			
			//while loop to read through file till end
			while (s.hasNext()) {
				//first number on each line tells how many points there are
				int numPoints = s.nextInt();
				
				//arrays for drawing/shape
				int[] x = new int[numPoints];
				int[] y = new int[numPoints];
				
				//read all x and y coordinates into arrays
				for (int i = 0; i < numPoints; i++) {
					x[i] = s.nextInt();
					y[i] = s.nextInt();
				}
				
				//store arrays into the larger arrays
				allx[shapeCount] = x;
				ally[shapeCount] = y;
				
				//store number of points file contains
				sizes[shapeCount] = numPoints;
				
				//move to next drawing
				shapeCount++;
			}
			
			//close file after reading it
			s.close();
			
		} catch (FileNotFoundException e) {
			//if file not found
			IO.println("Could not open " + filename);
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//loop through drawings that are stored in the larger arrays
		for (int i = 0; i < shapeCount; i++) {
			
			//get current arrays
			int[] x = allx[i];
			int[] y = ally[i];
			
			//get number of points
			int n = sizes[i];
			
			//draw lines
			for (int j = 0; j < n -1; j++) {
				g.drawLine(x[j], y[j], x[j + 1], y[j + 1]);
			}
		}
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new ArraysLab());
		window.setVisible(true);
	}
}