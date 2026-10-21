public class Bulbasaur extends Pokemon {
    
    public Bulbasaur() {
        super("Bulbasaur", 39);
        setPicture("bulbasaur.png");
    }

    @Override
    public String greeting() {
        return "I'm a Bulbasaur and I carry an onion on my back.";
    }
}
