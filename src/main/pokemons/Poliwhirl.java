package main.pokemons;
import main.moves.*;
import ru.ifmo.se.pokemon.*;

public class Poliwhirl extends Poliwag {
    public Poliwhirl(String name, int level) {
        super(name, level);
        setType(Type.WATER);
        setStats(65, 65, 65, 50, 50, 90);
        setMove(new Swagger(), new Waterfall(), new HydroPump());
    }
}
