package main.moves;
import ru.ifmo.se.pokemon.*;

public class BraveBird extends PhysicalMove {
    public BraveBird() {
        super(Type.FLYING, 120, 100);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int)Math.round(damage/3));
    }
    @Override
    protected String describe() {
        return "attacks and receives recoil damage";
    }
}
