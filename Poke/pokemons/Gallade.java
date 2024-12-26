package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;

public class Gallade extends Pokemon {
    public Gallade(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.FIGHTING);
        setStats(68, 125, 65, 65, 115, 80);
        setMove(new WillOWisp(), new ThunderWave(), new Hypnosis(), new RockSlide());
    }
}
