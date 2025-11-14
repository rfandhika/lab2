package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class FocusBlast extends SpecialMove {
    public FocusBlast() {
        // Type, Power, Accuracy
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        // 10% kemungkinan menurunkan Special Defense musuh (-1 level)
        if (Math.random() < 0.10) {
            p.addEffect(new Effect().stat(Stat.SPECIAL_DEFENSE, -1));
        }
    }

    @Override
    protected String describe() {
        return "дайте волю мощному взрыву концентрации!";
    }
}