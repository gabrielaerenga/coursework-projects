import java.awt.*;

public class LemonadeStand {

    //fields
    private Point pos;
    private Color signColor;
    private Color textColor;

    //constructor
    public LemonadeStand() {
        pos = new Point(100, 100);
        signColor = Color.ORANGE;
        textColor = Color.BLUE;
    }

    //overloaded constructor with position
    public LemonadeStand(int x, int y) {
        pos = new Point(x, y);
        signColor = Color.YELLOW;
        textColor = Color.BLACK;
    }

    //sets text color
    public void setTextColor(Color c) {
        textColor = c;
    }

    //sets stand top color
    public void setSignColor(Color c) {
        signColor = c;
    }

    //draw lemonade stand
    public void draw(Graphics g) {
        
        int x = pos.x;
        int y = pos.y;

        // stand bottom
		g.setColor(Color.GRAY);
		g.fillRect(x, y + 130,200,90);
		
		// stand top
		g.setColor(signColor);
		g.fillRect(x, y,200,80);
		
		// stand supports
		g.setColor(Color.RED);
		g.fillRect(x + 20, y + 80,10,50);
		g.fillRect(x + 170, y + 80,10,50);
		
		// lettering
		g.setColor(textColor);

		// G
		g.drawLine(x + 40, y +10, x + 40, y + 60); // left line
		g.drawLine(x + 40, y + 10, x + 90, y + 10); // top line
		g.drawLine(x + 40, y + 60, x + 90, y + 60); // bottom line
		g.drawLine(x + 90, y + 40, x + 90, y + 60); // right right line
		g.drawLine(x + 70, y + 40, x + 90, y +40); // middle line

		// A
		g.drawLine(x + 120, y + 60, x + 145, y + 10); // left line
		g.drawLine(x + 145, y + 10, x + 170, y + 60); // right line
		g.drawLine(x + 130, y + 40, x + 160, y + 40); // middle line
		
		// text
		g.drawString("Fruit Punch: $2",x + 70,y + 75);
		
		// fruit punch merchandise
		g.setColor(Color.PINK);
		g.fillRect(x + 100, y + 110,10,20);
		g.fillRect(x + 115, y + 110,10,20);
		g.fillRect(x + 130, y + 110,10,20);
    }



}