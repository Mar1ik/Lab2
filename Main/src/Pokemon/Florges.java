package Pokemon;

import Attack.PhysicalMove.FairyWind;
import Attack.PhysicalMove.petal_blizzard;
import Attack.StatusMove.Psychic;
import Attack.StatusMove.Swagger;
import ru.ifmo.se.pokemon.Type;

public class Florges extends Floette{
    public Florges(String name, int level) {
        super(name, level);
        setStats(78,65,68,112,154,75);
        setType(Type.FAIRY);
        setMove(new Psychic(), new petal_blizzard(), new FairyWind(), new Swagger());
    }
}
