package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;

public class Lickilicky extends Pokemon {
    public Lickilicky(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(110, 85, 95, 80, 95, 50);
        setMove(new RockSlide(), new BrutalSwing(), new DreamEater(), new FocusBlast());
    }
}
