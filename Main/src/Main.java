
import ru.ifmo.se.pokemon.Battle;
import Pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Florges("Florges", 2));
        b.addAlly(new Flabebe("Flabebe", 2));
        b.addAlly(new Floette("Floette", 2));
        b.addFoe(new Wimpod("Wimpod", 1));
        b.addFoe(new Golisopod("Golisopod", 3));
        b.addFoe(new Throh("Throh", 4));
        b.go();
    }
}