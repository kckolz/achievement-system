/*
 * A player earns the Bruiser achievement if he/she does over 500 damage in one game
 */

package kolz.achievementsystem.achievements;

import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class BruiserAchievement implements Achievement{

    private String name;

    public BruiserAchievement() {
        this.name = "Bruiser";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean hasAchieved(Player player) {
        if(player.getGameStats().getDamage() > 500) {
            return true;
        }
        return false;
    }

}
