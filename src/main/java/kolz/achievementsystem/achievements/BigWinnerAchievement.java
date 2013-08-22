/*
 * A player earns the Big Winner achievement if he/she has over 200 wins
 */

package kolz.achievementsystem.achievements;

import kolz.achievementsystem.player.Player;

/**
 *
 * @author kolz
 */
public class BigWinnerAchievement implements Achievement {

    private String name;

    public BigWinnerAchievement() {
        this.name = "Big Winner";
    }

    @Override
    public String getName() {
       return this.name;
    }

    @Override
    public boolean hasAchieved(Player player) {
        if(player.getHistoricalStats().getWins() > 200) {
            return true;
        }
        return false;
    }

}
