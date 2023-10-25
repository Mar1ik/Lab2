package Attack.PhysicalMove;

import ru.ifmo.se.pokemon.*;

import java.time.format.SignStyle;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(){
        super(Type.GROUND,60,100);
    }
    protected void applyOppDamage(Pokemon def, double damage) {
        def.setMod(Stat.HP, (int)Math.round(damage));
    }
    @Override
    protected String describe(){
        return "бульдозит оппонента";
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPEED, -1);
    }
}
