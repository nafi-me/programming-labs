package attacks;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Hypnosis extends StatusMove {
    public Hypnosis() { super(Type.PSYCHIC, 0, 60); }
    @Override protected void applyOppEffects(Pokemon p) {
        Effect.sleep(p);
    }
    @Override protected String describe() { return "uses Hypnosis"; }
}
