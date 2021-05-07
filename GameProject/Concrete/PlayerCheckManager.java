package JavaKamp.GameProject.Concrete;

import JavaKamp.GameProject.Adapters.MernisServiceAdapters;
import JavaKamp.GameProject.Entities.Player;

public class PlayerCheckManager extends MernisServiceAdapters {

    @Override
    public boolean checkIfRealPerson(Player player)  {
         return super.checkIfRealPerson(player);

    }
}
