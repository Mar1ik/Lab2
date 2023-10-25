package Attack.PhysicalMove;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FairyWind extends PhysicalMove {
    public FairyWind(){
        super(Type.FAIRY,40,100);
    }
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int)Math.round(damage));
    }
    @Override
    protected String describe(){
        return "Обрушивает сказочный ветер на своего оппонента";
    }
}
