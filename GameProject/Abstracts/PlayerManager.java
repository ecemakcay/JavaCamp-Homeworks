package JavaKamp.GameProject.Abstracts;

import JavaKamp.GameProject.Concrete.PlayerCheckManager;
import JavaKamp.GameProject.Entities.Player;

import java.util.Scanner;

public class PlayerManager implements PlayerService {

    PlayerCheckManager playerCheckManager;

    public PlayerManager() {
    }

    public PlayerManager(PlayerCheckManager playerCheckManager) {
        this.playerCheckManager = playerCheckManager;

    }

    @Override
    public void add(Player player)  {

        System.out.println(player.getFirstName() + " isimli kullanıcı kayıt başarılı");
    }

    @Override
    public void delete(Player player) {

        System.out.println(player.getFirstName() + " isimli kullanıcı silinmiştir");
    }

    @Override
    public void update(Player player) {
        Scanner scn = new Scanner(System.in);
        String newName = scn.nextLine();
        player.setFirstName(newName);

        String newLastName = scn.nextLine();
        player.setLastName(newLastName);

        int newBirth = scn.nextInt();
        player.setDateOfBirth(newBirth);
    }
}
