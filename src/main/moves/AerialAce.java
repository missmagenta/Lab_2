package main.moves;
import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove{
    public AerialAce() {
        super(Type.FLYING, 60, Double.POSITIVE_INFINITY);
    }
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }
    protected String describe() {
        return "confuses the opponent with speed, then strikes";
    }
}
