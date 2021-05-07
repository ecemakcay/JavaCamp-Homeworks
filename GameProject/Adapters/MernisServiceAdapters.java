package JavaKamp.GameProject.Adapters;

import JavaKamp.GameProject.Abstracts.PlayerCheckService;
import JavaKamp.GameProject.Entities.Player;

public class MernisServiceAdapters implements PlayerCheckService {

    @Override
    public boolean checkIfRealPerson(Player player)  {

        return  true;
    }
}
