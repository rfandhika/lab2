package lab2.attacks;

import ru.ifmo.se.pokemon.*;

public final class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def) {
        if (Math.random() < 1.0/ 8.0){
            return 1.5;
        }
        return 1.0;
        // Stone Edge punya critical hit chance lebih tinggi

    }

    @Override
    protected String describe() {
        return "атакуйте острым каменным лезвием";
    }
}