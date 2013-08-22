/*
 * A player earns the Quitter achievement if he/she leaves over 25% of games
 */

package kolz.achievementsystem.achievements;

import kolz.achievementsystem.player.Player;
import kolz.achievementsystem.stats.HistoricalStats;

/**
 *
 * @author kolz
 */
public class QuitterAchievement implements Achievement {

    private String name;

    public QuitterAchievement() {
        this.name = "Quitter";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean hasAchieved(Player player) {
        HistoricalStats stats = player.getHistoricalStats();
        if(stats.getGamesPlayed() > 0) {
            if(((double)stats.getGamesLeft() / stats.getGamesPlayed()) > .25) {
                return true;
            }
        }
        return false;
    }

}
