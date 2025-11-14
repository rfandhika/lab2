package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class Extrasensory extends SpecialMove {
    public Extrasensory() {
        // Type, Power, Accuracy
        super(Type.PSYCHIC, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // 10% kemungkinan membuat lawan flinch (tidak bisa bergerak sementara)
        if (Math.random() < 0.10) {
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe() {
        return "использование ментальных способностей с помощью экстрасенсорики";
    }
}