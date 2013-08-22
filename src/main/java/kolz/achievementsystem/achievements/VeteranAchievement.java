/*
 * A player earns the Veteran achievement if he/she has played over 1000 games
 */

package kolz.achievementsystem.achievements;

import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class VeteranAchievement implements Achievement{

    private String name;

    public VeteranAchievement() {
        this.name = "Veteran";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean hasAchieved(Player player) {
        if(player.getHistoricalStats().getGamesPlayed() > 1000) {
            return true;
        }
        return false;
    }

}
