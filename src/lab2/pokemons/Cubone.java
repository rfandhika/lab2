package lab2.pokemons;

import lab2.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Cubone extends Pokemon {
    public Cubone(String name, int level) {
        super(name, level);
        setType(Type.GROUND);

        setStats(50,50,95,40,50,35);

        setMove(new FocusEnergy(), new IceBeam(), new Leer());
    }
}
