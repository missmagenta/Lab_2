package main.pokemons;
import main.moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl {
    public Poliwrath(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(90, 95, 95, 70, 90, 70);
        setMove(new Swagger(), new Waterfall(), new HydroPump(), new Hypnosis());
    }
}
