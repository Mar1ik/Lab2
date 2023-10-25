package Pokemon;

import Attack.SpecialMove.SludgeBomb;
import ru.ifmo.se.pokemon.Type;

public class Golisopod extends Wimpod{
    public Golisopod(String name, int level){
        super(name, level);
        setStats(75,125,140,60,90,40);
        setType(Type.BUG,Type.WATER);
        addMove(new SludgeBomb());
    }
}
