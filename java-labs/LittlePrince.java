import java.awt.*;

public class LittlePrince {
    private Point location;
    private Color clothing;
    private boolean hasSheep;

    public LittlePrince() {
        location = new Point();
        clothing = Color.GREEN;
        hasSheep = false;
    }    
    
    public LittlePrince(int x, int y) {
        location = new Point(x,y);
        clothing = Color.GREEN;
        hasSheep = false;
    }

    public void talk() {

    }

    public void move() {

    }

    public void draw(Graphics g) {
        //draw the head
		g.setColor(new Color(153,118,88));
		g.fillOval(175+location.x, 100+location.y, 50, 50);
		
		//draw the body/outfit
		g.setColor(clothing);
		g.fillRect(175+location.x, 150+location.y, 50, 75);
		g.fillRect(175+location.x, 225+location.y, 20, 60);
		g.fillRect(205+location.x, 225+location.y, 20, 60);
    }

}
