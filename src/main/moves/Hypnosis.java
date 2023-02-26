package main.moves;
import ru.ifmo.se.pokemon.*;

public class Hypnosis extends StatusMove {
    public Hypnosis() {
        super(Type.PSYCHIC, 0, 60);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).condition(Status.SLEEP));
    }
    @Override
    protected String describe() {
        return "puts the target to sleep";
    }

}
