package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;

public class Lickitung extends Pokemon {
    public Lickitung(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(90, 55, 75, 60, 75, 30);
        setMove(new RockSlide(), new BrutalSwing(), new DreamEater());
    }
}