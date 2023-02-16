package main.moves;
import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 100);
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2)
            Effect.flinch(p);
    }
    protected String describe() {
        return "causes the target to flinch";
    }
}
