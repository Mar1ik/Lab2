package Pokemon;

import Attack.PhysicalMove.Peregar;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mihalych extends Pokemon {
    public Mihalych(String name, int level){
        super(name,level);
        setStats(30,60,70,61,79,42);
        setType(Type.NORMAL);
        setMove(new Peregar());
    }
}
