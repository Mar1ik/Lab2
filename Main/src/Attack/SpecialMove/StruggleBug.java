package Attack.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class StruggleBug extends PhysicalMove {
    public StruggleBug(){
        super(Type.BUG,50,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ATTACK, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "Находит ошибку в технике противника и использует ее";
    }
}
