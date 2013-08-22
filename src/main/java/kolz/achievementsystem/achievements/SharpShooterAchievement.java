/*
 * A player earns the Sharp Shooter achievement if he/she hits 75% or more attacks
 */

package kolz.achievementsystem.achievements;

import kolz.achievementsystem.player.Player;
import kolz.achievementsystem.stats.GameStats;

/**
 *
 * @author kolz
 */
public class SharpShooterAchievement implements Achievement{

    private String name;
    
    public SharpShooterAchievement() {
        this.name = "Sharp Shooter";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean hasAchieved(Player player) {
        GameStats stats = player.getGameStats();
        if(stats.getAttacks() > 0) {
            if(((double)stats.getHits() / stats.getAttacks()) >= .75) {
                return true;
            }
        }
        return false;
    }
    
}
