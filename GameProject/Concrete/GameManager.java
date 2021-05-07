package JavaKamp.GameProject.Concrete;

import JavaKamp.GameProject.Abstracts.GameService;
import JavaKamp.GameProject.Entities.Game;
import JavaKamp.GameProject.Entities.Player;

public class GameManager implements GameService {

    @Override
    public void gameSale(Game game, Player player) {

        System.out.println(game.getGameName() + " isimli oyun" +
                player.getFirstName() + player.getLastName() +
                " tarafından satın alınmıştır.");

    }
}
