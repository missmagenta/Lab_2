package main.moves;
import ru.ifmo.se.pokemon.*;

public class ZenHeadbutt extends PhysicalMove {
    public ZenHeadbutt() {
        super(Type.PSYCHIC, 80, 90);
    }
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2)
            Effect.flinch(p);
    }
    protected String describe() {
        return "causes the target to flinch";
    }
}
