public class Pichu extends Pokemon {
    
    //initializer block for all 3 constructors to call
    {
        setPicture("pichu.png");
    }

    
    public Pichu(String n) {
        super(n, 20);
    }

    public Pichu() {
        super("Generic Pichu", 20);
    }

    public Pichu(String n, int h) {
        super(n, h);
    }

    @Override
    public String greeting() {
        return "I am a Pichu! Fear my electric tail!";
    }
}
