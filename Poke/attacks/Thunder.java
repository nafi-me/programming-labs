package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends SpecialMove {
    public Thunder() { super(Type.ELECTRIC, 110, 70); }
    @Override protected String describe() { return "uses Thunder"; }
}