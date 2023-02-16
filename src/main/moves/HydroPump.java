package main.moves;
import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove {
    public HydroPump(){
        super(Type.WATER, 110, 80);
    }
    protected void applyOppDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int)Math.round(damage));
    }
    protected String describe() {
    return "blasts out a huge volume of water at high power";
    }
}
