package main.moves;
import ru.ifmo.se.pokemon.*;

public class SuperPower extends PhysicalMove {
    public SuperPower() {
        super(Type.FIGHTING, 120, 100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, -1);
        p.setMod(Stat.ATTACK, -1);
    }
    @Override
    protected String describe() {
        return "attacks with superpower";
    }
}
