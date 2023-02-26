package main.pokemons;
import main.moves.*;
import ru.ifmo.se.pokemon.*;

public class Rufflet extends Pokemon {
    public Rufflet(String name, int level) {
        super(name, level);
        setType(Type.FLYING, Type.NORMAL);
        setStats(70, 83, 50, 37, 50, 60);
        setMove(new BraveBird(), new AerialAce(), new Slash());
    }
}
