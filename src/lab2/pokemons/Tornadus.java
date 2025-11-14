package lab2.pokemons;

import lab2.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Tornadus extends Pokemon {
    public Tornadus(String name, int level) {
        super (name, level);
        setType(Type.FLYING);

        setStats(79, 115, 70, 125, 80, 11);

        setMove(new AerialAce(), new Swagger(), new FocusBlast(), new Extrasensory());
    }
}