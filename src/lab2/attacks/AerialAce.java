package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60, 0);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected String describe() {
        return "использование Aerial Ace (никогда не промахивается)";
    }
}
