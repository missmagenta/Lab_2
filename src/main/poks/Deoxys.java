package main.poks;
import main.moves.*;
import ru.ifmo.se.pokemon.*;

public class Deoxys extends Pokemon {
    public Deoxys(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(50, 150, 50, 150, 50, 150);
        setMove(new Facade(), new IceBeam(), new ZenHeadbutt(), new FocusBlast());
    }
}