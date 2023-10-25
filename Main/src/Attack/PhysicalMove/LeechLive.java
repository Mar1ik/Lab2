package Attack.PhysicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

import java.util.SplittableRandom;

public class LeechLive extends PhysicalMove {
    public LeechLive() {
        super(Type.BUG, 80, 100);

    }

    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int) Math.round(damage));
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.HP, -2);

    }

    @Override
    protected String describe() {
        return "Высасывает жизнь";
    }
}
