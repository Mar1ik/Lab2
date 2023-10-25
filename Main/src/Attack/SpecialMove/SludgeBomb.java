package Attack.SpecialMove;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb(){
        super(Type.POISON,90,100);

    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<=0.33){
            Effect.poison(p);
        }
    }
    @Override
    protected String describe(){
        return "Использует грязную бомбу, отравляя противника";
    }
}
