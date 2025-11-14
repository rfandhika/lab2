package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class Leer extends StatusMove {
    public Leer() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.DEFENSE, -1)); // Turunkan defense
    }

    @Override
    protected String describe() {
        return "пристально глядя с хитрой ухмылкой, чтобы ослабить защиту противника";
    }
}