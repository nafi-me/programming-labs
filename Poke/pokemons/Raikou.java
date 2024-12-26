package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;

// Define Raikou Class
public class Raikou extends Pokemon {
    public Raikou(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(90, 85, 75, 115, 100, 115);
        setMove(new Bulldoze(), new Confide(), new Leer(), new Thunder());
    }
}