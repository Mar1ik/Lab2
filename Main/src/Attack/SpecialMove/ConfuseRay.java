package Attack.SpecialMove;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends SpecialMove {
    public ConfuseRay(){
        super(Type.GHOST,0,100);

    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect e = new Effect().chance(0.5);
        e.confuse(pokemon);
    }
    @Override
    protected String describe(){
        return  "Сбивает с толку оппонента";
    }

}
