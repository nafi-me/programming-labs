// Import necessary classes from the provided JAR
import pokemons.*;
import attacks.*;
import ru.ifmo.se.pokemon.*;

// Main Class
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon raikou = new Raikou("Raikou", 10);
        Pokemon lickitung = new Lickitung("Lickitung", 10);
        Pokemon lickilicky = new Lickilicky("Lickilicky", 10);
        Pokemon ralts = new Ralts("Ralts", 50);
        Pokemon kirlia = new Kirilia("Kirlia", 10);
        Pokemon gallade = new Gallade("Gallade", 10);
        b.addAlly(raikou);
        b.addAlly(lickitung);
        b.addAlly(lickilicky);
        b.addFoe(ralts);
        b.addFoe(kirlia);
        b.addFoe(gallade);
        b.go();
    }
}
