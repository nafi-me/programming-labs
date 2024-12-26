package attacks;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends SpecialMove {
    public FocusBlast() { super(Type.FIGHTING, 120, 70); }
    @Override protected String describe() { return "uses Focus Blast"; }
}
