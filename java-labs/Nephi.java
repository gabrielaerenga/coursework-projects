import javax.swing.*;

public class Nephi extends Sprite {

    //fields for img of nephi with sword and if true
    private boolean hasSword;
    private ImageIcon normalIcon;
    private ImageIcon armedIcon;
    
    //constructor with reset settings
    public Nephi() {
        super();
        normalIcon = new ImageIcon("nephi.png");
        armedIcon = new ImageIcon("armednephi.png");
        
        //what would be the reset();
        /*image = normalIcon;
        hasSword = false;*/
        reset();
    }

    //method for when player moves nephi over sword
    public void pickUpSword() {
        hasSword = true;
        image = armedIcon;
    }

    //store value of hasSword
    public boolean isArmed() {
        return hasSword;
    }

    //reset for new game
    public void reset() {
        image = normalIcon;
        hasSword = false;
    }
}
