package JavaKamp.GameProject.Abstracts;

import JavaKamp.GameProject.Entities.Player;

public interface PlayerService {
    void add(Player player) throws Exception;
    void delete(Player player);
    void update(Player player);

}
