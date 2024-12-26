package pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import attacks.*;

public class Kirilia extends Pokemon {
    public Kirilia(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(38, 35, 35, 65, 55, 50);
        setMove(new WillOWisp(), new ThunderWave(), new Hypnosis());
    }
}
