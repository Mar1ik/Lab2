package Attack.StatusMove;

import ru.ifmo.se.pokemon.*;

public class SandAttack extends StatusMove {
    public SandAttack(){
        super(Type.GROUND,0,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect e = new Effect().stat(Stat.ACCURACY, -1);
        p.addEffect(e);
    }
    @Override
    protected String describe(){
        return "Вызывает шквал ветра, ухудшая видимость оппонента";
    }
}
