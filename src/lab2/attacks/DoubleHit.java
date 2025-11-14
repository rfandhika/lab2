package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class DoubleHit extends PhysicalMove {
    public DoubleHit() {
        super(Type.NORMAL, 35, 90);
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        // Serangan dua kali
        super.applyOppDamage(def, damage);
        super.applyOppDamage(def, damage);
    }

    @Override
    protected String describe() {
        return "атакуйте дважды двойным ударом";
    }
}