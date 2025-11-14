package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class Swagger extends StatusMove {
    public Swagger() {
        // Tipe, power, accuracy
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().stat(Stat.ATTACK, +2);
        p.addEffect(e);


        Effect.confuse(p);
    }

    @Override
    protected String describe() {
        return "провоцируя оппонентов своей развязностью";
    }
}