package Attack.PhysicalMove;

import ru.ifmo.se.pokemon.*;

public class petal_blizzard extends PhysicalMove {
      public petal_blizzard(){
          super(Type.GRASS,90,100);

      }
      @Override
    protected String describe(){
          return "Напускает порыв лепестков";
      }
}
