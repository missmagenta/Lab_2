package main.moves;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).turns(-1).stat(Stat.SPECIAL_DEFENSE, -1));
    }
    protected String describe() {
        return "attacks from a distance";
    }
}
