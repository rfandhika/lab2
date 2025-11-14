package lab2;

import lab2.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class BattleLaunch {
    public static void main(String[] args) {
        Battle b = new Battle();

        Pokemon t = new Tornadus("Tornadus", 50);
        Pokemon c = new Cubone("Cubone", 25);
        Pokemon m = new Marowak("Marowak", 45);

        Pokemon d = new Deino("Deino", 25);
        Pokemon z = new Zweilous("Zweilous", 45);
        Pokemon h = new Hydreigon("Hydreigon", 65);

        b.addAlly(t);
        b.addAlly(c);
        b.addAlly(m);

        b.addFoe(d);
        b.addFoe(z);
        b.addFoe(h);


        b.go();
    }
}


