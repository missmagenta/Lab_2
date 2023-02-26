package main.moves;
import ru.ifmo.se.pokemon.*;

public class HydroPump extends SpecialMove {
    public HydroPump(){
        super(Type.WATER, 110, 80);
    }
    @Override
    protected String describe() {
    return "blasts out a huge volume of water at high power";
    }
}
