package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class Crunch extends PhysicalMove {
    public Crunch() {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.20) { // 20% chance to lower DEF
            p.addEffect(new Effect().stat(Stat.DEFENSE, -1));
        }
    }

    @Override
    protected String describe() {
        return "откусывать с хрустом";
    }
}