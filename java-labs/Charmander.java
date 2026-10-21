public class Charmander extends Pokemon {

    {
        setPicture("charmander.png");
    }

    public Charmander(String nom) {
        super(nom, 39);
    }

    public Charmander() {
        super("Generic Charmander", 20);
    }

    public Charmander(String n, int h) {
        super(n, h);
    }

    @Override
    public String greeting() {
        return "Fear this Charmander! I got a flaming tail!.";
    }
}
