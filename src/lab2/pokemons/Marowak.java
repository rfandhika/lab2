package lab2.pokemons;

import lab2.attacks.*;
import ru.ifmo.se.pokemon.*;

public final class Marowak extends Cubone {
    public Marowak(String name, int level){
        super(name, level);

        setType(Type.GROUND);

        setStats(60,80,110,50,80,45);

        setMove(new FocusBlast());

    }
}
