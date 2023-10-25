package Attack.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() <= 0.3) {
            Effect.paralyze(def);
        }
    }
}
