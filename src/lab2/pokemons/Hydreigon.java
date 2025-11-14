package lab2.pokemons;

import lab2.attacks.*;
import ru.ifmo.se.pokemon.*;

public class Hydreigon extends Zweilous {
    public Hydreigon(String name, int level){
        super(name, level);

        setType(Type.DARK, Type.DRAGON);
        setStats(92, 102, 90, 125, 90, 98);
        setMove(new Headbutt(), new Crunch(), new DoubleHit(), new StoneEdge());
    }
}
