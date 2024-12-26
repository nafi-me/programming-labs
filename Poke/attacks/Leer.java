package attacks;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Leer extends StatusMove {
    public Leer() { super(Type.NORMAL, 0, 100); }
    @Override protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
    }
    @Override protected String describe() { return "uses Leer"; }
}