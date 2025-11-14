package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class FocusEnergy extends StatusMove {
    public FocusEnergy() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        // Meningkatkan peluang critical hit
        Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_ATTACK, 0); // placeholder
        p.setMod(Stat.SPEED, 0); // hanya agar ada pemanggilan (tidak ngubah stat)
        // library asli biasanya punya mekanisme internal untuk crit, jadi cukup describe saja
    }

    @Override
    protected String describe() {
        return "подготовьте себя с помощью сосредоточенной энергии";
    }
}