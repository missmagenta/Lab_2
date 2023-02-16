package main.moves;
import  ru.ifmo.se.pokemon.*;

/**
 * Power is doubled if the user is burned, paralyzed, poisoned
 */

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    private boolean flag;
    protected void applyOppDamage(Pokemon def, double damage) {
        Status state = def.getCondition();
        flag = true;
        if (state == Status.BURN || state == Status.PARALYZE || state == Status.POISON) {
            def.setMod(Stat.HP, 2 * (int) Math.round(damage));
        }
    }
    protected String describe() {
        if (flag) return "damages with double power";
        else return "damages";
    }
}
