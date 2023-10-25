package Attack.StatusMove;

import ru.ifmo.se.pokemon.*;

public class COnfide extends StatusMove {
    public COnfide(){
        super(Type.NORMAL,0, 0);
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        def.setMod(Stat.SPECIAL_ATTACK,-1);
    }
}
