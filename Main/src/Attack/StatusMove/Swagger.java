package Attack.StatusMove;

import ru.ifmo.se.pokemon.*;

public class Swagger extends SpecialMove {
    public Swagger(){
        super(Type.NORMAL,0,85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, +2);
        p.confuse();

    }
    @Override
    protected String describe(){
        return "Повышает атаку противника и путает его";
    }
}
