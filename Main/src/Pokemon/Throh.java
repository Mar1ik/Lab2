package Pokemon;

import Attack.PhysicalMove.Bulldoze;
import Attack.PhysicalMove.RockSlide;
import Attack.StatusMove.COnfide;
import Attack.StatusMove.FocusEnergy;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Throh extends Pokemon {
    public Throh(String name, int level) {
        super(name, level);
        setStats(120, 100, 85, 30, 85, 45);
        setType(Type.FIGHTING);
        setMove(new Bulldoze(), new COnfide(), new FocusEnergy(), new RockSlide());
    }
}
