package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class Headbutt extends PhysicalMove {
    public Headbutt() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.30) { // 30% flinch chance
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "меньерудук лаван денган Получил удар головой";
    }
}
