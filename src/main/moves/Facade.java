package main.moves;
import  ru.ifmo.se.pokemon.*;

/**
 * Power is doubled if the user is burned, paralyzed, poisoned
 */

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    private boolean special;
    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        Status state = def.getCondition();
        special = true;
        if (state == Status.BURN || state == Status.PARALYZE || state == Status.POISON) {
            def.setMod(Stat.HP, 2 * (int) Math.round(damage));
        }
    }
    @Override
    protected String describe() {
        if (special) return "damages with double power";
        else return "damages";
    }
}
