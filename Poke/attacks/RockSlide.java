package attacks;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class RockSlide extends PhysicalMove {
    public RockSlide() { super(Type.ROCK, 75, 90); }
    @Override protected String describe() { return "uses Rock Slide"; }
}

