import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JOptionPane;

public class LoopLab extends JPanel {
	
	//field for user input
	int size;
	
	//check if user chooses addition
	boolean ifAddition;
	
	public LoopLab() {
		//user input box
		String input = JOptionPane.showInputDialog("How big would you like your table to be? (n x n)");
		
		//convert user input to int
		size = Integer.parseInt(input);
		
		//table mode
		String mode = JOptionPane.showInputDialog("Multiplication or Addition? (m or a)");
		
		//checking mode and storing as boolean
		ifAddition = mode != null && mode.equalsIgnoreCase("a");
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//width and height of window panel
		var w = getWidth();
		var h = getHeight();
		
		//size of each cell
		int cellWidth = w / size;
		int cellHeight = h / size;
		
		//draw table
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				
				//position of cell
				int x = col * cellWidth;
				int y = row * cellHeight;
				
				//draw grid cells
				g.drawRect(x, y, cellWidth, cellHeight);
				
				//computing values based on type chosen
				int cell;
				if (ifAddition) {
					cell = row + col;
				} else {
					cell = (row + 1) * (col +1);
				}
				
				//draw number in top left corner
				g.drawString(String.valueOf(cell), x + 5, y + 15);
			}
		}
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(500,500);
		window.setContentPane(new LoopLab());
		window.setVisible(true);
	}
}