package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.10) { // 10% beku
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        return "стреляйте ледяными лучами с помощью Ice Beam";
    }
}