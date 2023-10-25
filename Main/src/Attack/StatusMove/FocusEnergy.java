package Attack.StatusMove;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class FocusEnergy extends StatusMove {
    public FocusEnergy(){
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK, +1);
    }
}
