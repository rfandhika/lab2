package lab2.pokemons;

import lab2.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Zweilous extends Deino {
    public Zweilous (String name, int level){
        super(name, level);

        setType(Type.DARK, Type.DRAGON);

        setStats(75, 85,70, 65,70,58);

        setMove(new Headbutt(), new Crunch(), new DoubleHit());
    }
}
