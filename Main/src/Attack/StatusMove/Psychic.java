package Attack.StatusMove;
import ru.ifmo.se.pokemon.*;

public class Psychic extends StatusMove {
    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.10);
        Effect stat = e.stat(Stat.SPECIAL_DEFENSE, -1);
    }
    @Override
    protected String describe(){
        return "Накладывает психоз";
    }
}
