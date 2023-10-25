package Attack.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class Peregar extends PhysicalMove {
    public Peregar(){
        super(Type.NORMAL,60,95);
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        Effect e = new Effect().chance(0.9);
        e.burn(pokemon);
    }
    @Override
    protected String describe(){
        return "Михалыч выплескивает на вас всю силу своего перегара ";
    }
}
