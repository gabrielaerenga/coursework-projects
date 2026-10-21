import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class FileExample extends JPanel {
	
	public FileExample() {
		//IO.println("Creating the string...");
		String filename = "friends.txt";
		//IO.println("Creating the file...");
		File f = new File(filename);
		//IO.println("Creating the arrayList...");
		ArrayList<String> amis = new ArrayList<String>();
		ArrayList<Integer> ages = new ArrayList<Integer>();
		//IO.println("Entering the try block...");
		
		try {
			//IO.println("Creating the Scanner...");
			Scanner s = new Scanner(f);
			while (s.hasNext() == true) {
				//IO.println("inside the while loop...");
				String friend = s.next();
				int age = s.nextInt();
				// IO.println(friend + "'s favourite class is CS202");
				amis.add(friend);
				ages.add(age);
			}
			//IO.println("below the while loop...");
			s.close();
		} catch (FileNotFoundException e) {
			//IO.println("Inside the catch block...");
			IO.println("Could not open " + filename);
		}
		//IO.println("Sorting the names...");
		//Collections.sort(amis);
		
		for (int i=0; i<amis.size(); i++) {
			String name = amis.get(i);
			int age = ages.get(i);
			if (name.equals("Fequil")) {
				continue;
			}
			IO.println(name + " is " + age + " years old.");
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		//Your custom rendering code here
	}

	public static void main(String[] args) {
		var window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(400,400);
		window.setContentPane(new FileExample());
		window.setVisible(true);
	}
}