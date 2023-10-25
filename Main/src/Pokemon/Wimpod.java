package Pokemon;

import Attack.PhysicalMove.LeechLive;
import Attack.SpecialMove.StruggleBug;
import Attack.StatusMove.SandAttack;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Wimpod extends Pokemon {
    public Wimpod(String name, int level) {
        super(name, level);
        setStats(25, 35, 40, 20, 30, 80);
        setType(Type.BUG, Type.WATER);
        setMove(new SandAttack(), new StruggleBug(), new LeechLive());
    }
}
