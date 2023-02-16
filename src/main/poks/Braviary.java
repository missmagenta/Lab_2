package main.poks;
import main.moves.*;
import ru.ifmo.se.pokemon.*;

public class Braviary extends Rufflet {
    public Braviary(String name, int level) {
        super(name, level);
        setType(Type.FLYING, Type.NORMAL);
        setStats(100, 123, 75, 57, 75, 80);
        setMove(new BraveBird(), new AerialAce(), new Slash(), new SuperPower());
    }
}