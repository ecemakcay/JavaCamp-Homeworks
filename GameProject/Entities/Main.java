package JavaKamp.GameProject.Entities;

import JavaKamp.GameProject.Abstracts.PlayerManager;
import JavaKamp.GameProject.Concrete.CampaignManager;
import JavaKamp.GameProject.Concrete.GameManager;

public class Main {

    public static void main(String[] args) throws Exception {
        Player ecem = new Player("44444444","Ecem","Akçay",2000);
        Player engin = new Player("5555555","Engin","Demiroğ",1986);

        PlayerManager playerManager = new PlayerManager();

        playerManager.add(ecem);
        playerManager.add(engin);
        playerManager.delete(engin);

        Game forest = new Game(1, "The Forest",32.00);

        GameManager gameManager = new GameManager();
        gameManager.gameSale(forest,ecem);

        Campaign blackfriday = new Campaign(12,"Black Friday");

        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(blackfriday);





    }

}
