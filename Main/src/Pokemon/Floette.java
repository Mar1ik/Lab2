package Pokemon;

import Attack.PhysicalMove.FairyWind;
import Attack.PhysicalMove.petal_blizzard;
import Attack.StatusMove.Psychic;
import ru.ifmo.se.pokemon.Type;

public class Floette extends Flabebe{
    public Floette(String name, int level ){
        super(name, level);
        setStats(54,45,47,75,98,52);
        setType(Type.FAIRY);
        addMove(new FairyWind());
    }
}
