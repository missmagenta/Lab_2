package main.moves;
import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove {
    public Slash() {
        super(Type.NORMAL, 70, 100);
    }

    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (att.getStat(Stat.SPEED) * 3 / 512.0 > Math.random()) {
            return 2.0;
        } else {
            return 1.0;
        }
    }
    protected String describe() {
        return "attacks with an increased critical hit";
    }
}

